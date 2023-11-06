public class Inventario {

    private Producto[] productos;

    public Inventario() {
        this.productos = new Producto[4];

        productos[0] = new Producto("Lápiz", 0, 10, 5, 1.00);
        productos[1] = new Producto("Manzana", 1, 20, 5, 0.25);
        productos[2] = new Producto("Aspirina", 2, 10, 3, 2.25);
        productos[3] = new Producto("Pera", 1, 20, 5, 0.25);

    }

    public void reabastecerProducto(int id, int cantidad) {
        productos[id].setCantidadActual(productos[id].getCantidadActual()+cantidad);
    }

    public void venderProductos(int producto, int cantidad){
        productos[producto].setCantidadActual(productos[producto].getCantidadActual()-cantidad);
    };

    public Producto[] getProductos() {
        return productos;
    }


    public void modificarProducto(int producto, String nombre, int tipo, int cantidadActual, int cantidadMin, double precioBase){
        productos[producto].setNombre(nombre);
        productos[producto].setTipo(tipo);
        productos[producto].setCantidadActual(cantidadActual);
        productos[producto].setCantidadMin(cantidadMin);
        productos[producto].setPrecioBase(precioBase);
    }
}