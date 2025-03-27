package Ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class SuperficiePlana {
    private List<FiguraGeometrica> figuras;
    
    public SuperficiePlana() {
        this.figuras = new ArrayList<>();
    }
    
    public void agregarFigura(FiguraGeometrica figura) {
        figuras.add(figura);
    }
    
    public void mostrarAreas() {
        for (FiguraGeometrica figura : figuras) {
            System.out.println("Area: " + figura.calcularAreaFigura());
        }
    }
}
