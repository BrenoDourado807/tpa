package prjVetor2;
import java.util.Scanner;

public class At1SeparacaoParImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b[], i, cont1=0, save=0;
		
		final int TAM = 20;
		
		a = new int [TAM];
		b = new int [TAM];
		
		//Leitura de dados
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			//verificando números pares
			a[i] = ler.nextInt();
				if (a[i]%2==0) {
					b[cont1] = a[i];
					cont1++;
					save = cont1;
				}
			}
		//verificando números impares
		for (i=0; i<TAM; i++) {
			if (a[i]%2!=0) {
				b[save] = a[i];
				save++;
			}
		}
		
		System.out.print("B: [ ");
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println("] ");
		
		ler.close();

	}

}
