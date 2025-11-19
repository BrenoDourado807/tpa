package prjVetor2;
import java.util.Scanner;

public class At10Diferenca {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b[], c[], i=0, i2=0, v=0, total=0, cont=0;
		
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
		
		System.out.println("Os números presentes em A que não estão presentes em B são:");
		
		//Troca índice
		for (i=0; i<TAM; i++) {
			//troca índice b[]
			for (i2=0;  i2<TAM; i2++) {
				if (a[i]!=b[i2]) {
					//contador
					cont++;
					}
				}
			//testa se o contador chegou no total de casas diferentes	
			if(cont==TAM) {
				c[v]=a[i];
				v++;
			}
			//save diferença total
			total=v;
			//reset contador
			cont=0;
		}
		//Apresentação
		for (v=0; v<total; v++) {
			System.out.print(c[v]+" ");
		}
		
		ler.close();

	}

}
