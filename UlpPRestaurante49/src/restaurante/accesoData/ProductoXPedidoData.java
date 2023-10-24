
package restaurante.accesoData;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import restaurante.Entidades.Producto;
import restaurante.Entidades.ProductoXPedido;


public class ProductoXPedidoData {   
    Connection conexion = null;
    ProductoData produ = new ProductoData();
    Producto producto = new Producto();
    public ProductoXPedidoData() {
        conexion = Conexion.getConexion();
    }
    
    public void crearPedidoDeProducto( int idPedido, String producto, int cantidad){
        try {
            String sql="INSERT INTO `productoxpedido`(`idPedido`, `producto`, `cantidad`) VALUES (?,?,?)";
            PreparedStatement ps=conexion.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ps.setString(2, producto);
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
           
            String sql="SELECT `producto`, `cantidad` FROM `productoxpedido` WHERE idPedido=?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idPedido);
            ResultSet rs= ps.executeQuery();
            while (rs.next()) {                
                ProductoXPedido productoXPedido = new ProductoXPedido();
                ProductoData productoData= new ProductoData();
                PedidoData pedidoData =new PedidoData();
                
                productoXPedido.setProducto(productoData.buscarProductoPorNombre(rs.getString("producto")));
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
    
      public void eliminarProductoxPedido(String producto) {
        try {
            String sql = "DELETE FROM `productoxpedido` WHERE producto = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, producto);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Producto: " + producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto " + ex.getMessage());
        }
    }
   
    
    
}
