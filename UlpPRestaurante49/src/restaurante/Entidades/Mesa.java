
package restaurante.Entidades;


public class Mesa {
    private int idMesa;
    private Reserva reserva;
    private int capacidad;
    private boolean estado;

    public Mesa() {
    }

    public Mesa(int idMesa, Reserva reserva, int capacidad, boolean estado) {
        this.idMesa = idMesa;
        this.reserva = reserva;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public Mesa(Reserva reserva, int capacidad, boolean estado) {
        this.reserva = reserva;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(int idMesa) {
        this.idMesa = idMesa;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Mesa{" + "idMesa=" + idMesa + ", reserva=" + reserva + ", capacidad=" + capacidad + ", estado=" + estado + '}';
    }
    
    
}
