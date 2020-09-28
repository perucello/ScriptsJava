package aulasjava;

public class CompararPalavras {
    public static void main (String args[]){
    
        String a = "bala";
        String b = "BaLa";
        
        // diferencia maiusculas e minusculas
        if(a.equals(b)){
            System.out.println("equals - São Iguais");
        }else{
            System.out.println("equals - São Diferentes");
        }
        
        // ignora se é maiusculo ou minusculo
        if(a.equalsIgnoreCase(b)){
            System.out.println("equalsIgnoreCase - São Iguais");
        }else{
            System.out.println("equalsIgnoreCase - São Diferentes");
        }
        
    }
}