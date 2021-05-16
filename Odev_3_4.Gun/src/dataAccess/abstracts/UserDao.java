package dataAccess.abstracts;

import entities.concretes.User;

public interface UserDao {

    public void add(User user);

    public void delete(User user);

    public void update(User user);

    public void list(User[] users);
}
