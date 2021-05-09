package dataAccess.abstracts;

import java.util.List;

import entities.concretes.Campaign;

public interface CampaignDao {
    public void add(Campaign campaign);

    public void delete(Campaign campaign);

    public void update(Campaign campaign);

    List<Campaign> get(int id);

    List<Campaign> getAll();

}
