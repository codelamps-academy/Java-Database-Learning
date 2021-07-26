package codelamps.java.web;

import com.mysql.cj.jdbc.Driver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

    static void beforeAll() {
        try {
            // MEMBUAT DRIVER
            Driver mysqlDriver = new Driver();
            // MENDAFTARKAN DRIVER
            DriverManager.registerDriver(mysqlDriver);
        } catch (SQLException e) {
            Assertions.fail(e);
        }
    }


    @Test
    void testConnection() {

        // MEMBUAT URL, USERNAME, PASSWORD
        String jdbcUrl = "jdbc:mysql://localhost:3306/produk";
        String username = "root";
        String password = "C0NV3RS1ON";

        // MEMBUAT CONNECTION
        try {
            Connection connection = DriverManager.getConnection(jdbcUrl,username,password);
            System.out.println("Koneksi Berhasil");
        } catch (SQLException e){
            Assertions.fail(e);
        }
    }
}
