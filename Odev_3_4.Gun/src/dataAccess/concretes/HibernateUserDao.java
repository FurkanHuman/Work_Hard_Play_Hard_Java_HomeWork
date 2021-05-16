package dataAccess.concretes;

import dataAccess.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao {

    @Override
    public void add(User user) {
        System.out.println(user.getName() + " adlı kişi eklendi");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getnId() + " nolu kişi silindi");
    }

    @Override
    public void update(User user) {

        System.out.println(user.getnId() + " nolu kişi güncellendi");
    }

    @Override
    public void list(User[] users) {
        for (User user : users) {
            System.out.println(user.getName());
        }
    }
}