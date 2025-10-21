package doWhile;

import java.util.Scanner;

public class Potenciaa {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int b, e, p = 1, i = 1;
		
		System.out.println("digite a base");
		b = ler.nextInt();
		System.out.println("digite o expoente");
		e = ler.nextInt();
		
		do {
			p = p*b;
			i++;
		} while (i<=e);	
		
	System.out.println(p);
	ler.close();
	}
}
