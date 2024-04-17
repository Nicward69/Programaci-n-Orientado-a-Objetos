package Estudios.Herencia.Herencia_Empleados;

public class Main {

  public static void main(String[] args) {

    // crear empleados
    Empleado empleado1 = new Administrativo();
    empleado1.setNombre("Juan");

    Empleado empleado2 = new Operativo();
    empleado2.setNombre("Maria");

    Empleado empleado3 = new Ventas();
    empleado3.setNombre("Pedro");

    // agregar a nómina
    Nomina nomina = new Nomina();
    nomina.getEmpleados().add(empleado1);
    nomina.getEmpleados().add(empleado2);
    nomina.getEmpleados().add(empleado3);

    // imprimir nómina
    nomina.imprimirNomina();

  }
  
  }