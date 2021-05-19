package dataAccess.concretes;

import java.util.List;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println("Added User : " + user.getFirstName() + " " + user.getLastName());

    }

    @Override
    public void delete(User user) {
        System.out.println("Deleted User : " + user.getFirstName() + " " + user.getLastName());

    }

    @Override
    public void update(User user) {
        System.out.println("Updated User : " + user.getFirstName() + " " + user.getLastName());

    }

    @Override
    public User get(int id) {
        return null;
    }

    @Override
    public User getEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return null;
    }

}
