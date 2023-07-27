import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.dao.SellerDao;
import model.daoImpl.DepartmentDaoJDBC;
import model.daoImpl.SellerDaoJDBC;
import model.entites.Department;
import model.entites.Seller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();



        Department depTeste = new Department(null,"Comida");
//        departmentDao.insert(depTeste);

        Department dep = new Department(6,"Pet");
//        departmentDao.update(dep,16);

//        departmentDao.deleteById(7);

//        Department departmentTeste =  departmentDao.findById(8);
//        System.out.println(departmentTeste);
        List<Department> listTeste = departmentDao.findAll();
        System.out.println(listTeste);








        SellerDao sellerDao = DaoFactory.createSellerDao();
        //sellerDao.deleteById(10); // teste seller deleteById

        //Seller sellerTeste = new Seller(9,"Samara","samara@gmail.com", new Date(),4000.0,dep);

        //sellerDao.update(sellerTeste,9); // teste seller update

    }
}