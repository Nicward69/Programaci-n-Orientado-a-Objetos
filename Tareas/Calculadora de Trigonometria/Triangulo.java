public class Triangulo {

    private Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;
  
    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
      this.vertice1 = vertice1;
      this.vertice2 = vertice2;
      this.vertice3 = vertice3;
    }
  
    public double calcularArea() {
      double a = vertice1.distancia(vertice2);
      double b = vertice2.distancia(vertice3);
      double c = vertice3.distancia(vertice1);
      
      double s = (a + b + c) / 2;
      return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
  
    public double calcularPerimetro() {
      double a = vertice1.distancia(vertice2);
      double b = vertice2.distancia(vertice3);
      double c = vertice3.distancia(vertice1);
      
      return a + b + c; 
    }
    
    public String tipoTriangulo() {
      double a = vertice1.distancia(vertice2);
      double b = vertice2.distancia(vertice3);
      double c = vertice3.distancia(vertice1);
      
      if (a == b && b == c) {
        return "Equilátero";
      } else if (a == b || a == c || b == c) {
        return "Isósceles"; 
      } else {
        return "Escaleno";
      }
    }
  
  }
  
  