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

    public String imprimirDatosAlumnos() {
        String cade = "Nombre del alumno: " + getNombre();
        cade += "\nDomicilio del alumno: " + getDomicilio();
        cade += "\nCelular: " + getNumCelular();
        cade += "\nNumero de control: " + numControl;
        cade += "\nStatus: " + status;
        // \n sirve para salto de linea
        return cade;
    }

    @Override // Indica que esta funcion sobreescribe a la funcion de la clase padre
    public String imprimirDatos() {
        String cade = super.imprimirDatos();
        cade += "\nNumero de control: " + numControl;
        cade += "\nStatus: " + status;
        // \n sirve para salto de linea
        return cade;
    }

    /*
    public String imprimirDatos() {
        String cade = "Nombre del alumno: " + getNombre();
        cade = "Domicilio del alumno: " + domicilio; //La clase ahora tiene acceso al atributo 'domicilio' porque esta declarada como 'protected'
        domicilio = "XXXXXXX"; // Aun asi, es siempre recomendado de que se modifique el domicilio EN la clase padre
        return cade;
    }
     */
}