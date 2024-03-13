public class Punto {
    public float coordX;
    public float coordY;
  
    public Punto(float x, float y) {
      this.coordX = x;
      this.coordY = y;
    }
  
    public float getCoordX() {
      return coordX;
    }
  
    public float getCoordY() {
      return coordY;
    }
  
    public void setCoordX(float coordX) {
      this.coordX = coordX;
    }
  
    public void setCoordY(float coordY) {
      this.coordY = coordY;
    }
  
    public double distancia(Punto otroPunto) {
      float xDiff = this.coordX - otroPunto.getCoordX();
      float yDiff = this.coordY - otroPunto.getCoordY();
      return Math.sqrt(xDiff*xDiff + yDiff*yDiff);
    }
  
}