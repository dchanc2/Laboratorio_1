
package lista_enlazada;


public class Lista {
    protected Nodo inicio, fin; 
    public Lista (){
        inicio = null;
        fin = null;
    }
    // Metodo para saber si la lista esta vacia
    public boolean ListaVacia(){
        if(inicio==null){
            return true;
        }else{
            return false;
        }
    }
    // Metodo para agregar un nodo al inicio de la lista
    public void agregarAlInicio(int elemento){
        // Crear el nodo
        inicio = new Nodo(elemento, inicio);
        if(fin == null){
            fin = inicio;
        }
    }
    // Metodo para agregar al final de la lista
    public void agregarAlFinal(int elemento){
        if(!ListaVacia()){
            fin.enlace=new Nodo(elemento);
            fin=fin.enlace;
        }else{
            inicio=fin=new Nodo(elemento);
        }
    }
    // Metodo para mostrar la lista
    public void MostrarLista () {
        Nodo recorrer = inicio;
        System.out.println();
        while(recorrer != null){
            System.out.print("["+recorrer.dato+"]-->");
            recorrer=recorrer.enlace;
        }
    }
    //Metodo para buscar
    public boolean Buscar(int elemento){
        Nodo temporal=inicio;
        while(temporal != null && temporal.dato!=elemento){
            temporal=temporal.enlace;
        }
        return temporal!=null;
    }
    // Metodo para eliminar
    public void Eliminar(int elemento){
        if(!ListaVacia()){
            if(inicio==fin && elemento==inicio.dato){
                inicio=fin=null;
            }else if(elemento==inicio.dato){
               inicio= inicio.enlace;
            }else{
                Nodo anterior, temporal;
                anterior = inicio;
                temporal=inicio.enlace;
                while(temporal != null && temporal.dato!=elemento){
                    anterior=anterior.enlace;
                    temporal=temporal.enlace;
                }
                if(temporal==null){
                    anterior.enlace=temporal.enlace;
                    if(temporal==fin){
                        fin=anterior;
                    }
                }
            }
        }
    }
}
