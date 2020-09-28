package aulasjava;

import javax.swing.JOptionPane;

public class LetraPosicao {
    
    public static void main(String args[]){
        
        String palavra = JOptionPane.showInputDialog(
                "Digite uma palavra");
        
        int posicao = Integer.parseInt(
                JOptionPane.showInputDialog(
                "Qual a posição?")
                );
        
        JOptionPane.showMessageDialog(null,
                "A letra na posição " 
                + posicao + " de " + palavra + " é " + 
                palavra.charAt(posicao));
    }
}
