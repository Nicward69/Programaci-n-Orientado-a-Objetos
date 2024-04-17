package Estudios.Herencia.Herencia_Empleados;

public class Administrativo extends Empleado {

    private float sueldoBase = 2000;
    private float pagoHoraExtra = 200;
  
    public float getSueldoBase() {
      return sueldoBase;
    }
  
    public float calcularPago() {
      // calcular pago según horas extra
      return 0; 
    }
  
  }
  