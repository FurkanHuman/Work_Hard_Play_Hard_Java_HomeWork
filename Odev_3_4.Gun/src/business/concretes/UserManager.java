package business.concretes;

import business.abstracts.UserService;
import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

    private UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add(User user) {
        validate(user);
    }

    @Override
    public void delete(User user) {
        userDao.delete(user);
    }

    @Override
    public void update(User user) {
        validate(user);
    }

    @Override
    public void list(User[] users) {
        userDao.list(users);
    }

    private void validate(User user) {
        if (user.getnId().length() != 11 && (Long.parseLong(user.getnId()) % 2) != 0 && !user.isReal()) {
            System.out.println("Kişi doğrulanmadı");
            return;
        }

        user.setReal(true);
        System.out.println("Kişi doğrulandı");
        userDao.add(user);
    }
}
