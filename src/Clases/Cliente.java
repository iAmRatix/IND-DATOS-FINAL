
package Clases;

/**
 *
 * @author Ratix
 */
public class Cliente {
    
    
    private String dni;
    private String nombre;
    private String celular;
    private String direccion;
    private String correo; 

    public Cliente() {
    }

    public Cliente(String dni, String nombre, String celular, String direccion, String correo) {
        this.dni = dni;
        this.nombre = nombre;
        this.celular = celular;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", celular=" + celular + ", direccion=" + direccion + ", correo=" + correo + '}';
    }

    

    
    
    

     

    
    

    
    
    
}
