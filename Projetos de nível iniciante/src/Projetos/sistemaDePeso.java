package Projetos;

import java.util.Scanner;

public class sistemaDePeso {
	public static void main(String[] args) {

		Scanner SC = new Scanner(System.in);

		float Peso;
		float Altura;

		System.out.println("Poderia me informa o seu peso(Kg):   ");
		Peso = Float.parseFloat(SC.nextLine());

		System.out.println("Poderia me infoma sua altura em CM:   ");
		Altura = Float.parseFloat(SC.nextLine());

		float conversao = Altura / 100;

		float IMC = Peso / (conversao * conversao);

		System.out.printf("Seu IMC é: %.2f ", IMC);

		if (IMC <= 18) {

			System.out.println("\nVoce esta abaixo do peso.");

		}
		else if ((IMC > 18.5)  && (IMC <= 24.99 )) {
			System.out.println("\nVoce esta com peso normal.");

		}
		else if ((IMC >= 25 ) && (IMC <= 29.99)) {
			System.out.println("\nVoce esta acima do peso.");

		}
		else if ((IMC >= 30) && (IMC <= 34.99)) {
			System.out.println("\nVoce esta com obesidade I.");

		}
		else if ((IMC >= 35 ) && (IMC <= 39.99)) {
			System.out.println("\nVoce esta com obesidade II (Severa).");

		}
		else if(IMC >= 40) {
			System.out.println("\nVoce esta com obesidade III (Mórbida). ");

		} else {
		
		SC.close();
		}
	}

}
