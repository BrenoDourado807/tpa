package prjComplementarVetor;
import java.util.Scanner;

public class SeparacaoImparPar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b[], i, g=0, v=0;
		
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = ler.nextInt();
				if (a[i]%2==0) {
					b[g] = a[i];
					g++;
					v = g;
				}
			}
		
		for (i=0; i<TAM; i++) {
			if (a[i]%2!=0) {
				b[v] = a[i];
				v++;
			}
		}
		
		for (g=0; g<TAM; g++) {
			System.out.print(b[g]+", ");
		}

		ler.close();
		}

	}
