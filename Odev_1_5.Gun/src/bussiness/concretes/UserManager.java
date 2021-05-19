package bussiness.concretes;

import java.util.List;
import java.util.regex.Pattern;

import bussiness.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

    private final UserDao userDao;

    private static final String email_pattern = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2})?$";

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        if (isUserValidate(user) && getByMail(user.getEmail()) == null) {
            System.out.println("User Added");
            userDao.add(user);
            return;
        }
        System.out.println("User Not Added");
    }

    @Override
    public User getByUser(int id) {
        return userDao.get(id);
    }

    @Override
    public User getByMail(String email) {

        return userDao.getEmail(email);
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    private boolean isUserValidate(User user) {
        Pattern pattern = Pattern.compile(email_pattern, Pattern.CASE_INSENSITIVE);
        return pattern.matcher(user.getEmail()).find() && user.getPassword().length() > 6
                && user.getFirstName().length() > 2 && user.getLastName().length() > 2;
    }
}
