/*
Pedir un número N, introducir N sueldos y mostrar el sueldo máximo
 */
package ejercicio.pkg18;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero,sueldo,sueldomax=0;
        
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de sueldos"));
        
        for (int i=1; i<=numero;i++){
            sueldo=Integer.parseInt(JOptionPane.showInputDialog("Digite el sueldo del trabajador: "+i));
            
            if (sueldo > sueldomax ){
                sueldomax= sueldo;   
            }
        }
        JOptionPane.showMessageDialog(null,"El sueldo máximo es: "+sueldomax);
        
       
    }
    
}


