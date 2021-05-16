package business.concretes;

import business.abstracts.SaleService;
import dataAccess.abstracts.SaleDao;
import entities.concretes.Campaign;
import entities.concretes.Game;
import entities.concretes.Sale;
import entities.concretes.User;

public class SaleManager implements SaleService {

    private SaleDao saleDao;

    public SaleManager(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    @Override
    public void CampaignSale(Campaign campaign, User user, Sale sale, Game game) {
        CalcCampaign(campaign, game);
        System.out.println("Kullanıcı: " + user.getId() + "  oyun adı: " + game.getGameName() + " indirim adı: "
                + campaign.getDiscountName() + " oranı " + campaign.getDiscount() + "% ile fiyatı "
                + game.getAfterDiscountPrice());
        saleDao.add(sale);
    }

    @Override
    public void Sale(User user, Game game, Sale sale) {

        System.out.println(
                "Kullanıcı: " + user.getId() + "  oyun adı: " + game.getGameName() + " fiyatı " + game.getPrice());
        saleDao.add(sale);
    }

    private void CalcCampaign(Campaign campaign, Game game) {

        double calc = game.getPrice() - (game.getPrice() * (campaign.getDiscount() / 100));
        game.setAfterDiscountPrice(calc);
    }
}