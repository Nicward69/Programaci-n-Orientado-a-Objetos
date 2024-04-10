import java.util.Date;
public class Persona {
    public String nombre;
    public String domicilio;
    public Date fechaNac;
    public String numCelular;

    public Persona(String nombre, String domiclio, Date fechaNac, String numCelular){
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
        this.numCelular = numCelular;
        
    }

    public getNombre(){
        return nombre;

    }

    public void setNombre(nombre String){
        this.nombre = nombre;

    }

    public getDomicilio(){
        return nombre;
        
    }

    public void setDomicilio() {
        this.domicilio = domicilio;

    }

    public getFechaNac(){
        return fechaNac;

    }

    public void setFechaNac() { 
        this.fechaNac = fechaNac;

    }

    public String imprimirDatos() {
        String cadena = "Nombre: " + nombre;
        cadena += "\nNumero Celular: " + numCelular;
        cadena += "\nDomicilio: " + domicilio;
        return cadena;

    }




}