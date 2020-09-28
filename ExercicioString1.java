package aulasjava;
import javax.swing.JOptionPane;

public class ExercicioString1 {
    
    public static void main (String args[]){
    
      String nome = JOptionPane.showInputDialog("Seu nome:");
        
      JOptionPane.showMessageDialog(null,
                nome + "\n" 
                + nome.toUpperCase() + "\n" 
                + nome.toLowerCase()                
                );
        
    } // fim de main    
} // fim da classe
