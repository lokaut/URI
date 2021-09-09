package com.uri.iniciante.uri1005;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		
		double primeiraNota = scan.nextDouble();
		double segundaNota = scan.nextDouble();
		
		double media = ((primeiraNota * 3.5) + (segundaNota * 7.5)) / 11;
		
		System.out.printf("MEDIA = %.5f", media);
		
		scan.close();

}
}
