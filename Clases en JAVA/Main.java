import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese el género: ");
        String genero = scanner.nextLine();

        System.out.print("Ingrese el salario: ");
        float salario = scanner.nextFloat();

        System.out.print("Ingrese las prestaciones: ");
        float prestaciones1 = scanner.nextFloat();

        Empleado1 empleado1 = new Empleado1(nombre, apellido, genero, salario, prestaciones1);

        // Llamada a métodos get para verificar
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Apellido: " + empleado1.getApellido());
        System.out.println("Género: " + empleado1.getGenero());
        System.out.println("Salario: " + empleado1.getSalario());
        System.out.println("Prestaciones: " + empleado1.getPrestaciones());

        // Leer fecha de inicio
        System.out.print("Ingrese el año de inicio: ");
        int anio = scanner.nextInt();

        System.out.print("Ingrese el mes de inicio (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el dia de inicio: ");
        int dia = scanner.nextInt();

        // Crear objeto Date de inicio
        Calendar calendar = Calendar.getInstance();
        calendar.set(anio, mes-1, dia);
        Date fechaInicio = calendar.getTime();

        // Crear objeto Empleado1 y pasar fecha inicio
        Empleado1 empleado = new Empleado1(fechaInicio);

        // Calcular antigüedad
        String antiguedad = empleado.calcularAntiguedad();

        System.out.println("La antigüedad del empleado es: " + antiguedad);

        System.out.println("******************************************");
    }
}



