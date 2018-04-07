/**
 * EL PASSWORD ES TiendaN1
 */
package inventario;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author diego 00148816
 */
public class ListaProductos {
    private final ArrayList<Producto> productos;
    
    public ListaProductos(){
        //productos es variable local productos.
        productos=new ArrayList<>();
    }
    //SE AGREGA UN PRODUCTO DE LA LISTA.
    public void add(){
        //Instanciar el objeto.
        Producto producto=new Producto();
        productos.add(producto);
        
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto: ");
        producto.setNombre(leer.nextLine()); //Establece el nombre del producto con el valor ingresado desde teclado a traves de Scanner.
        
        System.out.println("Ingrese el cantidad del producto: ");
        producto.setCantidad(Integer.parseInt(leer.nextLine())); //Establece el nombre del producto con el valor ingresado desde teclado a traves de Scanner. Pero Scanner devuelve String, *Integer.parseInt* lo convierte al tipo Int.
        
        System.out.println("Ingrese el costo del producto: ");
        producto.setCosto(Float.parseFloat(leer.nextLine())); //Establece el nombre del producto con el valor ingresado desde teclado a traves de Scanner.
        
        System.out.println("Ingrese el nombre del proveedor del producto: ");
        producto.setProveedor(leer.nextLine()); //Establece el nombre del producto con el valor ingresado desde teclado a traves de Scanner.
        
    }
    //SE ELIMINA UN PRODUCTO DE LA LISTA.
    public void remove(){
        Producto producto=new Producto();
        int nume;
        System.out.println("Segun la lista mostrada luego de ingresar un producto, ingrese el numero correspondiente segun fila del producto que desea remover./n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        Scanner num=new Scanner(System.in);
        nume=num.nextInt();
        productos.remove(nume);
    }
    //Set realiza MODIFICACION, CARGA, DESCARGA.
    //ERROR IDENTIFICADO, NO PIDE EL NOMBRE DEL PRODUCTO SOLAMENTE CANTIDAD Y PRECIO.
    public void set(){
        Producto producto=new Producto();
        int num;
        String nom;
        Scanner cambio=new Scanner(System.in);
        System.out.println("Segun la lista mostrada luego de ingresar un producto, ingrese el numero correspondiente segun fila del producto que desea modificar./n NOTA: LA LISTA EMPIEZA CON EL NUMERO 0. ");
        num=cambio.nextInt();
        
        //System.out.println("Ingrese el nombre del producto: (NO HACER CASO A ESTA INSTRUCCION)");
        productos.get(num).setNombre(cambio.nextLine());
        System.out.println("Ingrese la cantidad del producto: ");
        productos.get(num).setCantidad(Integer.parseInt(cambio.nextLine()));
        System.out.println("Ingrese el precio del producto: ");
        productos.get(num).setCosto(Float.parseFloat(cambio.nextLine()));
    }
    
    
    public void mostrar(){
        for(Producto e:productos){
            System.out.print(e.getNombre());
            System.out.print(" ");
            System.out.print("Cantidad: "+e.getCantidad());
            System.out.print(" Precio: $");
            System.out.print(e.getCosto());
            System.out.print(" ");
            System.out.print("Proveedor: "+e.getProveedor());
            System.out.println("\n");
        }
    }
}
