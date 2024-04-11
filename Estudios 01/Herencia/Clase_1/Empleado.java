public class Empleado {
    private float sueldo;
    enum departamento {
        Administrativo,
        Maestro,
        Estudiante
    }
    enum numEmpleado{
        Empleado1,
        Empleado2,
        Empleado3,
        Empleado4,
        Empleado5
    }

    public float getSueldo(){
        return sueldo;
    }

    public void setSueldo(float sueldo){
        this.sueldo = sueldo;
    }

    
    
}
