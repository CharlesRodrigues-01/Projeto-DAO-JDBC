
package model.dao;

import java.util.List;
import model.entities.Department;

public interface DepartmentDAO {
    
    void insert (Department obj);
    void upadate (Department obj);
    void deleteById (Integer id);
    Department findById(Integer id);
    List <Department> findAll();
}

