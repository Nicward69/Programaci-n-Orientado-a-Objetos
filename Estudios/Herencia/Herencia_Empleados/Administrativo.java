package Estudios.Herencia.Herencia_Empleados;

public class Administrativo extends Empleado {

    private float sueldoBase = 2000;
    private float pagoHoraExtra = 200;
  
    public Administrativo(String nombre, String apellido) {
        super(nombre, apellido);
        this.sueldoBase = 2000;
        this.pagoHoraExtra = 200;
    }
    
    public float getSueldoBase() {
      return sueldoBase;
    }
  
    public float calcularPago() {
        return sueldoBase + pagoHoraExtra;
    }
  
  }
  