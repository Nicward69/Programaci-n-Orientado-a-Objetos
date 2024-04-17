package Estudios.Herencia.Herencia_Empleados;

import java.util.ArrayList;
import java.util.List;

public class Nomina {

    List<Empleado> empleados;

    public Nomina() {
        empleados = new ArrayList<>(); 
    }

    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
  
    public void imprimirNomina() {
      // recorrer empleados y llamar a calcularPago
    }
  
  }
