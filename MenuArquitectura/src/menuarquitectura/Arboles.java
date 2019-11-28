package menuarquitectura;

/**
 *
 * @author diego
 */
public class Arboles {
        public void arboles(){
        //primero se crean
        Nodo raiz = new Nodo(1);  //se ha creado un nodo raiz
        Nodo nodo2= new Nodo(2);  // se crea el nodo 2 de esta manera por que tienen hijos
        Nodo nodo3= new Nodo(3); // se crea el nodo 3 de esta manera por que tienen hijos
        
                
        nodo2.setNodoIzquierdo(new Nodo(4)); //como el 4 no tiene hijos se hace de esta forma.
        nodo3.setNodoIzquierdo(new Nodo(5)); //como el 5 no tiene hijos se hace de esta forma.
        nodo3.setNodoDerecho(new Nodo(6)); //como el 6 no tiene hijos se hace de esta forma.
        
        
        raiz.setNodoIzquierdo(nodo2); //Asignacion o agregacion de los nodos hijos del nodo raiz (raiz)
        raiz.setNodoDerecho(nodo3);
        
        System.out.print("Pre Orden:  ");
        preOrden(raiz);
        System.out.print("In Orden:  ");
        inOrden(raiz);
        System.out.print("Post Orden:  ");
        postOrden(raiz);
    }

    private static void preOrden(Nodo raiz) {  //  raiz es 1  ///  luego el nodo izquierdo pasa hacer la raiz(2)  // nodo iz pasa hacer el 4
        if(raiz != null){//La raiz es distento de null si
            System.out.print(raiz.getDato()+" - ");   //  Muestro el 1     // lo muestro  2   // muestro 4
            preOrden(raiz.getNodoIzquierdo());  // llamo al nodo izquiero de 1  //  llamo al nodo izquierdo de 2  -- que seria 4  // llamo al nodo izquierdo de 4 que es null
            preOrden(raiz.getNodoDerecho());  // como el lado iz de 4 es vacio y el lado derecho de 4 es vacio se sale  y llega a 1. y luego continua  con el lado derecho del 1
        }
    }

    private static void inOrden(Nodo raiz) {
        if(raiz != null){ 
            inOrden(raiz.getNodoIzquierdo());
            System.out.print(raiz.getDato()+" - ");
            inOrden(raiz.getNodoDerecho());
        }
    }

    private static void postOrden(Nodo raiz) {
        if(raiz != null){
            postOrden(raiz.getNodoIzquierdo());
            postOrden(raiz.getNodoDerecho());
            System.out.print(raiz.getDato()+" - ");
        }
    }
}

