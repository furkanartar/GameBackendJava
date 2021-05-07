package Business;

import Entities.Campaign;
import Entities.Gamer;

public interface CampaignService {
    void Add(Campaign campaign);
    void Delete(Campaign campaign);
    void Update(Campaign campaign);
}
