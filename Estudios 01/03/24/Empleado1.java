import java.util.Calendar;
class Empleado1 {
    private String nombre;
    private String apellido;
    private String genero;
    private float salario;
    private float prestaciones;
    private Double ejemplo;

    // Constructor
    public Empleado1(String nombre, String apellido, String genero, float salario, float prestaciones) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.salario = salario;
        this.prestaciones = prestaciones;
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

    public void setPrestaciones(float prestaciones) {
        this.prestaciones = prestaciones;
    }

    public Double getEjemplo() {
        return ejemplo;
    }

    public void setEjemplo(Double ejemplo) {
        this.ejemplo = ejemplo;
    }

    // Métodos de cálculo
    public int calcularAntiguedad() {
        // Simplemente un ejemplo para calcular la antigüedad, basado en el año actual
        int year = Calendar.getInstance().get(Calendar.YEAR);
        return year - 2000; // Suponiendo un inicio de trabajo en el año 2000
    }

    public int calcularEdad() {
        // Cálculo de la edad basado en la fecha de nacimiento, suponiendo que se tenga esa información
        // Aquí deberías tener una propiedad de fecha de nacimiento y calcular la edad en base a esa fecha
        return 0; // Implementa este método según tu modelo de datos
    }

    public float calcularPrestaciones() {
        // Cálculo de las prestaciones según algún criterio
        return 0.0f; // Implementa este método según tu modelo de datos
    }
}