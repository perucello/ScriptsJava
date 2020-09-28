package aulasjava;
import javax.swing.JOptionPane;

public class Twitter {

    public static void main(String args[]) {

        String mensagem = JOptionPane.showInputDialog(
                "Digite seu tweet:");

        if (mensagem.length() > 140) {

            JOptionPane.showMessageDialog(null, 
            "MENSAGEM MUITO GRANDE: "
            + mensagem.length() 
            + " CARACTERES. \nNÃO FOI ENVIADA.",
            "Erro", JOptionPane.ERROR_MESSAGE);

        } else {

            JOptionPane.showMessageDialog(null, 
            "MENSAGEM ENVIADA COM "
            + mensagem.length() + " CARACTERES.");

        } // fim do if-else	
    }// fim de main
}// fim da classe
