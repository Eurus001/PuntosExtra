import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int opc, flag = 1, producto, cantidad;
        Scanner sc = new Scanner(System.in);
        Inventario inventario = new Inventario();
        Venta venta = new Venta();

        while (flag == 1){

            System.out.println("Elige una opción: ");
            System.out.println("1 - Informacion de productos");
            System.out.println("2 - Vender un producto");
            System.out.println("3 - Abastecer un productos");
            System.out.println("4 - Editar un producto");
            System.out.println("5 - Estadisticas de venta");
            System.out.println("6 - Salir");

            opc = Integer.parseInt(sc.next());

            switch (opc){
                case 1:

                    for(int i = 0; i < inventario.getProductos().length ; i++){
                        System.out.println("Producto " + (i+1) + ":");
                        System.out.println("Nombre: " + inventario.getProductos()[i].getNombre());
                        System.out.println("Tipo: " + inventario.getProductos()[i].getTipo());
                        System.out.println("Cantidad actual: " + inventario.getProductos()[i].getCantidadActual());
                        System.out.println("Cantidad minima: " + inventario.getProductos()[i].getCantidadMin());
                        System.out.println("Precio base: " + inventario.getProductos()[i].getPrecioBase());
                        System.out.println("Precio venta final: " + inventario.getProductos()[i].precioFinal());
                        System.out.println("-------------------------------------------------");
                    }

                    break;
                case 2:

                    System.out.println("Elija el producto a vender (1-4): ");
                    producto = Integer.parseInt(sc.next()) - 1;
                    System.out.println("Cantidad vendida: ");
                    cantidad = Integer.parseInt(sc.next());

                    venta.realizarVenta(producto, cantidad, inventario.getProductos()[producto].precioFinal());

                    break;
                case 3:

                    System.out.println("Ingrese el producto a reabastecer(1-4): ");
                    producto = Integer.parseInt(sc.next()) - 1;
                    System.out.println("Ingrese la cantidad de producto que entra: ");
                    cantidad = Integer.parseInt(sc.next());

                    inventario.reabastecerProducto(producto, cantidad);

                    break;
                case 4:
                    String nombre;
                    int tipo, cantidadActual, cantidadMin;
                    double precioBase;

                    System.out.println("Ingrese el producto que desea modificar (1-4)");
                    producto = Integer.parseInt(sc.next()) - 1;
                    System.out.println("Ingrese el nuevo nombre del producto");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese el nuevo tipo del producto (0-2 (ver documentacion))");
                    tipo = Integer.parseInt(sc.next());
                    System.out.println("Ingrese la nueva cantidad en inventario");
                    cantidadActual = Integer.parseInt(sc.next());
                    System.out.println("Ingrese la nueva cantidad minima de producto para solicitar inventario");
                    cantidadMin = Integer.parseInt(sc.next());
                    System.out.println("Ingrese el nuevo precio (recuerde usar . en lugar de ,)");
                    precioBase = Double.parseDouble(sc.next());

                    inventario.modificarProducto(producto, nombre, tipo, cantidadActual, cantidadMin, precioBase);

                    break;
                case 5:
                    int opc1 = 0, flag1 = 1;

                    while (flag1 == 1){

                        System.out.println("Elija una opción");
                        System.out.println("1. Producto más vendido");
                        System.out.println("2. Producto menos vendido");
                        System.out.println("3. Cantidad total de dinero recaudado por ventas");
                        System.out.println("4. Cantidad dinero recaudado por ventas de un producto");
                        System.out.println("5. Volver");

                        opc1 = Integer.parseInt(sc.next());

                        switch (opc1){
                            case 1:
                                producto = venta.productoMasVendido();
                                System.out.println("El producto más vendido es: " + inventario.getProductos()[producto] + " con " + venta.ventasProducto(producto) + " unidades vendidas");
                                break;
                            case 2:
                                producto = venta.productoMenosVendido();
                                System.out.println("El producto menos vendido es: " + inventario.getProductos()[producto] + " con " + venta.ventasProducto(producto) + " unidades vendidas");
                                break;
                            case 3:
                                venta.ventasTotales();
                                break;
                            case 4:
                                System.out.println("Ingrese el producto(1-4): ");
                                producto = Integer.parseInt(sc.next());
                                System.out.println("El dinero recaudado por el producto " + inventario.getProductos()[producto].getNombre() + " es: " + venta.dineroVentasProducto(producto));
                                break;
                            case 5:
                                flag1 = 0;
                                break;
                            default:
                                System.out.println("Ingrese una opción valida");
                                break;
                        }
                    }

                    break;
                case 6:
                    System.out.println("Fin del programa");
                    flag = 0;
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;

            }
        }
    }
}