package prjComplementarVetor;
import java.util.Scanner;

public class Primo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], i=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			if (a[i]==2 || a[i]==3) {
				System.out.println(a[i]+" É primo");
				} else { if (a[i]%2==0 || a[i]%3==0) {
					System.out.println(a[i]+" Não é primo");
					} else {
						System.out.println(a[i]+" É primo");
					}
				}	
		}
		ler.close();
	}

}
