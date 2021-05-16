package business.concretes;

import business.abstracts.campaignService;
import dataAccess.abstracts.CampaignDao;
import entities.concretes.Campaign;

public class CampaignManager implements campaignService {

    private CampaignDao campaignDao;

    public CampaignManager(CampaignDao campaignDao) {
        this.campaignDao = campaignDao;
    }

    @Override
    public void add(Campaign campaign) {
        campaignDao.add(campaign);
    }

    @Override
    public void delete(Campaign campaign) {
        campaignDao.delete(campaign);
    }

    @Override
    public void update(Campaign campaign) {
        campaignDao.update(campaign);
    }

    @Override
    public void list(Campaign[] campaigns) {
        campaignDao.list(campaigns);
    }
}
