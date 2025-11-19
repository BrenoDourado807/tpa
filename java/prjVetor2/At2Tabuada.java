package prjVetor2;

import java.util.Scanner;
public class At2Tabuada {

	public static void main(String[] args) {
Scanner ler = new Scanner (System.in);
		
		int a[], i=0, resultado, multiplicador=0;
		
		final int TAM=5;
		
		a = new int [TAM];
		
		//leitura de dados
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = ler.nextInt();
		}
		
		//Alteração de tabuada
		for (i=0; i<TAM; i++) {
			System.out.println("Tabuada do "+a[i]+":");
			//tabuada e alteração do multiplicador
			for (multiplicador=1; multiplicador<=10; multiplicador++) {
				resultado = multiplicador*a[i];
				System.out.println(multiplicador+"x"+a[i]+"= "+resultado);
			}
		}
		
		ler.close();
	}

}


