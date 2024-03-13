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

    public int calcularEdad(Fecha fechaNacimiento, Calendar hoy) {

        int edad;

        // Obtener año, mes y día de la fecha de nacimiento
        int anioNacimiento = fechaNacimiento.getAnio();
        int mesNacimiento = fechaNacimiento.getMes();
        int diaNacimiento = fechaNacimiento.getDia();

        // Obtener año, mes y día de la fecha actual
        int anioActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH) + 1;
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);

        // Calcular edad
        if (mesActual < mesNacimiento) {
            edad = anioActual - anioNacimiento - 1;
        } else if (mesActual == mesNacimiento) {
            if (diaActual < diaNacimiento) {
                edad = anioActual - anioNacimiento - 1;
            } else {
                edad = anioActual - anioNacimiento;
            }
        } else {
            edad = anioActual - anioNacimiento;
        }

        return edad;

    }

      

    public String calcularAntiguedad(Fecha fechaInicio, Calendar hoy) {

        int anios;
        int meses;
        int dias;
      
        // Obtener año, mes y día de la fecha de inicio
        int anioInicio = fechaInicio.getAnio();
        int mesInicio = fechaInicio.getMes(); 
        int diaInicio = fechaInicio.getDia();
      
        // Obtener año, mes y día de la fecha actual
        int anioActual = hoy.get(Calendar.YEAR);
        int mesActual = hoy.get(Calendar.MONTH) + 1;
        int diaActual = hoy.get(Calendar.DAY_OF_MONTH);
      
        // Calcular diferencia de años
        anios = anioActual - anioInicio;
      
        // Calcular diferencia de meses
        if(mesActual >= mesInicio) {
          meses = mesActual - mesInicio;
        } else {
          anios--;
          meses = 12 + (mesActual - mesInicio);
        }
      
        // Calcular diferencia de días
        if(diaActual >= diaInicio) {
          dias = diaActual - diaInicio;
        } else {
          meses--;
          dias = 30 + (diaActual - diaInicio);
          
          if(meses < 0) {
            anios--;
            meses = 11;
          }
        }
      
        return anios + " años, " + meses + " meses, " + dias + " días";
      
    }
      

    public float calcularPrestaciones(float salario) {

        return salario * 0.15f;
      
    }
      
}