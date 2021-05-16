package business.concretes;

import business.abstracts.GameService;
import dataAccess.abstracts.GameDao;
import entities.concretes.Game;

public class GameManager implements GameService {
    private GameDao gameDao;

    public GameManager(GameDao gameDao) {
        this.gameDao = gameDao;
    }

    @Override
    public void add(Game game) {
        gameDao.add(game);
    }

    @Override
    public void delete(Game game) {
        gameDao.delete(game);
    }

    @Override
    public void update(Game game) {
        gameDao.update(game);

    }

    @Override
    public void list(Game[] games) {
        gameDao.list(games);
    }

}
