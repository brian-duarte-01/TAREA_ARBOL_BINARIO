
package tareaprogra3;

public class Nodo {
    // declaracion de variables
    int dato;
    String nombre;
    Nodo izdo;
    Nodo dcho;
    //constructor #1
    public Nodo(int valor, String nom) {
        dato=valor;
        nombre=nom;
        izdo=null;
        dcho=null;
    }

    @Override
    public String toString() {
        return nombre+" su dato es" + dato;
    }

}
