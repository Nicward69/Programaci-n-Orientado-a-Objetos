import java.util.Scanner;

public class Figuras {

  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    // Pedir puntos para el cuadrado
    System.out.print("Ingrese coordenada x para punto superior izquierdo del cuadrado: ");
    float x1 = scanner.nextFloat();
    System.out.print("Ingrese coordenada y para punto superior izquierdo del cuadrado: ");
    float y1 = scanner.nextFloat();
    
    System.out.print("Ingrese coordenada x para punto inferior derecho del cuadrado: ");
    float x2 = scanner.nextFloat();
    System.out.print("Ingrese coordenada y para punto inferior derecho del cuadrado: ");
    float y2 = scanner.nextFloat();
    
    Punto p1 = new Punto(x1, y1);
    Punto p2 = new Punto(x2, y2);
    
    Cuadrado cuadrado = new Cuadrado(p1, p2);
    
    // Pedir centro y radio para circulo
    System.out.print("Ingrese coordenada x para el centro del circulo: ");
    float cx = scanner.nextFloat();
    System.out.print("Ingrese coordenada y para el centro del circulo: ");
    float cy = scanner.nextFloat();

    System.out.print("Ingrese radio del circulo: ");
    float radio = scanner.nextFloat();
    
    Punto centroCirculo = new Punto(cx, cy);
    Circulo circulo = new Circulo(centroCirculo, radio);

    // Pedir vertices para triangulo
    System.out.print("Ingrese coordenada x para vertice 1: ");
    float xv1 = scanner.nextFloat();
    System.out.print("Ingrese coordenada y para vertice 1: ");
    float yv1 = scanner.nextFloat();

    System.out.print("Ingrese coordenada x para vertice 2: ");
    float xv2 = scanner.nextFloat();
    System.out.print("Ingrese coordenada y para vertice 2: ");
    float yv2 = scanner.nextFloat();

    System.out.print("Ingrese coordenada x para vertice 3: ");
    float xv3 = scanner.nextFloat();
    System.out.print("Ingrese coordenada y para vertice 3: ");
    float yv3 = scanner.nextFloat();

    Punto v1 = new Punto(xv1, yv1);
    Punto v2 = new Punto(xv2, yv2);
    Punto v3 = new Punto(xv3, yv3);

    Triangulo triangulo = new Triangulo(v1, v2, v3);

    // Cuadrado
    System.out.println("Cuadrado:");
    System.out.println("Área: " + cuadrado.calcularArea());
    System.out.println("Perímetro: " + cuadrado.calcularPerimetro());

    // Circulo
    System.out.println("Circulo:");
    System.out.println("Área: " + circulo.calcularArea());
    System.out.println("Perímetro: " + circulo.calcularPerimetro());

    // Triangulo
    System.out.println("Triangulo:");
    System.out.println("Área: " + triangulo.calcularArea());
    System.out.println("Perímetro: " + triangulo.calcularPerimetro());
    System.out.println("Tipo: " + triangulo.tipoTriangulo());

  }

}