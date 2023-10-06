/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.accesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Entidades.Reserva;

/**
 *
 * @author angel
 */
public class ReservaData {

    Connection conexion = null;

    public ReservaData() {
        conexion = Conexion.getConexion();
    }

    public void crearReserva(Reserva reserva) {

        String sql = "INSERT INTO `reserva`(`nombre`, `apellido`, `dni`, `fecha`, `hora`, `cantPersonas`, `estado`) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, reserva.getNombre());
            ps.setString(2, reserva.getApellido());
            ps.setInt(3, reserva.getDni());
            ps.setDate(4, Date.valueOf(reserva.getFecha()));
            ps.setTime(5, reserva.getHora());
            ps.setInt(6, reserva.getCantidadPersonas());
            ps.setBoolean(7, reserva.isEstado());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                reserva.setIdReserva(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Reserva añadida con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla reserva", 0);
        }
    }

    public void modificarReserva(Reserva reserva) {
        try {
            String sql = "UPDATE `reserva` SET`nombre`= ? ,`apellido`= ?,`dni`= ? ,`fecha`= ?,`hora`= ?,`cantPersonas`= ? ,`estado`= ? WHERE  `idReserva`= ? ";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, reserva.getNombre());
            ps.setString(2, reserva.getApellido());
            ps.setInt(3, reserva.getDni());
            ps.setDate(4, Date.valueOf(reserva.getFecha()));
            ps.setTime(5, reserva.getHora());
            ps.setInt(6, reserva.getCantidadPersonas());
            ps.setBoolean(7, reserva.isEstado());
            ps.setInt(8, reserva.getIdReserva());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El reserva no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla reserva " + ex.getMessage());
        }
    }

    public void eliminarReserva(int idReserva) {
        try {
            String sql = "DELETE FROM `reserva` WHERE idReserva = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idReserva);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino exitosamente la Reserva");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Reserva con ID: " + idReserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva " + ex.getMessage());
        }
    }
    
       public List<Reserva> listaReservas() {
      List<Reserva> listaReservas = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM `reserva`";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva reserva = new Reserva();
                
                reserva.setIdReserva(rs.getInt("idreserva"));
                reserva.setNombre(rs.getString("nombre"));
                reserva.setApellido(rs.getString("apellido"));
                reserva.setDni(rs.getInt("dni"));
                reserva.setFecha(rs.getDate("fecha").toLocalDate());
                reserva.setHora(rs.getTime("hora"));
                reserva.setCantidadPersonas(rs.getInt("cantPersonas"));
                reserva.setEstado(rs.getBoolean("estado"));
                listaReservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva " + ex.getMessage());
        }
        return listaReservas;
    }
       
          public List<Reserva> listaReservasXFecha(LocalDate fecha) {
      List<Reserva> listaReservas = new ArrayList<>();
        try {
            
            String sql = "SELECT * FROM `reserva` WHERE fecha = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(fecha));
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Reserva reserva = new Reserva();
                
                reserva.setIdReserva(rs.getInt("idreserva"));
                reserva.setNombre(rs.getString("nombre"));
                reserva.setApellido(rs.getString("apellido"));
                reserva.setDni(rs.getInt("dni"));
                reserva.setFecha(rs.getDate("fecha").toLocalDate());
                reserva.setHora(rs.getTime("hora"));
                reserva.setCantidadPersonas(rs.getInt("cantPersonas"));
                reserva.setEstado(rs.getBoolean("estado"));
                listaReservas.add(reserva);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Reserva " + ex.getMessage());
        }
        return listaReservas;
    }
    
}
