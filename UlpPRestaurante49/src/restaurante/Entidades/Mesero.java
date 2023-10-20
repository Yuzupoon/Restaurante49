
package restaurante.Entidades;


public class Mesero {
    private int idMesero;
    private String usuario;
    private String contraseña;
    private String nombre;

    public Mesero() {
    }

    public Mesero(int idMesero, String usuario, String contraseña, String nombre) {
        this.idMesero = idMesero;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public Mesero(String usuario, String contraseña, String nombre) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.nombre = nombre;
    }

    public int getIdMesero() {
        return idMesero;
    }

    public void setIdMesero(int idMesero) {
        this.idMesero = idMesero;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return   idMesero + "- " + nombre;
    }
    
    
}
