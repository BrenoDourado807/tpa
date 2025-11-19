package prjVetor2;
import java.util.Scanner;

public class At7Fatorial {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b[], i=0, p;
		
		final int TAM=15;
		
		a = new int [TAM];
		b = new int [TAM];
		
		//leitura de dados
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = ler.nextInt();
		}
		//Troca de índice
		for (i=0; i<TAM; i++) {
			//processo fatorial
			p=a[i]--;
			do {
				a[i]=p*a[i];
				p--;
			} while (p>0);
			b[i]=a[i];
		}
		//Apresentação
		for (i=0; i<TAM; i++) {
			System.out.println(b[i]+" ");	
		}
		
	
		ler.close();

	}

}
