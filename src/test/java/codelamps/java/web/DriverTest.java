package codelamps.java.web;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DriverTest {

    @Test
    void testRegister() {


        try {

            // MEMBUAT DRIVER
            Driver mysqlDriver = new Driver();

            // MENDAFTARKAN DRIVER KE JDBC
            DriverManager.registerDriver(mysqlDriver);

        } catch (SQLException exception) {
            Assertions.fail(exception);
        }
    }
}
