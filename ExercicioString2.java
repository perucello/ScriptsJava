package aulasjava;
import javax.swing.JOptionPane;
public class ExercicioString2 {
    public static void main(String args[]){
        String frase = JOptionPane.showInputDialog("Frase:");
        
        if(frase.length() < 21){
            JOptionPane.showMessageDialog(null,
                    "Frase muito curta!");
        }else{
        
            JOptionPane.showMessageDialog(null,
                "Palavra: " + frase.charAt(5) +
                    frase.charAt(10) + frase.charAt(15)+
                    frase.charAt(20));
        } // fim else
    }// fim de main
}// fim da classe
