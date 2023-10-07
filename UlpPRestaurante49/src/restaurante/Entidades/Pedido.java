
package restaurante.Entidades;


public class Pedido {
    private int idPedido;
    private Mesa mesa;
    private Mesero mesero;
    private String Estado;

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, String Estado) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.Estado = Estado;
    }

    public Pedido(Mesa mesa, Mesero mesero, String Estado) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.Estado = Estado;
    }

    public Pedido() {
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

    public Mesero getMesero() {
        return mesero;
    }

    public void setMesero(Mesero mesero) {
        this.mesero = mesero;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", mesero=" + mesero + ", Estado=" + Estado + '}';
    }

}
