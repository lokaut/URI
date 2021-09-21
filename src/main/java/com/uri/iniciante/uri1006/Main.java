package com.uri.iniciante.uri1006;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

/* 
 * 							URI Online Judge | 1006 Média 2 - JAVA
							Adaptado por Neilor Tonin, URI  Brasil


	Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno. 
	A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5.
	Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

	Entrada:
	O arquivo de entrada contém 3 valores com uma casa decimal, de dupla precisão (double).

	Saída:
	Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 1 dígito após o ponto decimal e com um espaço em branco antes e depois da igualdade.
	 Assim como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".
 * */

public class Main {
	
	public static void main(String[] args) {

		final double PESO_A = 2.0;
		final double PESO_B = 3.0;
		final double PESO_C = 5.0;
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double media = ((a * PESO_A) + (b * PESO_B) + (c * PESO_C)) / (PESO_A + PESO_B + PESO_C);
		
		System.out.printf("MEDIA = %.1f\n", media);

		scan.close();
	}

}
