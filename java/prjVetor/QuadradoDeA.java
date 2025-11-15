package prjVetor;

import java.util.Scanner;

public class QuadradoDeA {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
			int a[], b[], i=0;
			
			final int TAM=10;
			
			a = new int [TAM];
			b = new int [TAM];
			
			for (i=0; i<TAM; i++) {
				System.out.println("digite o "+(i+1)+" número");
				a[i] = ler.nextInt();
			}
			
			for (i=0; i<TAM; i++) {
			b[i] = a[i]*a[i];
			System.out.print(b[i]+" ");
			
			}
			
			ler.close();
		}
}

