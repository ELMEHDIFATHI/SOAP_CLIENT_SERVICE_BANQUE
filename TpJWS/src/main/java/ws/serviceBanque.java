package ws;

import Model.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

//POJO OLD JAVA OBJECT
@WebService(serviceName = "BanqueWS")
public class serviceBanque {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt){
        return  mt*10.6;
    }


    @WebMethod
    public Compte getCompte(@WebParam(name = "code") int code){
        return new Compte(code,Math.random()*900,new Date());
    }

    @WebMethod
    public List<Compte> compteList(){
        return  List.of(
               new Compte(1,Math.random()*900,new Date()),
               new Compte(2,Math.random()*900,new Date()),
                new Compte(3,Math.random()*900,new Date())
        );
    }
}
