package aulasjava;

import javax.swing.JOptionPane;

public class Sobremesa {
    
    public static void main(String [] args){
    
        String fruta = JOptionPane.showInputDialog(
                "Qual sua fruta favorita?");
        
        String sobremesa = JOptionPane.showInputDialog(
                "Qual sua sobremesa favorita?");
        
        JOptionPane.showMessageDialog(null,
                "Voce gosta de " + sobremesa 
                + " de " + fruta);
    } // fim de main
    
} // fim da classe
