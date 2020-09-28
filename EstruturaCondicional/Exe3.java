/*
Leia a hora inicial e a hora final de um jogo ( numeros inteiros)
calcule a duração do jogo sabendo que o mesmo pode começar em um dia e terminar em outro ( numeros inteiros)
duração mínima de 1 hora e máxima de 24 horas.
*/
package EstruturaCondicional;
import java.util.Scanner;
public class Exe3 {
    public static void main(String[] args) {
	Scanner captura = new Scanner(System.in);
        System.out.println("Digite a Hora Inicial do Jogo ");
            int horaInicial = captura.nextInt();
        System.out.println("Digite a Hora Final do Jogo ");
            int horaFinal = captura.nextInt();

            int duracao;
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else{
			duracao =  24  - horaInicial + horaFinal;
		}
		      System.out.println( " O JOGO DUROU "  + duracao +  " HORA(s) " );
	}
}