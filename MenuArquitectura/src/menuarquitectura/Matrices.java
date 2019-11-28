
package menuarquitectura;

import javax.swing.JOptionPane;

/**
 *
 * @author diego
 */
public class Matrices {
    public void matriz(){
        
        String Matriz [][] = new String[2][3];
        for(int i=0; i<Matriz.length;i++){
            for(int j=0; j<Matriz[i].length;j++){
                Matriz[i][j]=JOptionPane.showInputDialog("Ingrese una letra en la posicion "+ "[" + i + "]" + "[" + j + "]" );
            }
        }
        for(int x=0; x<Matriz.length;x++){
            for(int y=0; y<Matriz[x].length;y++){
                JOptionPane.showMessageDialog(null,"El valor tipo String en la posicion "+ "[" + x + "]" + "[" + y + "] es " + Matriz[x][y]);
            }
        }
    }  
}
