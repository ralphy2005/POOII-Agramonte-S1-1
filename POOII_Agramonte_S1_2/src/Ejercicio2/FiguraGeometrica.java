package Ejercicio2;

abstract class FiguraGeometrica {
    protected String nombre;

    protected FiguraGeometrica() {
    }

    protected FiguraGeometrica(String nombre) {
        this.nombre = nombre;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularAreaFigura();
    public abstract boolean esRegular();
}
