import java.util.Date;

public class Alumnos extends Persona {
    private String numControl;
    private char status;

    public Alumnos(String nombre, String domicilio, Date fechaNac, String numCelular, String numControl, char status) {
        super(nombre, domicilio, fechaNac, numCelular);
        this.numControl = numControl;
        this.status = status;
    }

    public String getNumeroControl(){
        return numControl;
    }

    public void setNumeroControl(String numControl){
        this.numControl = numControl;
    }

    public char getStatus(){
        return status;
    }

    public void setStatus(char status){
        this.status = status;
    }
}