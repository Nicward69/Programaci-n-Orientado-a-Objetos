public class Cuadrado {

    private Punto puntoSuperiorIzquierdo;
    private Punto puntoInferiorDerecho;
  
    public Cuadrado(Punto puntoSuperiorIzquierdo, Punto puntoInferiorDerecho) {
      this.puntoSuperiorIzquierdo = puntoSuperiorIzquierdo;
      this.puntoInferiorDerecho = puntoInferiorDerecho;
    }
  
    public double calcularArea() {
      double base = puntoInferiorDerecho.getCoordX() - puntoSuperiorIzquierdo.getCoordX();
      double altura = puntoInferiorDerecho.getCoordY() - puntoSuperiorIzquierdo.getCoordY();
      return base * altura;
    }
  
    public double calcularPerimetro() {
      double base = puntoInferiorDerecho.getCoordX() - puntoSuperiorIzquierdo.getCoordX();
      double altura = puntoInferiorDerecho.getCoordY() - puntoSuperiorIzquierdo.getCoordY();
      return (base + altura) * 2;
    }
  
  }