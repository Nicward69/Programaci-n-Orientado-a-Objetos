package Estudios.Herencia.Herencia_Empleados;

public class Operativo extends Empleado {

    private float sueldoBase = 3000;
    private float pagoHoraExtra = 150;
  
    public float getSueldoBase() {
      return sueldoBase;
    }
  
    public float calcularPago() {
      // calcular pago según horas extra
      return 0;
    }
  
  } 