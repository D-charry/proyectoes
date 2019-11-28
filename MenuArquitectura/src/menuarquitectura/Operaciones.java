package menuarquitectura;

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
}
