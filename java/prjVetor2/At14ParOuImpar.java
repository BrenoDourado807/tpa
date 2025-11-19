package prjVetor2;
import java.util.Scanner;

public class At14ParOuImpar {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b[], i=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		b = new int [TAM];
		
		//leitura de dados
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º número de A");
			a[i] = ler.nextInt();
		}
		
		//troca índice
		for (i=0; i<TAM; i++) {
			//teste par OU Impar
			if (a[i]%2==0) {
				b[i]=1;
			} else {
				b[i]=0;
			}
		}
		//Apresenta
		for (i=0; i<TAM; i++) {
			System.out.print(b[i]+" ");
		}
		ler.close();

	}

}
