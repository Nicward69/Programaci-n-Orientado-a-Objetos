package Estudios.Herencia.Herencia_Empleados;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    // crear empleados
    Empleado empleado1 = new Administrativo("Juan", "Perez");
    Empleado empleado2 = new Operativo("Maria", "Garcia", 2000.0, 0); // Agregar parámetro de horasExtras
    Empleado empleado3 = new Empleado("Pedro", "Fuentes"); // Cambio: Usar constructor de Empleado

    // agregar a nómina
    Nomina nomina = new Nomina();
    nomina.agregarEmpleado(empleado1);
    nomina.agregarEmpleado(empleado2);
    nomina.agregarEmpleado(empleado3);

    // imprimir nómina
    nomina.imprimirNomina();

  }

}