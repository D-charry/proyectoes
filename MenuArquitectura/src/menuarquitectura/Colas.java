/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menuarquitectura;

import menuarquitectura.Cola;
import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Colas {
    public void colas(){
       int opcion = 0, elemento = 0;
       Cola cola = new Cola();
        
        do{
            try {
                opcion= Integer.parseInt(JOptionPane.showInputDialog(null,"1. Insertar un elemento en la Cola\n"
                                                                        + "2. Quitar un elemento en la Cola\n"
                                                                        + "3. ¿La cola está vacia?\n"
                                                                        + "4. Elemento ubicado al inicio de la cola\n"
                                                                        + "5. Tamaño de la cola\n"
                                                                        + "6. Salir","Menú de opciones de una Cola",
                JOptionPane.QUESTION_MESSAGE));
                
                switch(opcion){
                    case 1:
                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa el elemento","Insertando en la Cola",JOptionPane.QUESTION_MESSAGE));
                         cola.insertar(elemento);
                    break;
                    
                    case 2:
                        if(!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento atendido es " + cola.quitar(),"Quitando elemento de la cola",JOptionPane.INFORMATION_MESSAGE);
                        }else {
                            JOptionPane.showMessageDialog(null, "La cola está vacia" ,"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                    break;
                    
                    case 3:
                        if(cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "La Cola está Vacia","Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La Cola no está Vacia","Cola no Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                    break;
                    
                    case 4:
                        if(!cola.estaVacia()){
                            JOptionPane.showMessageDialog(null, "El elemento ubicado al inicio de la Cola es "+cola.inicioCola(),"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }else{
                            JOptionPane.showMessageDialog(null, "La Cola está Vacia","Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                        }
                    break;
                    
                    case 5 :
                        JOptionPane.showMessageDialog(null, "El tamaño de la Cola es "+ cola.tamanioCola(),"Cola Vacia",JOptionPane.INFORMATION_MESSAGE);
                    break;
                        
                    case 6 :
                        JOptionPane.showMessageDialog(null, "Aplicación Finalizada","Fin",JOptionPane.INFORMATION_MESSAGE);
                    break;
                        
                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta","¡Cuidado!",JOptionPane.INFORMATION_MESSAGE);
                }
               
            }catch (NumberFormatException n) {
                JOptionPane.showMessageDialog(null, "Error" + n.getMessage());
                        
            }
        }while(opcion!=6);
    } 
}
