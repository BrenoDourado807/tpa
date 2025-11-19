package prjVetor2;
import java.util.Scanner;

public class At3Primo {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], i=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		
		//Leitura de dados
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+" número");
			a[i] = ler.nextInt();
		}
		
		//Verificação e apresentação
		for (i=0; i<TAM; i++) {
			//teste 1: exceção a regra
			if (a[i]==2 || a[i]==3 ||  a[i]==5 || a[i]==7) {
				System.out.println(a[i]+" É primo");
				} 
				//testando se é primo ou não
				else { if (a[i]%2==0 || a[i]%3==0 || a[i]%5==0 || a[i]%7==0 || a[i]%9==0) {
					System.out.println(a[i]+" Não é primo");
					} else {
						System.out.println(a[i]+" É primo");
					}
				}	
		}
		ler.close();

	}

}
