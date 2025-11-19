package prjVetor2;
import java.util.Scanner;

public class At9Intersecao {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b[], c[], i=0, i2=0, v=0, total=0;
		
		final int TAM=5;
		
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
		
		System.out.println("A interseção de números entre A e B é:");
		
		//Troca de índice a[i]
		for (i=0; i<TAM; i++) {
			//Troca de índice b[p]
			for (i2=0;  i2<TAM; i2++) {
				//Verificando se A[i] está em algum b[]
				if (a[i]==b[i2]) {
					c[v] = a[i];
					v++;
				}
				//total de interseção
				total=v;
			}
		}
		//Apresentação
		for (i=0; i<total; i++) {
			System.out.print(c[i]+" ");
		}
		ler.close();

	}

}
