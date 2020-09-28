package aulasjava;

import javax.swing.JOptionPane;

public class RepeticaoEnquanto2 {
    
     public static void main(String args[]){
         
         int opcao = 0;
         
         while(opcao != 3){    //      != Diferente
         
             String opcao_s = JOptionPane.showInputDialog(
                                 "MENU \n"
                                 + "1 - Meu nome \n"
                                 + "2 - Meu e-mail \n"
                                 + "3 - Sair");
             
             opcao = Integer.parseInt(opcao_s); // CONVERTE STRING PARA INTEIRO
                     
             if(opcao == 1){
                 JOptionPane.showMessageDialog(null,
                         "Abrahao Lopes");
             }else if (opcao == 2){
                 JOptionPane.showMessageDialog(null,
                         "abrahao2k@gmail.com");
             }else if (opcao == 3){
                 JOptionPane.showMessageDialog(null,
                         "Até a próxima.");
             }else{
                 JOptionPane.showMessageDialog(null,
                         "Opção inválida");
             } // fim else
         
         } // fim while
         
     } // fim main
    
} // fim classe
