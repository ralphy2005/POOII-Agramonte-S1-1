package Ejercicio2;

public class Main {
   public static void main(String[] args) {
        Punto punto1 = new Punto(0, 0);
        Punto punto2 = new Punto(4, 0);
        Punto punto3 = new Punto(2, 3);
        
        Triangulo triangulo1 = new Triangulo(punto1, punto2, punto3);
        SuperficiePlana superficie = new SuperficiePlana();
        
        superficie.agregarFigura(triangulo1);
        superficie.mostrarAreas();  
        
        System.out.println("El triángulo es regular: " + triangulo1.esRegular());
        System.out.println(triangulo1);
    }
}
