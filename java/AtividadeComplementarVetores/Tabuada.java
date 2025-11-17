package prjComplementarVetor;
import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], i=0, r, n=0, v=0;
		
		final int TAM=5;
		
		a = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Tabuada do "+a[i]+":");
		for (v=1; v<=10; v++) {
			r = v*a[i];
			System.out.println(v+"x"+a[i]+"="+r);
			}
		}
		ler.close();
	}

}
