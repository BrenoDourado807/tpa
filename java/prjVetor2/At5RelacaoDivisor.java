package prjVetor2;

import java.util.Scanner;

public class At5RelacaoDivisor {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int a[], i=0, div=0;
				
				final int TAM=10;
				
				a = new int [TAM];
				
				//leitura de daos
				for (i=0; i<TAM; i++) {
					System.out.println("Digite o "+(i+1)+" número");
					a[i] = ler.nextInt();
				}
				
				//Troca de índice
				for (i=0; i<TAM; i++) {
					System.out.print(a[i]+" e sua relação de divisores:");
					//Divisores até o a[i]
				for (div=1; div<=a[i]; div++) {
					if (a[i]%div==0) {
						System.out.print(div+" ");
						}
					}
					System.out.println(" ");
				}
				
				ler.close();

	}

}
