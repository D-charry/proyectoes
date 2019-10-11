
package diegocharry;

import javax.swing.JOptionPane;

public class Operaciones {
       
    private int numero1;
    private int numero2;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    //Metodo Suma
    public int suma(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
    return this.getNumero1() + this.getNumero2();
    }
    
    //Metodo Resta
     public int resta(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
    return this.getNumero1() - this.getNumero2();
    }
     
    //Metodo Multiplicacion
     public int multiplicacion(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
       return this.getNumero1() * this.getNumero2();
    }
     
    //Metodo Division 
     public int division(int num1, int num2){
        this.setNumero1(num1);
        this.setNumero2(num2);
    return this.getNumero1() / this.getNumero2();
    }
     
    //Metodo Arreglo
    public void arreglo(){
        String arregloDatos [] = new String[3];
            for(int i=0; i<arregloDatos.length;i++){
                arregloDatos[i]=JOptionPane.showInputDialog("Ingrese una letra en la posicion "+ i );
            }
            for(int j=0;j<arregloDatos.length;j++){
                JOptionPane.showMessageDialog(null,"El valor en la posicion "+ j + " es "+ arregloDatos[j] );
            }
    }
    
    //Metodo Matriz
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
