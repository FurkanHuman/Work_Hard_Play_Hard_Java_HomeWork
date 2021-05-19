package dataAccess.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserDao {
    void add(User user);

    void delete(User user);

    void update(User user);

    User get(int id);

    User getEmail(String email);

    List<User> getAll();
}
