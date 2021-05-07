package Business;

import Entities.Campaign;

public class CampaignManager implements CampaignService{
    @Override
    public void Add(Campaign campaign) {
        System.out.println(campaign.getName() + "adlı kampanya başarıyla eklendi.");
    }

    @Override
    public void Delete(Campaign campaign) {
        System.out.println(campaign.getName() + "adlı kampanya başarıyla silindi.");
    }

    @Override
    public void Update(Campaign campaign) {
        System.out.println(campaign.getName() + "adlı kampanya başarıyla güncellendi.");
    }
}
