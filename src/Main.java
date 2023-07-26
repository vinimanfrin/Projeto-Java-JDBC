import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.daoImpl.SellerDaoJDBC;
import model.entites.Department;
import model.entites.Seller;

import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("=== TEST 1: seller findById ===");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n=== TEST 2: findByDepartment ===");
        Department department = new Department(2,null);
        List<Seller> list = SellerDaoJDBC.findByDepartment(department);
        for (Seller obj : list) {
            System.out.println(seller);
        }


    }
}