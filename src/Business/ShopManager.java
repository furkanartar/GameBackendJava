package Business;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public class ShopManager implements ShopService{
    @Override
    public void Buy(Gamer gamer, Game game, Campaign campaign) {
        float price = game.getUnitPrice() / 100 * campaign.getDiscountRate();
        System.out.println(gamer.getFirstName() + " adlı kullanıcı " + game.getName() +
                " adlı oyunu " + price + " TL'ye satın aldı!");
    }
}
