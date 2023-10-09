
package restaurante.accesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

import restaurante.Entidades.Pedido;

public class PedidoData {

    Connection conexion = null;
    Pedido pedido = new Pedido();
    MesaData mesaData = new MesaData();
    MeseroData meseroData = new MeseroData();


    public PedidoData() {
        conexion = Conexion.getConexion();
    }

    public Pedido buscarPedidoID(int idPedido) {

        try {
            String sql = "SELECT * FROM `pedido` WHERE idPedido=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                pedido.setIdPedido(idPedido);
                pedido.setMesa(mesaData.buscarMesaID(rs.getInt("idMesa")));
                pedido.setMesero(meseroData.buscarMeseroPorId(rs.getInt("idMesero")));
                pedido.setEstado(rs.getString("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al entrar a la tabla Pedido");
        }
        return pedido;
    }

    public Pedido crearPedido(int idMesa, int idMesero, String Estado) {
        String sql = "INSERT INTO pedido(idMesa, idMesero, estado) " + "VALUES (?,?,?)";
        Pedido pedi = new Pedido();
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, mesaData.buscarMesaID(idMesa).getIdMesa());
            ps.setInt(2, meseroData.buscarMeseroPorId(idMesero).getIdMesero());
            ps.setString(3, pedi.getEstado() + "");
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                pedi.setIdPedido(pedi.getIdPedido());
                JOptionPane.showMessageDialog(null, "El Pedido se añadio con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla Pedido", 0);
        }
        return pedi;
    }

    public Pedido modificarPedido(Pedido pedido) {
        String sql = "UPDATE `pedido` SET `idMesa`=?,`idMesero`=?,`estado`=? WHERE idPedido = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, pedido.getMesa().getIdMesa());
            ps.setInt(2, pedido.getMesero().getIdMesero());
            ps.setString(3, pedido.getEstado());
            ps.setInt(4, pedido.getIdPedido());

            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Pedido no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla Pedido", 0);

        }
        return pedido;
    }

    public void eliminarPedido(Pedido pedido) {

        String sql = "DELETE FROM `pedido` WHERE idPedido = ?";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setInt(1, pedido.getIdPedido());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Pedido con ID: " + pedido.getIdPedido());
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido " + ex.getMessage());
        }
    }

    public void cambiarEstado(Pedido peido) {
        String sql = "UPDATE `pedido` SET `estado`= ? WHERE idPedido = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, pedido.getEstado());
            ps.setInt(2, pedido.getIdPedido());
            int correcto = ps.executeUpdate();
            if (correcto == 1) {
                JOptionPane.showMessageDialog(null, "Se Cambio el estado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido cambiar el estado del pedido");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Pedido " + ex.getMessage());
        }
    }

    public List<Pedido> listadePedidos() {
        List<Pedido> listado = new ArrayList<>();
        String sql = "SELECT * FROM `pedido`";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Pedido pedi = new Pedido();
                pedi.setIdPedido(rs.getInt("idPedido"));
                pedi.setMesa(mesaData.buscarMesaID(rs.getInt("idMesa")));
                pedi.setMesero(meseroData.buscarMeseroPorId(rs.getInt("idMesero")));
                pedi.setEstado(rs.getString("estado"));
                listado.add(pedi);

            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(PedidoData.class.getName()).log(Level.SEVERE, null, ex);
        }

        return listado;
    }
}
