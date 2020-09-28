package aulasjava;

import javax.swing.JOptionPane;

public class Substituir {
    
    public static void main (String args[]){
        
        String frase = JOptionPane.showInputDialog(
                "Digite uma frase:");
        
        String palavra = JOptionPane.showInputDialog(
                "Sua frase é: \n" + frase + 
                "\nO que deseja substituir?");
        
        String palavraNova = JOptionPane.showInputDialog(
                "Substituir " + palavra + " por...?");
        
        JOptionPane.showMessageDialog(null, "Nova frase:\n" 
                + frase.replace(palavra, palavraNova));
    }
}
