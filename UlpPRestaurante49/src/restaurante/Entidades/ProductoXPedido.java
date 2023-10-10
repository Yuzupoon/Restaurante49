
package restaurante.Entidades;

public class ProductoXPedido {
  
    private Producto producto;
    private Pedido pedido;
    private int cantidad; 

    public ProductoXPedido() {
    }

    public ProductoXPedido(Producto producto, Pedido pedido, int cantidad) {
        this.producto = producto;
        this.pedido = pedido;
        this.cantidad = cantidad;
    }

    public ProductoXPedido(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    

    @Override
    public String toString() {
        return "ProductoXPedido{" + "producto=" + producto + ", pedido=" + pedido + ", cantidad=" + cantidad + '}';
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
 
    
}
