package model.dao;

import model.entites.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj,Integer idDepartmentUpdate);
    void deleteById(Integer idDepartmentDelleted);
    Department findById(Integer id);
    List<Department> findAll();
}
