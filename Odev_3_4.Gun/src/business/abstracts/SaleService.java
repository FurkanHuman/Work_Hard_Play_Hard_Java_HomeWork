package business.abstracts;

import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Sale;
import entities.concretes.User;

public interface SaleService {

    void CampaignSale(Campaign campaign, User user, Sale sale, Game game);

    void Sale(User user, Game game, Sale sale);

}
