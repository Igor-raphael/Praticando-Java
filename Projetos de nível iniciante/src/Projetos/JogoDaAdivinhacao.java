package Projetos;

import java.util.Random;
import java.util.Scanner;

public class JogoDaAdivinhacao {

	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);
		Random RA = new Random();

		int tentou = 0;
		int adivilhe;
		Integer alea = RA.nextInt(100);
		//System.out.println(alea);   Retire as barras se quiser saber o número aleatorio....

		while (alea >= 0 && alea <= 100) {

			System.out.println("Adivilhe o número de 0 A 100!!!");
			adivilhe = Integer.parseInt(SC.nextLine());
			tentou++;

			if (adivilhe == alea) {
				System.out.println("Parabéns voce acertou!!!! ");
				break;

			} else {
				System.out.println(	"Voce errou que pena. Mas não se preocupe voce ainda tem 10 chances, das quais voce ja usou: "	+ tentou);
			}

			if (alea <= 50) {
				System.out.println("\nPrimeira DICA: tente números de 0 a 50.... ");

			} else if (alea >= 51) {
				System.out.println("\nPrimeira DICA: tente números de 51 a 100.... ");
			}

			if (tentou >= 5 && alea <= 25) {
				System.out.println("Segunda DICA: O número estar entre 0 a 25.");

			} else if (tentou >= 5 && (alea > 25 && alea <= 50)) {
				System.out.println("Segunda DICA: O número esta entre 25 a 50.");
			}

			if (tentou >= 5 && alea >= 75) {
				System.out.println("Segunda DICA: O número estar entre 75 a 100.");

			} else if (tentou >= 5 && (alea > 50 && alea < 75)) {
				System.out.println("Segunda DICA: O número esta entre 50 a 75.");
			}

			if (tentou == 10) {
				System.out.println(	"Que pena voce nao conseguiu. O número certo era : " + alea + ". Mais sorte na proxima vez.");
				break;
			}

		}

		SC.close();
	}

}
