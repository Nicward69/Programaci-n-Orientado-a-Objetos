package vacunas;

import java.util.Date;

public class Persona {
    String nombre;
    String domicilio;
    Date fechaNac;
    String numCelular;
    String apellido;
    Date fecha;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac){

    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public void setPersona (String nombre, String apellido, Date fecha, String numCelular){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fecha = fecha;
        this.numCelular = numCelular;
    }
}
        
        

    

