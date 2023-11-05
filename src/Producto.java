public class Producto {

    private String nombre;
    //Tipo de producto 0-papeleria, 1-supermercado, 2-drogueria
    private int tipo, cantidadActual, cantidadMin;
    private double precioBase;

    public Producto(String nombre, int tipo, int cantidadActual, int cantidadMin, double precioBase) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidadActual = cantidadActual;
        this.cantidadMin = cantidadMin;
        this.precioBase = precioBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

    public int getCantidadMin() {
        return cantidadMin;
    }

    public void setCantidadMin(int cantidadMin) {
        this.cantidadMin = cantidadMin;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public double precioFinal(){
        switch (this.tipo){
            case 0:
                return precioBase * 1.16;
            case 1:
                return precioBase * 1.04;
            case 2:
                return precioBase * 1.12;
            default:
                return -1;
        }
    }
}