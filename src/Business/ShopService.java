package Business;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface ShopService {
    void Buy(Gamer gamer, Game game, Campaign campaign);
}
