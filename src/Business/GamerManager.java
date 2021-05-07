package Business;

import Entities.Gamer;

public class GamerManager implements GamerService{
    @Override
    public void Add(Gamer gamer) {
        System.out.println(gamer.getFirstName() + "adlı kullanıcı başarıyla eklendi.");
    }

    @Override
    public void Delete(Gamer gamer) {
        System.out.println(gamer.getFirstName() + "adlı kullanıcı başarıyla silindi.");
    }

    @Override
    public void Update(Gamer gamer) {
        System.out.println(gamer.getFirstName() + "adlı kullanıcı başarıyla güncellendi.");
    }
}
