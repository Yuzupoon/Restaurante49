package restaurante.accesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;
import restaurante.Entidades.Mesa;

public class MesaData {

    Connection conexion = null;

    public MesaData() {
        conexion = Conexion.getConexion();
    }

//    public void crearMesa(Mesa mesa) {
//        try {
//            String sql = "INSERT INTO mesa(idMesa,idReserva,capacidad, estado) VALUES ('?','?','?','?')";
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            ps.setInt(1, mesa.getIdMesa());
//            ps.setInt(2, mesa.getReserva().getIdReserva());
//            ps.setInt(3, mesa.getCapacidad());
//            ps.setBoolean(4, mesa.isEstado());
//            ps.executeUpdate();
////            ResultSet resultado = ps.getGeneratedKeys();
////            if (resultado.next()) {
////                mesa.setIdMesa(resultado.getInt(1));
////                JOptionPane.showMessageDialog(null, "Mesa añadida con exito");
////            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla Mesa", 0);
//        }
//    }
    public void crearMesa(Mesa mesa) {
        try {
            String sql = "INSERT INTO mesa(idMesa,idReserva,capacidad, estado) VALUES (?,?,?,?)";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, mesa.getIdMesa());
            ps.setInt(2, mesa.getReserva().getIdReserva());
            ps.setInt(3, mesa.getCapacidad());
            ps.setBoolean(4, mesa.isEstado());
            int com = ps.executeUpdate();
//            if (com == 1) {
//                JOptionPane.showMessageDialog(null, "Mesa añadida con exito");
//            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla Mesa", 0);
        }
    }

    public void armarMesa(int idMesa, int idReserva) {
        try {
        String sql = "UPDATE `mesa` SET `idReserva`=?  WHERE `idMesa`=? AND `estado`= 1";
        PreparedStatement ps = conexion.prepareStatement(sql);

            ps.setInt(1, idReserva);
            ps.setInt(2, idMesa);
            int lleno = ps.executeUpdate();
            System.out.println(lleno);
            if(lleno == 1 ){
                JOptionPane.showMessageDialog(null,"La mesa se ocupo para esta Reserva");
            }else{
                JOptionPane.showMessageDialog(null, "La mesa que quiere ocupar esta ocupada");
            }
            ps.close();
            ocuparMesa(idMesa);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla Mesa", 0);
        }
        
    }

    public void ocuparMesa(int id) {
        try {
            String sql = "UPDATE Mesa SET estado = 0 WHERE idMesa = ? ";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Se cambio el estado de la mesa correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de Datos");
        }

    }

    public void liberarMesa(int id) {
        try {
            String sql = "UPDATE Mesa SET estado = 1 WHERE idMesa = ? ";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            if (fila == 1) {

                JOptionPane.showMessageDialog(null, "Se cambio el estado de la mesa correctamente");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la base de Datos");
        }

    }
}
