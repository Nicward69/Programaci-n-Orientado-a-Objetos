public class Alumnos extends Persona {
    private String numControl;
    private char status;

    public Alumno (String nombre, String domiclio, Date fechaNac, String numCelular, String numControl, char status){
        //llamado al constructor del padre para iniciar la herencia
        super (nombre, domicilio, numCelular, fechaNac)
        this.numControl = numControl
        this.status = status
    }
}