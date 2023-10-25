package restaurante.Entidades;

public class Pedido {

    private int idPedido;
    private Mesa mesa;
    private Mesero mesero;
    private String Estado;
    private double total;

    public Pedido(int idPedido, Mesa mesa, Mesero mesero, String Estado, double total) {
        this.idPedido = idPedido;
        this.mesa = mesa;
        this.mesero = mesero;
        this.Estado = Estado;
        this.total = total;
    }

    public Pedido(Mesa mesa, Mesero mesero, String Estado, double total) {
        this.mesa = mesa;
        this.mesero = mesero;
        this.Estado = Estado;
        this.total = total;
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
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", mesa=" + mesa + ", mesero=" + mesero + ", Estado=" + Estado + ", total=" + total + '}';
    }

    

}
