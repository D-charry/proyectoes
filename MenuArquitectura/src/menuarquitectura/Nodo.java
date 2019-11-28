
package menuarquitectura;

/**
 *
 * @author diego
 */
public class Nodo {
    private int dato;
    private Nodo izq;  //nodo Izquiero
    private Nodo der; //nodo derecho
    
    public Nodo(int dato) { //contructor para inicializar las variables o atributos
        this.dato=dato;
    }
    public Nodo getNodoIzquierdo(){  //Metodos get para obtener informacion
        return izq;                  //y designados para saber cuales son los nodos
    }
    public Nodo getNodoDerecho(){
        return der;
    }
    public void setNodoDerecho(Nodo nodo){  //Metodo set para insertar los nodos en 
                                            //En este caso los nodos de dato
            der=nodo;
    }
    public void setNodoIzquierdo(Nodo nodo){  // se entrega nodo,  es para poner un nodo nuevo
            izq=nodo;
    }
    public int getDato(){  //obtener el dato del nodo
            return dato;
    }
}
