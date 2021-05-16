package dataAccess.concretes;

import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class HibernateGameDao implements GameDao {

    @Override
    public void add(Game game) {
        System.out.println(game.getGameName() + " Adlı Oyun Eklendi");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName() + " Adlı Oyun Silindi");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName() + " Adlı Oyun Güncellendi");
    }

    @Override
    public void list(Game[] games) {
        for (Game game : games) {
            System.out.println(game.getGameName());
        }
    }
}
