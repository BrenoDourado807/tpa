package prjComplementarVetor;
import java.util.Scanner;

import java.util.Scanner;

public class RelacaoDivisor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

int a[], i=0, v=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+" e sua relação de divisores:");
		for (v=1; v<=a[i]; v++) {
			if (a[i]%v==0) {
				System.out.print(v+" ");
				}
			}
			System.out.println(" ");
		}
		
		ler.close();
	}

}
