import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entites.Department;
import model.entites.Seller;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Department teste = new Department(2,"Books");

        Seller sellerTeste = new Seller(21,"Bob","bog@gmail.com",new Date(),1500.0,teste);
        System.out.println(teste);
        System.out.println(sellerTeste);


        SellerDao sellerDao = DaoFactory.createSellerDao();


    }
}