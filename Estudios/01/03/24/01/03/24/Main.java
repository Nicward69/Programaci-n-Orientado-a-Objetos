public class Main {
    public static void main(String[] args) {
        Empleado1 empleado = new Empleado1("John", "Doe", "Masculino", 2000.0f, 100.0f);
        System.out.println("Empleado: " + empleado.getNombre() + " " + empleado.getApellido());

        Fecha fecha = new Fecha((byte) 1, (byte) 3, (short) 2024);
        System.out.println("Fecha: " + fecha.getFecha());
        System.out.println("Fecha con separador -: " + fecha.getFecha('-'));
    }
}