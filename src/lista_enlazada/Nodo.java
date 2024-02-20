
package lista_enlazada;

/**
 *
 * @author leona
 */
public class Nodo {
    public int dato; 
    public Nodo enlace; //Puntero enlace de nodos

    // Constructor para insertar datos al inicio
    public Nodo (int d, Nodo n){
        dato = d;
        enlace = n;
    }
        // Constructor para insertar al final
    public Nodo(int d){
        this.dato=d;
        this.enlace=null;
    }
}
