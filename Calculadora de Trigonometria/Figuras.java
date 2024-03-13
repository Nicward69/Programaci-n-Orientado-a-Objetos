public class Figuras {
    public static void main(String[] args) {
        Punto p1 = new Punto(5, 8);
        Punto p2 = new Punto(3, 9);

        double distancia = p1.distancia(p2);

        System.out.println(distancia);
    }

}
