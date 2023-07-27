package model.dao;

import db.DB;
import model.daoImpl.DepartmentDaoJDBC;
import model.daoImpl.SellerDaoJDBC;

import java.sql.Connection;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
    public static DepartmentDao createDepartmentDao(){
        return new DepartmentDaoJDBC(DB.getConnection());
    }
}
