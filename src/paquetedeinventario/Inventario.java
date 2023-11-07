package paquetedeinventario;

public class Inventario {

    private Producto[] productos;

    public Inventario() {
        this.productos = new Producto[4];

        productos[0] = new Producto("Lápiz", Producto.TipoProducto.PAPELERIA, 10, 5, 1.00);
        productos[1] = new Producto("Manzana", Producto.TipoProducto.SUPERMERCADO, 20, 5, 0.25);
        productos[2] = new Producto("Aspirina", Producto.TipoProducto.DROGUERIA, 10, 3, 2.25);
        productos[3] = new Producto("Pera", Producto.TipoProducto.PAPELERIA, 20, 5, 0.25);

    }

    public String informacionDeProducto(int producto){

        return productos[producto].getNombre() + ":\nTipo de producto: " + productos[producto].getTipo() + "\nCantidad actual: " + productos[producto].getCantidadActual()
                + "\nCantidad min: " + productos[producto].getCantidadMin() + "\nPrecio base (sin impuestos): " + productos[producto].getPrecioBase() + "\nPrecio final: " + productos[producto].precioFinal();

    }

    public void reabastecerProducto(int id, int cantidad) {
        productos[id].setCantidadActual(productos[id].getCantidadActual()+cantidad);
    }

    public void venderProductos(int producto, int cantidad){
        if (productos[producto].getCantidadActual()-cantidad >= 0){
            productos[producto].setCantidadActual(productos[producto].getCantidadActual()-cantidad);
        }else{
            System.out.println("La cantidad de venta supera al stock");
        }
    };

    public Producto[] getProductos() {
        return productos;
    }


    public void modificarProducto(int indiceProducto, String nombre, Producto.TipoProducto tipo, int cantidadActual, int cantidadMin, double precioBase) {
        if (indiceProducto >= 0 && indiceProducto < productos.length) {
            productos[indiceProducto].setNombre(nombre);
            productos[indiceProducto].setTipo(tipo);
            productos[indiceProducto].setCantidadActual(cantidadActual);
            productos[indiceProducto].setCantidadMin(cantidadMin);
            productos[indiceProducto].setPrecioBase(precioBase);
        } else {
            System.out.println("Índice de producto inválido: " + indiceProducto);
        }
    }

}