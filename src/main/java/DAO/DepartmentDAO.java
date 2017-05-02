package DAO;

import javax.activation.DataSource;
import java.util.List;

/**
 * Created by linhtran on 28/04/2017.
 */
public interface DepartmentDAO {
    Boolean insert(Department department);
    int  getCount();
    List<Department> getAlls();

}
