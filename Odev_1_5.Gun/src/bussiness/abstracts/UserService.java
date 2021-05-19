package bussiness.abstracts;

import java.util.List;

import entities.concretes.User;

public interface UserService {
    void add(User user);

    User getByUser(int id);

    User getByMail(String email);

    List<User> getAll();
}
