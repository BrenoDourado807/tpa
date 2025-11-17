package prjComplementarVetor;
import java.util.Scanner;

public class DiferencaConjuntos {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b[], c[], i=0, p=0, v=0, f=0, z=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º número de A");
			a[i] = ler.nextInt();
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º número de B");
			b[i] = ler.nextInt();
		}
		
		System.out.println("Os números presentes em A que não estão presentes em B são:");
		
		for (i=0; i<TAM; i++) {
			for (p=0;  p<TAM; p++) {
				if (a[i]!=b[p]) {
					z++;
					}
				}
				if(z==TAM) {
					c[v]=a[i];
					v++;
			}
				f=v;
				z=0;
		}
		for (v=0; v<f; v++) {
			System.out.print(c[v]+" ");
		}
		
		ler.close();
	}

}
