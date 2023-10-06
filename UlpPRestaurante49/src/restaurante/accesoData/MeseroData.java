
package restaurante.accesoData;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Entidades.Mesero;
import restaurante.Entidades.Producto;


public class MeseroData {
    
    Connection conexion = null;
    
    public MeseroData() {
        conexion = Conexion.getConexion();
    }
    
    public void crearMesero(Mesero mesero) {

        String sql = "INSERT INTO mesero(nombre, usuario, contraseña) " + "VALUES (?,?,?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql, java.sql.Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getUsuario());
            ps.setString(3, mesero.getContraseña());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                mesero.setIdMesero(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Mesero añadido con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla MESERO", 0);
        }
    }
    
    public List<Mesero> listaMesero() {
      List<Mesero> listaMeseros = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM `mesero`";
          try (PreparedStatement ps = conexion.prepareStatement(sql)) {
              ResultSet rs = ps.executeQuery();
              while (rs.next()) {
                  Mesero mesero = new Mesero();
                  
                  mesero.setIdMesero(rs.getInt("idMesero"));
                  mesero.setNombre(rs.getString("nombre"));
                  mesero.setUsuario(rs.getString("usuario"));
                  mesero.setContraseña(rs.getString("contraseña"));
                  listaMeseros.add(mesero);
              }
          }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + ex.getMessage());
        }
        return listaMeseros;
    }
    
    public void modificarMesero(Mesero mesero) {
        try {
            String sql = "UPDATE `mesero` SET `nombre`= ? ,`usuario`= ? ,`contraseña`= ? WHERE `idMesero`= ? ";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, mesero.getNombre());
            ps.setString(2, mesero.getUsuario());
            ps.setString(3, mesero.getContraseña());
            ps.setInt(4, mesero.getIdMesero());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Mesero no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + ex.getMessage());
        }
    }
    
     public void eliminarMesero(int idMesero) {
        try {
            String sql = "DELETE FROM `mesero` WHERE idMesero = ?";
            try (PreparedStatement ps = conexion.prepareStatement(sql)) {
                ps.setInt(1, idMesero);
                int exito = ps.executeUpdate();
                if (exito == 1) {
                    JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
                } else {
                    JOptionPane.showMessageDialog(null, "No existe Mesero con ID: " + idMesero);
                }
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + ex.getMessage());
        }
    }
     
      public Mesero buscarMeseroPorId(int idMesero) {
       Mesero mesero = new Mesero();
        try {
          
            String sql = "SELECT * FROM `mesero` WHERE `idMesero`= ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idMesero);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                mesero.setIdMesero(rs.getInt("idMesero"));
                mesero.setNombre(rs.getString("nombre"));
                mesero.setUsuario(rs.getString("Usuario"));
                mesero.setContraseña(rs.getString("contraseña"));
            }
        ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Mesero " + ex.getMessage());
        }
        return mesero;       
    }
}
