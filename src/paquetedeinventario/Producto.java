package paquetedeinventario;

public class Producto {

    // Enum para los tipos de producto
    public enum TipoProducto {
        PAPELERIA, SUPERMERCADO, DROGUERIA
    }

    private String nombre;
    private TipoProducto tipo; // Cambiado de int a TipoProducto
    private int cantidadActual, cantidadMin;
    private double precioBase;

    // Actualizado el constructor para usar TipoProducto
    public Producto(String nombre, TipoProducto tipo, int cantidadActual, int cantidadMin, double precioBase) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadActual = cantidadActual;
        this.cantidadMin = cantidadMin;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoProducto getTipo() {
        return tipo;
    }

    void setTipo(TipoProducto tipo) {
        this.tipo = tipo;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCantidadMin() {
        return cantidadMin;
    }

    void setCantidadMin(int cantidadMin) {
        this.cantidadMin = cantidadMin;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double precioFinal() {
        switch (this.tipo) {
            case PAPELERIA:
                return precioBase * 1.16;
            case SUPERMERCADO:
                return precioBase * 1.04;
            case DROGUERIA:
                return precioBase * 1.12;
            default:
                return -1; // Considerar lanzar una excepción o manejar el caso por defecto de manera adecuada
        }
    }
}