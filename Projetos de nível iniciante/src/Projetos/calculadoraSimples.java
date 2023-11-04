package Projetos;

import java.util.Scanner;

public class calculadoraSimples {
	
	public static void main(String[] args) {
		
		Scanner SC = new Scanner(System.in); 
		
		double num1;
		double num2;
		
	    String operacao;
		
	    	    
		System.out.println("Me diga qual sera o primeiro valor da operação.... ");
		num1 = SC.nextDouble();
		
		System.out.println("Agora escolha qual a operação a ser usada (+), (-), (*), (/) ? ");
        operacao = SC.next();
		
		
		System.out.println("Me diga qual sera o segundo valor da operação....  ");
	    num2 = SC.nextDouble();
	    
	    double Resultado = "+".equals(operacao) ? num1 + num2 : 0;
	    Resultado = "-".equals(operacao) ? num1 - num2 : Resultado;
	    Resultado = "*".equals(operacao) ? num1 * num2 : Resultado;
	    Resultado = "/".equals(operacao) ? num1 / num2 : Resultado;

		// o Caso nao seja digitado o "-" ele dara falso e por sua vez voltara pra resultado que se caso a operacao for "+" e;eja dara o resultado, do mesmo jeito se for "*" ou "/"
	    
	    System.out.printf("%.2f %s %.2f = %.2f ", num1, operacao, num2, Resultado );
	    
	    SC.close();
	}

}
