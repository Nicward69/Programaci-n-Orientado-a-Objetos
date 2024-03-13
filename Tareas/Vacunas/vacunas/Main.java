package vacunas;
import java.util.Date;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    // Crear persona
    System.out.print("Ingrese su nombre: ");
    String nombre = scanner.nextLine();
    
    System.out.print("Ingrese su apellido: ");
    String apellido = scanner.nextLine();
    
    System.out.print("Ingrese su número de celular: ");
    String numCelular = scanner.nextLine();  
    
    Persona persona = new Persona();
    persona.setPersona(nombre, apellido, new Date(), numCelular);
    
    // Crear cartilla
    Cartilla cartilla = new Cartilla();
    cartilla.setFechaCreacion(new Date());
    
    // Solicitar vacunas
    System.out.print("Ingrese la clave de la vacuna: ");
    String claveVacuna = scanner.nextLine();
    
    // Buscar vacuna por clave
    Vacuna vacuna = buscarVacunaPorClave(claveVacuna); 
    
    System.out.print("Ingrese la fecha de aplicación: ");
    Date fechaAplicacion = leerFecha();
    
    System.out.print("Ingrese el número de dosis: ");
    byte dosis = scanner.nextByte();
    
    // Agregar vacuna aplicada a la cartilla
    cartilla.agregarVacunaAplicada(vacuna, fechaAplicacion, dosis);
    
    // Imprimir cartilla
    System.out.println("\nCARTILLA DE VACUNACIÓN");
    System.out.println("Nombre: " + persona.getNombre());
    System.out.println("Apellido: " + persona.getApellido());
    System.out.println("Número de celular: " + persona.getNumCelular());
    System.out.println("Fecha de creación: " + cartilla.getFechaCreacion());
    
    System.out.println("\nVacunas aplicadas:");
    cartilla.imprimirVacunasAplicadas();
    
  }
  
  public static Vacuna buscarVacunaPorClave(String clave) {
    // Buscar en BD o array de vacunas
    return vacunaEncontrada; 
  }
  
  public static Date leerFecha() {
    // Código para leer fecha desde consola
    return fecha;
  }
  
}
