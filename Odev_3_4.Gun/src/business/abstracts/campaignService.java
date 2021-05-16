package business.abstracts;

import entities.concretes.Campaign;

public interface campaignService {
    void add(Campaign campaign);

    void delete(Campaign campaign);

    void update(Campaign campaign);

    void list(Campaign[] campaigns);
}
