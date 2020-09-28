package aulasjava;

import javax.swing.JOptionPane;

public class RepeticaoEnquanto2ex {
    
     public static void main(String args[]){
         
         int opcao = 0;
         
         String nome = "", escola = "";
         
         while(opcao != 4){    //      != Diferente
         
             String opcao_s = JOptionPane.showInputDialog(
                                 "MENU \n"
                                 + "1 - Digitar nome \n"
                                 + "2 - Digitar escola \n"
                                 + "3 - Mostrar dados \n"
                                 + "4 - Sair");
             
             opcao = Integer.parseInt(opcao_s); // CONVERTE STRING PARA INTEIRO
             
             if(opcao == 1){
                 nome = JOptionPane.showInputDialog("Seu nome:");
             }else if (opcao == 2){
                 escola = JOptionPane.showInputDialog("Sua escola:");
             }else if (opcao == 3){
                 JOptionPane.showMessageDialog(null,
                         "Nome: " + nome + "\n"
                         + "Escola: " + escola);
             }else if (opcao == 4){
                 JOptionPane.showMessageDialog(null, "FIM!");
             }else{
                 JOptionPane.showMessageDialog(null,
                         "Opção inválida");
             } // fim else
         
         } // fim while
         
     } // fim main
    
} // fim classe