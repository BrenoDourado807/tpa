package prjVetor2;

import java.util.Scanner;
public class At4RelacaoPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int a[], i=0, par=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		
		//Leitura de dados
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = ler.nextInt();
		}
		
		//troca de índice
		for (i=0; i<TAM; i++) {
			System.out.print(a[i]+" e sua relação de pares:");
			//Pares até o a[i]
			for (par=0; par<=a[i]; par=par+2) {
				System.out.print(par+" ");
				}
				System.out.println(" ");
		}
		
		ler.close();

	}

}
