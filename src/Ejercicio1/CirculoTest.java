package Ejercicio1;

public class CirculoTest {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo();
        System.out.println("Circulo 1");
        System.out.println("Radio: " + circulo1.getRadio());
        System.out.println("Area: " + circulo1.getArea());

        Circulo circulo2 = new Circulo(6.55);
        System.out.println("\nCirculo 2");
        System.out.println("Radio: " + circulo2.getRadio());
        System.out.println("Area: " + circulo2.getArea());
        
        Circulo circulo3 = new Circulo();
        circulo3.setRadio(4.5);
        circulo3.setColor("Rojo");
        System.out.println("\nCirculo 3");
        System.out.println("Nuevo radio: " + circulo3.getRadio());
        System.out.println("Nuevo color: " + circulo3.getColor());
        System.out.println("Nuevo color: " + circulo3.getArea());
        
        System.out.print("\n");
        System.out.println(circulo1);
    }
}
