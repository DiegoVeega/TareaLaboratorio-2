/**
 * EL PASSWORD ES TiendaN1.
 */
package inventario;

import javax.swing.JOptionPane;

/**
 *
 * @author diego 00148816
 */
public class Producto {
    //Atributos.
    private String nombre;
    private Integer cantidad;
    private Float costo;
    private String proveedor;
    //Metodos.
    //Constructor.
    public Producto(){   
    }
    public Producto(String nombre, Integer cantidad, Float costo, String proveedor){
        //*this.variable* es el Atributo. *Variable* representa el parametro del metodo constructor.
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.costo=costo;
        this.proveedor=proveedor;
    }
    //GETTER Y SETTER.
    //*****************************************************
    //Getters. MUESTRA.
    public String getNombre(){
        return nombre;
    }
    //Setters. ESTABLECE.
    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }
    
    //*****************************************************
    
    public static void main(String [] args){
        String PASS;
        do{
            //JOptionPane. 
           PASS=JOptionPane.showInputDialog("Bienvenida Maria, por favor ingresa tu PASSWORD: ");
           if(PASS.equals("TiendaN1")){
               JOptionPane.showMessageDialog(null, "Se inicio correctamente.");
           }
           else{
               JOptionPane.showMessageDialog(null, "El PASSWORD es incorrecto. Intentalo de nuevo.");
           }
        }while(PASS.equals("TiendaN1")==false);
        //MENU.
        Menu menu= new Menu();
        menu.mostrar();  
    }
}