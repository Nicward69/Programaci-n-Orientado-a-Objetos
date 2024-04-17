package Estudios.Herencia.Herencia_Empleados;

public class Ventas extends Empleado {

    private float sueldoBase = 2500;
    private float pagoHoraExtra = 125;
  
    public float getSueldoBase() {
      return sueldoBase;
    }
  
    public float calcularPago() {
      // calcular pago según horas extra 
      return 0;
    }
  
  }