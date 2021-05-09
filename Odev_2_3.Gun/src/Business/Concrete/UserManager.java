package Business.Concrete;

import java.util.ArrayList;
import java.util.List;

import Business.Abstracts.UserService;
import Entities.User;

public class UserManager implements UserService {

    List<User> userAll = new ArrayList<>();

    @Override
    public void add(User user) {
        System.out.println("ID: " + user.getId() + " Ad�: " + user.getName() + " Soyad�: " + user.getSurname()
                + " kullan�c� eklendi");
        userAll.add(user);
    }

    @Override
    public void update(User user) {
        System.out.println("ID: " + user.getId() + " Ad�: " + user.getName() + " Soyad�: " + user.getSurname()
                + " kullan�c� g�ncellendi");
    }

    @Override
    public void delete(User user) {
        System.out.println("ID: " + user.getId() + " Ad�: " + user.getName() + " Soyad�: " + user.getSurname()
                + " kullan�c� silindi");
    }

    @Override
    public User get(User user) {
        return userAll.get(user.getId());
    }

    @Override
    public List<User> getAll() {
        return userAll;
    }
}
