package Main;

import mypackage.BanqueWS;
import mypackage.Compte;
import mypackage.ServiceBanque;

import java.util.List;

public class clientWs {
    public static void main(String[] args) {
        ServiceBanque proxy=new BanqueWS().getServiceBanquePort();
        System.out.println(proxy.conversionEuroToDH(100));
        Compte compte=proxy.getCompte(9);
        System.out.println("------------------");
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());
        List<Compte> compteList=proxy.compteList();
        compteList.forEach(c->{
            System.out.println("************");
            System.out.println(c.getCode());
            System.out.println(c.getSolde());
        });
    }
}
