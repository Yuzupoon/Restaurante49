
package restaurante.Entidades;

import java.sql.Time;
import java.time.LocalDate;


public class Reserva {
    private int idReserva;
    private int dni;
    private String apellido;
    private String nombre;
    private int cantidadPersonas;
    private LocalDate fecha;
    private Time hora;
    private boolean estado;

    public Reserva(int idReserva, int dni, String apellido, String nombre, int cantidadPersonas, LocalDate fecha, Time hora, boolean estado) {
        this.idReserva = idReserva;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cantidadPersonas = cantidadPersonas;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Reserva(int dni, String apellido, String nombre, int cantidadPersonas, LocalDate fecha, Time hora, boolean estado) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.cantidadPersonas = cantidadPersonas;
        this.fecha = fecha;
        this.hora = hora;
        this.estado = estado;
    }

    public Reserva() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return apellido + " - "+ nombre;
    }
    
    
}
