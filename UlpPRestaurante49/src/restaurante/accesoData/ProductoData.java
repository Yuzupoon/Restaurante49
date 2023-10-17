/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurante.accesoData;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import restaurante.Entidades.Producto;
import restaurante.Entidades.ProductoXPedido;

public class ProductoData {

    Connection conexion = null;

    public ProductoData() {
        conexion = Conexion.getConexion();
    }

    //CAMBIO IMPORTANTE CAMBIO EN LA BASE DE DATOS EN PRODUCTO A CANTIDAD POR STOCK
    public void crearProducto(Producto producto) {

        String sql = "INSERT INTO producto(nombre, precio, stock, estado) " + "VALUES (?,?,?,?)";

        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setBoolean(4, producto.isEstado());
            ps.executeUpdate();
            ResultSet resultado = ps.getGeneratedKeys();
            if (resultado.next()) {
                producto.setIdProducto(resultado.getInt(1));
                JOptionPane.showMessageDialog(null, "Producto añadido con exito");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error al acceder a la tabla PRODUCTO", 0);
        }
    }

//    public void modificarProducto(Producto producto) {
//        try {
//            String sql = "UPDATE `producto` SET `nombre`= ? ,`stock`= ? ,`precio`= ? ,`estado`= ? WHERE `idProducto`= ? ";
//            ProductoXPedido can = new ProductoXPedido();
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            ps.setString(1, producto.getNombre());
//            if (producto.getStock() - can.getCantidad() >= 0) {
//                
//                ps.setInt(2, (producto.getStock() - can.getCantidad()));
//            }
//            if (producto.getStock() <= 5) {
//                JOptionPane.showMessageDialog(null, "<html> Reponga el Stock de " + producto.getNombre().toUpperCase() + ". <br> Cantidad: " + producto.getStock() + " </html>");
//
//            } else {
//                JOptionPane.showMessageDialog(null, "No hay Stock suficiente de " + producto.getNombre().toUpperCase() + " para realizar ese pedido ");
//            }
//            ps.setDouble(3, producto.getPrecio());
//            ps.setBoolean(4, producto.isEstado());
//            ps.setInt(5, producto.getIdProducto());
//
//            int exito = ps.executeUpdate();
//            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
//            } else {
//                JOptionPane.showMessageDialog(null, "El Producto no existe");
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto " + ex.getMessage());
//        }
//    }

        public void modificarProducto(Producto producto) {
        try {
            String sql = "UPDATE `producto` SET `nombre`= ? ,`stock`= ? ,`precio`= ? ,`estado`= ? WHERE `idProducto`= ? ";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setInt(2, producto.getStock());
            ps.setDouble(3, producto.getPrecio());
            ps.setBoolean(4, producto.isEstado());
            ps.setInt(5, producto.getIdProducto());
           
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Producto no existe");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto " + ex.getMessage());
        }
    }
        
    public void eliminarProducto(int idProducto) {
        try {
            String sql = "DELETE FROM `producto` WHERE idProducto = ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idProducto);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se elimino exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Producto con ID: " + idProducto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto " + ex.getMessage());
        }
    }

    public List<Producto> listaProductos() {
        List<Producto> listaProductos = new ArrayList<>();
        try {

            String sql = "SELECT * FROM `producto`";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();

                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                listaProductos.add(producto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto " + ex.getMessage());
        }
        return listaProductos;
    }

    public void cambiarEstadoProductoFalse(int idProducto) {
        try {
            String sql = "UPDATE `producto` SET  `estado`= false  WHERE  `idProducto`= ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idProducto);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se cambio el estado a false exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Producto con ID: " + idProducto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto " + ex.getMessage());
        }
    }

    public void cambiarEstadoProductoTrue(int idProducto) {
        try {
            String sql = "UPDATE `producto` SET  `estado`= true  WHERE  `idProducto`= ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idProducto);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Se cambio el estado a true exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No existe Producto con ID: " + idProducto);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto " + ex.getMessage());
        }
    }

    public Producto buscarProductoId(int idProducto) {
        Producto producto = new Producto();
        try {

            String sql = "SELECT * FROM `producto` WHERE `idProducto`= ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, idProducto);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto " + ex.getMessage());
        }
        return producto;
    }
    
       public Producto buscarProductoPorNombre(String pro) {
        Producto producto = new Producto();
        try {

            String sql = "SELECT * FROM `producto` WHERE `nombre`= ?";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, pro);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto " + ex.getMessage());
        }
        return producto;
    }
}
