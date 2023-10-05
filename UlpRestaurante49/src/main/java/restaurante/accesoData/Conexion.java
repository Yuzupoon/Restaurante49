
package restaurante.accesoData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/";
    private static final String DB = "restaurante";
    private static final String USUARIO = "root";
    private static final String PASSWORD = "";

    private static Connection connection;

    private Conexion() {
    }

    public static Connection getConexion() {

        if (connection == null) {

            try {
                Class.forName("org.mariadb.jdbc.Driver");

                connection = DriverManager.getConnection(URL + DB, USUARIO, PASSWORD);

            } catch (ClassNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Debe agregar un driver");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "No se pudo conectar a la base de datos");

            }
        }
        return connection;
    }
}