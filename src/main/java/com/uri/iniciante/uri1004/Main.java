package com.uri.iniciante.uri1004;

import java.io.IOException;
import java.util.Scanner;

/*
 * 						URI Online Judge | 1004 Produto Simples
 * 
 * Leia dois valores inteiros. 
 * A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD. 
 * A seguir mostre a variável PROD com mensagem correspondente.   

Entrada:
O arquivo de entrada contém 2 valores inteiros.

Saída:
Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
 Não esqueça de imprimir o fim de linha após o produto, caso contrário seu programa apresentará a mensagem: “Presentation Error”.
 */

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		int primeiraEntrada = scan.nextInt();
		int segundaEntrada = scan.nextInt();
		
		int PROD = primeiraEntrada * segundaEntrada;
		System.out.println("PROD = " + PROD);
		
		scan.close();
	}

}
