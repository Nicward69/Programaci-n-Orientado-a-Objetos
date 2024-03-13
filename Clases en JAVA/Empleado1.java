import java.util.Calendar;
import java.util.Date;
class Empleado1 {
    private String nombre;
    private String apellido;
    private String genero;
    private float salario;
    private float prestaciones;
    private Double ejemplo;
    private Date fechaInicio;


    // Constructor
    public Empleado1(String nombre, String apellido, String genero, float salario, float prestaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.prestaciones = prestaciones;
    }

    public Empleado1(Date fechaInicio){
        this.fechaInicio = fechaInicio;
    } 

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getPrestaciones() {
        return prestaciones;
    }

    public void setPrestaciones(float prestacionCantidad) {
        this.prestaciones = prestacionCantidad; 
    }

    public Double getEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(Double ejemplo) {
        this.ejemplo = ejemplo;
    }

   // Método calcular antigüedad
   public String calcularAntiguedad(){

    // Obtener fecha actual
    Calendar hoy = Calendar.getInstance();
    
    // Obtener fecha de inicio
    Calendar inicio = Calendar.getInstance();
    inicio.setTime(fechaInicio);
  
    // Calcular diferencia en milisegundos
    long milis = hoy.getTimeInMillis() - inicio.getTimeInMillis();
  
    // Convertir a días
    long dias = milis / (24 * 60 * 60 * 1000);
  
    // Calcular años
    int anos = (int) (dias / 365);
  
    // Calcular meses
    dias = dias % 365;
    int meses = (int) (dias / 30);
  
    // Calcular días
    dias = dias % 30;
  
    // Retornar cadena con datos
    return anos + " años, " + meses + " meses, " + dias + " días";
  
  }


    public int calcularEdad() {
        // Cálculo de la edad basado en la fecha de nacimiento, suponiendo que se tenga esa información
        // Aquí deberías tener una propiedad de fecha de nacimiento y calcular la edad en base a esa fecha
        return 0; // Implementa este método según tu modelo de datos
    }

    public float calcularPrestaciones() {
        // Cálculo de las prestaciones según algún criterio
        return 0.00f; // Implementa este método según tu modelo de datos
    }
}