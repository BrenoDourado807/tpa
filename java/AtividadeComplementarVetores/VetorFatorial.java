package prjComplementarVetor;
import java.util.Scanner;

public class VetorFatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b[], i=0, p;
		
		final int TAM=15;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			p=a[i]--;
			do {
				a[i]=p*a[i];
				p--;
			} while (p>0);
			b[i]=a[i];
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println(b[i]+" ");	
		}
		
	
		ler.close();
	}

}
