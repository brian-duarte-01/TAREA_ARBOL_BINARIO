
package tareaprogra3;


public class arbolBinario {
    //declaracion de variables
    Nodo raiz;
    //constructor
    public arbolBinario(){
            raiz=null;
    }
    //metodo para insertar un nodo en el arbol
    public void agregarNodo(int valor,String nom){
        Nodo nuevo =new Nodo(valor,nom);
        if(raiz==null){
            raiz=nuevo;
        }else{
            Nodo aux=raiz;
            Nodo padre;
            while(true){
                padre=aux;
                if(valor>aux.dato){
                    aux=aux.izdo;
                    if(aux==null){
                        padre.izdo=nuevo;
                        return;
                    }
                }else{
                    aux=aux.dcho;
                    if(aux==null){
                        padre.dcho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    //metodo para saber cuando esta vacio el arbol
    public boolean estaVacia(){
        return raiz==null;
    }
    // metodo para recorrer in orden 
    public void inOrden(Nodo r){
        if(r!=null){
            inOrden(r.izdo);
            System.out.println(r.nombre);
            inOrden(r.dcho);
            
        }
    }
   //metodo para recorrido preOrden
    public void preOrden(Nodo r){
        if(r!=null){
            System.out.println(r.nombre);
            preOrden(r.izdo);
            preOrden(r.dcho);
            
        }
        
    }
    //metodo de postOrden
    public void postOrden(Nodo r){
        if(r!=null){
            postOrden(r.izdo);
            postOrden(r.dcho);
            System.out.println(r.nombre);
        }
    }
    
}
