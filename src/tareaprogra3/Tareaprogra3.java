
package tareaprogra3;

import java.util.Scanner;


public class Tareaprogra3 {

    
    public static void main(String[] args) {
     
        int op=0;
        arbolBinario arbolito=new arbolBinario();
       //menu
       do{ 
            // libreria para ingresar datos
       Scanner in = new Scanner(System.in);
       
       System.out.println("1.-Agregar un nodo\n2.-recorrer en inOrden\n3.-PreOrden\n4.-postOrden\n5.-salir");
       System.out.println("elige una opcion");
        op=in.nextInt();
        
        //metodo de agregar un nodo
        if(op==1){
             //declaracion de datos
             int valor;
            String nom;
            
            System.out.println("ingrese la posicion de la letra del abecedario");
            valor=in.nextInt();
            System.out.println("ingrese una letra del abecedario");
            nom=in.next();
            arbolito.agregarNodo(valor, nom);
        }
        //metodo de recorrer en in orden
        if(op==2){
            if(!arbolito.estaVacia()){
                   arbolito.inOrden(arbolito.raiz);
            }else{
             
                 System.out.println("el arbol esta vacio");
            }
            
        }
        //metodo de recorrer en preOrden
        if(op==3){
            if(!arbolito.estaVacia()){
                arbolito.preOrden(arbolito.raiz);
            }else{
                System.out.println("el arbol esta vacio");
            }
        }
        // metodo de recorrer en postOrden
        if(op==4){
           if(!arbolito.estaVacia()){
                arbolito.postOrden(arbolito.raiz);
            }else{
                System.out.println("el arbol esta vacio");
            } 
        }
       }while(op!=5);
    
        
        
        
        
      
    }
    
}
