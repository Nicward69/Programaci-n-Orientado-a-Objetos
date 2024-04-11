import java.util.Date;
public class Persona {
    public String nombre;
    private String domicilio; 
    /* private String domicilio;*/ // la palabra protected indica que la variable puede ser accedida desde la clase y las clases que hereden de esta.
    public Date fechaNac;
    public String numCelular;

    public Persona(String nombre, String domicilio, Date fechaNac, String numCelular) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.fechaNac = fechaNac;
        this.numCelular = numCelular;
    }

    public String getNombre(){
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio(){
        return nombre;
        
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }


    public Date getFechaNac(){
        return fechaNac;

    }

    public void setFechaNac(Date fechaNac) { 
        this.fechaNac = fechaNac;

    }

    public String getNumCelular(){
        return numCelular;

    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }
    
    public String imprimirDatos() {
        String cadena = "Nombre: " + nombre;
        cadena += "\nNumero Celular: " + numCelular;
        cadena += "\nDomicilio: " + domicilio;
        return cadena;

    }




}