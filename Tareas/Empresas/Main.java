import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Leer datos del empleado
        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el género: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese el salario: ");
        float salario = scanner.nextFloat();

        System.out.print("Ingrese las prestaciones: ");
        float prestacionesInput = scanner.nextFloat();

        // Leer fecha de nacimiento
        System.out.print("Ingrese el año de nacimiento: ");
        int anioNacimiento = scanner.nextInt();

        System.out.print("Ingrese el mes de nacimiento (1-12): ");
        int mesNacimiento = scanner.nextInt();

        System.out.print("Ingrese el dia de nacimiento: ");
        int diaNacimiento = scanner.nextInt();

        // Crear objeto Fecha de nacimiento
        Fecha fechaNacimiento = new Fecha((byte) diaNacimiento, (byte) mesNacimiento, (short) anioNacimiento);

        // Leer fecha de inicio
        System.out.print("Ingrese el año de inicio: ");
        int anioInicio = scanner.nextInt();

        System.out.print("Ingrese el mes de inicio (1-12): ");
        int mesInicio = scanner.nextInt();

        System.out.print("Ingrese el dia de inicio: ");
        int diaInicio = scanner.nextInt();

        // Crear objeto Fecha de inicio
        Fecha fechaInicio = new Fecha((byte) diaInicio, (byte) mesInicio, (short) anioInicio);

        // Crear objeto Empleado
        Empleado1 empleado = new Empleado1(nombre, apellido, genero, salario, prestacionesInput);

        // Obtener fecha actual
        Calendar hoy = Calendar.getInstance();

        // Calcular edad
        int edad = empleado.calcularEdad(fechaNacimiento, hoy);

        // Calcular antigüedad
        String antiguedad = empleado.calcularAntiguedad(fechaInicio, hoy);

        float prestaciones = empleado.calcularPrestaciones(salario);

        // Mostrar resultados
        System.out.println("La edad del empleado es: " + edad + " años");
        System.out.println("La antigüedad del empleado es: " + antiguedad);
        System.out.println("Las prestaciones del empleado son: " + prestaciones);

    }

  
  }



