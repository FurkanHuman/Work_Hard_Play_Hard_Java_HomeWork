package dataAccess.concretes.inMemory;

import java.util.ArrayList;
import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class inMemoryUser implements UserDao {

    List<User> users = new ArrayList<>();

    @Override
    public void add(User user) {
        users.add(user);

    }

    @Override
    public void delete(User user) {
        User tUser = get(user.getId());
        users.remove(tUser);

    }

    @Override
    public void update(User user) {
        User tUser = get(user.getId());
        tUser.setFirstName(user.getFirstName());
        tUser.setLastName(user.getLastName());
        tUser.setEmail(user.getEmail());
        tUser.setPassword(user.getPassword());
    }

    @Override
    public User get(int id) {
        for (User user : users)
            if (user.getId() == id)
                return user;
        return null;
    }

    @Override
    public User getEmail(String email) {
        for (User user : users)
            if (user.getEmail().equals(email))
                return user;
        return null;
    }

    @Override
    public List<User> getAll() {
        return users;
    }

}
