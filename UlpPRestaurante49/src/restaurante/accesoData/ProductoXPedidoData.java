/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.accesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante.Entidades.Producto;
import restaurante.Entidades.ProductoXPedido;


public class ProductoXPedidoData {   
    Connection conexion = null;
    ProductoData produ = new ProductoData();
    public ProductoXPedidoData() {
        conexion = Conexion.getConexion();
    }
    
    public void crearPedidoDeProducto(int idProducto, int idPedido, int cantidad){
        try {
            String sql="INSERT INTO `productoxpedido`(`idProducto`, `idPedido`, `cantidad`) VALUES (?,?,?)";
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ps.setInt(2, idPedido);
            ps.setInt(3, cantidad);
            int exito=ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "Producto añadido al Pedido");
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla Producto X Pedido", 0);
        }        
    }
    
    public List<ProductoXPedido> MostrarProductos(int idPedido){
       List<ProductoXPedido> ListaProducto = new ArrayList<>();
        try {            
           
            String sql="SELECT `idProducto`, `cantidad` FROM `productoxpedido` WHERE idPedido=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {                
                ProductoXPedido productoXPedido = new ProductoXPedido();
                ProductoData productoData= new ProductoData();
                PedidoData pedidoData =new PedidoData();
                
                productoXPedido.setProducto(productoData.buscarProductoId(rs.getInt("idProducto")));
                productoXPedido.setPedido(pedidoData.buscarPedidoID(idPedido));
                productoXPedido.setCantidad(rs.getInt("cantidad"));
                ListaProducto.add(productoXPedido);
            }
            ps.close();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla ProductoXPedido");
        }
        return ListaProducto;
    }
    
   
    
    
}
