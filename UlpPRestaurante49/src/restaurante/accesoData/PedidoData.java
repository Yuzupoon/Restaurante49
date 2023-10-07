/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.accesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante.Entidades.Pedido;


public class PedidoData {
    Connection conexion = null;
    
    public PedidoData() {
        conexion = Conexion.getConexion();
    }
    
    
    public Pedido buscarPedidoID(int idPedido){
        Pedido pedido =new Pedido();
        try {
            String sql="SELECT * FROM `pedido` WHERE idPedido=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {   
                MesaData mesaData=new MesaData();
                MeseroData meseroData = new MeseroData();
                
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
}
