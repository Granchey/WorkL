package dao;

import models.Employee;
import org.jdbi.v3.sqlobject.config.RegisterConstructorMapper;
import org.jdbi.v3.sqlobject.customizer.Bind;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface UserDao {

    @SqlQuery("SELECT * FROM users WHERE first_name= :firstName")
    @RegisterConstructorMapper(Employee.class)
    Employee findEmployeeByFirstName(@Bind("firstName") String firstName);
}
