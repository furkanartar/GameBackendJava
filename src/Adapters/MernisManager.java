package Adapters;

import Entities.Gamer;

public class MernisManager implements MernisService{
    @Override
    public boolean Auth(Gamer gamer) {
        if (gamer.getNationalityId().isEmpty() && gamer.getFirstName().isEmpty() && gamer.getLastName().isEmpty())
        {
            System.out.println(gamer.getFirstName() + "adlı kullanıcı doğrulandı.");
            return true;
        }
        System.out.println(gamer.getFirstName() + "adlı kullanıcı doğrulanamadı.");
        return false;
    }
}
