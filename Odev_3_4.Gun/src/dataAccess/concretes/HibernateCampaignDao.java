package dataAccess.concretes;

import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class HibernateCampaignDao implements CampaignDao {

    @Override
    public void add(Campaign campaign) {
        System.out.println("Kampanya " + campaign.getDiscountName() + " eklendi");
    }

    @Override
    public void delete(Campaign campaign) {
        System.out.println("Kampanya " + campaign.getDiscountName() + " silindi");
    }

    @Override
    public void update(Campaign campaign) {
        System.out.println("Kampanya " + campaign.getDiscountName() + " güncellendi");
    }

    @Override
    public void list(Campaign[] campaigns) {
        for (Campaign campaign : campaigns) {
            System.out.println(campaign.getDiscountName());
        }
    }
}
