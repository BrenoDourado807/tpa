package doWhile;

import java.util.Scanner;

public class Fattorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i = 0;
		
		System.out.println("digite um número");
		n = ler.nextInt();
		
		i = (i+n)-1;
		
		do {
		
			n = n*i;
			i--;
		} while (i>0);
		System.out.println(n);
		
		ler.close();
	}
}
