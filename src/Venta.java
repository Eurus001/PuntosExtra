public class Venta {

    private int[] cantidadVentas;
    private double[] dineroVentas;

    public Venta() {
        this.cantidadVentas = new int[4];
        this.dineroVentas = new double[4];
    }

    public void realizarVenta(int producto, int cantidad, double precio){
        cantidadVentas[producto] += cantidad;
        dineroVentas[producto] += (cantidad*precio);
    }

    public int ventasProducto(int producto){
        return cantidadVentas[producto];
    }

    public double dineroVentasProducto(int producto){
        return dineroVentas[producto];
    }

    public int productoMasVendido(){
        int indice = 0, maximo = cantidadVentas[0];
        for(int i = 0; i < cantidadVentas.length; i++){
            if (cantidadVentas[i] > maximo){
                maximo = cantidadVentas[i];
                indice = i;
            }
        }
        return indice;
    }

    public int productoMenosVendido(){
        int indice = 0, minimo = cantidadVentas[0];
        for(int i = 0; i < cantidadVentas.length; i++){
            if (cantidadVentas[i] < minimo){
                minimo = cantidadVentas[i];
                indice = i;
            }
        }
        return indice;
    }

    public String ventasTotales(){
        double total = 0;
        for (int i = 0; i < dineroVentas.length; i++){total = total + dineroVentas[i];}
        return "El total de dinero recaudado de ventas es: " + total;
    }

}
