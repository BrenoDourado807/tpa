package prjVetor2;
import java.util.Scanner;

public class At15TresOpcoes {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[], b[], c[], i=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		//leitura de dados
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º número de A");
			a[i] = ler.nextInt();
			}
		//leitura de dados
		for (i=0; i<TAM; i++) {
		System.out.println("Digite o "+(i+1)+"º número de B");
				b[i] = ler.nextInt();
		}
		//troca índice
		for (i=0; i<TAM; i++) {
			//teste Maior, Igual ou Menor
			if (a[i]>b[i]) {
				c[i]=1;
			} else if (a[i]==b[i]) {
				c[i]=0;
			} else {
				c[i]= -1;
			}
		}
		//Apresenta
		for (i=0; i<TAM; i++) {
			System.out.print(c[i]+" ");
		}
		
		ler.close();

	}

}
