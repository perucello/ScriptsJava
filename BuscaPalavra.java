package aulasjava;

import javax.swing.JOptionPane;

public class BuscaPalavra {
    
    public static void main(String args[]){
    
        String frase = "Eu queria estar curtindo uma praia.";
        
        JOptionPane.showMessageDialog(null,frase);
        
        String busca = JOptionPane.showInputDialog("Busca:");
        
        if(frase.toLowerCase().contains(busca.toLowerCase())){
            JOptionPane.showMessageDialog(null,"Encontrada!");
        }else{
            JOptionPane.showMessageDialog(null,"Não encontrada!");
        }
    }
}
