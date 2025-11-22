package prjVetor;

import java.util.Scanner;

public class SomaVetor {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int a[], b[], c[], i=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("digite o "+(i+1)+" número do vetor A");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("digite o "+(i+1)+" número do vetor B");
			b[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
		c[i] = a[i]+b[i];
		System.out.print(c[i]+" ");
		
		}
		
		ler.close();
	}

}
