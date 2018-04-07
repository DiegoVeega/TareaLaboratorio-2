/**
 * EL PASSWORD ES TiendaN1.
 */
package inventario;

import java.util.Scanner;

/**
 *
 * @author diego 00148816
 */
public class Menu {
    //Metodos.
    public void Opciones(){
        System.out.println("Bienvenida Maria.\n");
        System.out.println("Seleccione una opcion a realizar: \n");
        System.out.println("1. Agregar Producto.");
        System.out.println("2. Eliminar Producto.");
        System.out.println("3. Modificar Producto.");
        System.out.println("4. Cargar Producto.");
        System.out.println("5. Descargar Producto.");
        System.out.println("6. Descartar Producto.");
        System.out.println("7. Salir.\n");
    }
    public void mostrar(){
        int op=5;
        Scanner teclado=new Scanner(System.in);
        ListaProductos productos = new ListaProductos();
        
        while (op != 4) {
            
            System.out.println("Seleccione una opcion a realizar: \n");
            System.out.println("1. Agregar Producto.");
            System.out.println("2. Eliminar/Descartar Producto.");
            System.out.println("3. Modificar Producto(CARGAR o Decargar un producto).");
            System.out.println("4. Salir.\n");
            
            op = teclado.nextInt(); //Pedir desde teclado un entero.
            switch (op) {
                case 1:
                    productos.add();
                    System.out.println("\n******************************\n");
                    productos.mostrar();
                    System.out.println("\n******************************\n");
                    break;
                case 2:
                    productos.remove();
                    System.out.println("\n******************************\n");
                    productos.mostrar();
                    System.out.println("\n******************************\n");
                    break;
                case 3:
                    productos.set();
                    System.out.println("\n******************************\n");
                    productos.mostrar();
                    System.out.println("\n******************************\n");
                    break;
                case 4:
                    System.out.println("ADIOS. NOS VEMOS PRONTO.");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida, por favor.");
            }
        }
    }
}
