package restaurante.Entidades;

import javax.swing.JOptionPane;
import restaurante.accesoData.ProductoData;

public class Producto {

    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;
    private boolean estado;

    public Producto() {
    }

    public Producto(String nombre, double precio, int stock, boolean estado) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(int idProducto, String nombre, double precio, int stock, boolean estado) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", producto=" + nombre + ", precio=" + precio + ", stock=" + stock + ", estado=" + estado + '}';
    }

    public void restarStock(int cantidad) {
        ProductoData a = new ProductoData();
        if (stock - cantidad >= 0) {

            setStock(stock - cantidad);
            a.modificarProducto(this);

            if (stock <= 5) {
                JOptionPane.showMessageDialog(null, "<html> Reponga el Stock de " + nombre.toUpperCase() + ". <br> Cantidad: " + stock + " </html>");
            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay Stock suficiente de " + nombre.toUpperCase() + " para realizar ese pedido ");
        }
    }

    public void cargarStock(int cantidad) {
        ProductoData a = new ProductoData();

        setStock(stock + cantidad);
        a.modificarProducto(this);
        JOptionPane.showMessageDialog(null, "Stock de "+nombre.toUpperCase()+" : "+getStock());
    }

}
