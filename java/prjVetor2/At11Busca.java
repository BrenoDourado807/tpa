package prjVetor2;

import java.util.Scanner;

public class At11Busca {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], i=0, n, v=0, m=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		//leitura de dados
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º número de A");
			a[i] = ler.nextInt();
		}
		
		System.out.println("Digite o número que deseja verificar");
		n = ler.nextInt();
		
		//testa
		for (i=0; i<TAM; i++) {
			if (a[i]==n) {
				v=1;
				m=a[i];
			} 
		}
		
		//apresenta
		if (v>0) {
			System.out.println("Seu número está armazenado no programa: "+m);
		} else {
			System.out.println("Seu número não está armazenado no programa");
		}
		ler.close();

	}

}
