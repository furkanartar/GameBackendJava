import Business.ShopManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Gamer gamer = new Gamer(1, "Furkan", "ARTAR", "123456",
                "12345678910", new Date(15-4-2021));
        Game game = new Game(1, "Metin2", 100);
        Campaign campaign = new Campaign(1, "Yaz indirimi", 50);

        ShopManager shopManager = new ShopManager();
        shopManager.Buy(gamer, game, campaign);
    }
}
