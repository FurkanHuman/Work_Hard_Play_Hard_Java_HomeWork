package Business.Abstrack;

import java.util.List;

import Entities.User;

public interface UserService {
    public void add(User user);

    public void update(User user);

    public void delete(User user);

    public User get(User user);

    List<User> getAll();
}
