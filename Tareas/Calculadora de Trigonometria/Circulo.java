public class Circulo {

    private Punto centro;
    private double radio;
  
    public Circulo(Punto centro, double radio) {
      this.centro = centro;
      this.radio = radio;
    }
  
    public double calcularArea() {
      return Math.PI * radio * radio; 
    }
  
    public double calcularPerimetro() {
      return 2 * Math.PI * radio;
    }
  
  }
  