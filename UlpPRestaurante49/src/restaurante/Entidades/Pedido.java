
package restaurante.Entidades;

import java.util.ArrayList;
import java.util.List;


public class Pedido {
    private int idPedido;
    private Mesa mesa;
    private List<Producto> productos = new ArrayList<>();
    private Mesero mesero;
    private String Estado;

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, String Estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.Estado = Estado;
    }

    public Pedido() {
    }

    public Pedido(Mesa mesa, Mesero mesero, String Estado) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.Estado = Estado;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public String getEstado() {
        return Estado;
    }

      public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", productos=" + productos + ", mesero=" + mesero + ", Estado=" + Estado + '}';
    }
    
    
    
    
}
