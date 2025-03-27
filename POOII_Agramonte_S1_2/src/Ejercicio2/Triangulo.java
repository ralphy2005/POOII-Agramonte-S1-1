package Ejercicio2;

public class Triangulo extends FiguraGeometrica{
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo() {
    }

    public Triangulo(Punto punto1, Punto punto2, Punto punto3, String nombre) {
        super(nombre);
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Punto getPunto1() {
        return punto1;
    }

    public void setPunto1(Punto punto1) {
        this.punto1 = punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public void setPunto2(Punto punto2) {
        this.punto2 = punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public void setPunto3(Punto punto3) {
        this.punto3 = punto3;
    }

    @Override
    public double calcularAreaFigura() {
        double a = punto1.calcularDistancia(punto2);
        double b = punto2.calcularDistancia(punto3);
        double c = punto3.calcularDistancia(punto1);
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public boolean esRegular() {
        double a = punto1.calcularDistancia(punto2);
        double b = punto2.calcularDistancia(punto3);
        double c = punto3.calcularDistancia(punto1);
        return a == b && b == c;
    }
    
    @Override
    public String toString() {
        return "Triangulo: " + getNombre() + " tiene 3 Puntos: " + getPunto1().toString() + ", " + getPunto2().toString() + ", " + getPunto3().toString();

    }
}
