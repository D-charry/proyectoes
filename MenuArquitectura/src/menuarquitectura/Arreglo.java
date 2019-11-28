
package menuarquitectura;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Arreglo {
    public void arreglo(){
        String arregloDatos [] = new String[3];
        for(int i=0; i<arregloDatos.length;i++){
            arregloDatos[i]=JOptionPane.showInputDialog("Ingrese una letra en la posicion "+ i );
        }
        for(int j=0;j<arregloDatos.length;j++){
            JOptionPane.showMessageDialog(null,"El valor en la posicion "+ j + " es "+ arregloDatos[j] );
        }
    }  
}
