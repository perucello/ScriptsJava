package aulasjava;
import javax.swing.JOptionPane;

public class VetorNomes {
    
    public static void main(String args[]){
        
        //Criar um vetor de String com 10 posições 
        String nomes[] = new String[10];
        
        //Preencher com nomes digitados pelo usuário
        for(int x = 0; x <= 9; x++ ){
            nomes[x] = JOptionPane.showInputDialog(
                    "Digite o nome " + x);
        } // fim de for
        
        
        // Exibir os nomes digitados anteriormente
        
        for(int x = 0; x <= 9; x++){
            System.out.println(nomes[x]);
        } // fim de for
        
    } // fim de main
} // fim da classe
