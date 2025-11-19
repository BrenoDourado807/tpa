package prjVetor2;
import java.util.Scanner;

public class At13Palindromos {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int a[], b[], i=0, i2=0, cont=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		b = new int [TAM];
		
		//leitura de dados
		for (i=0; i<TAM; i++) {
			System.out.println("Digite o "+(i+1)+"º algarismo do seu número");
			a[i] = ler.nextInt();
		}
		//inversão
		for (i=9; i>=0; i--) {
			b[i2] = a[i];
			i2++;
		}
		//teste
		for (i=0; i<TAM; i++) {
			if (a[i]==b[i]) {
				cont = cont+1;
			}
		}
		//Apresentação
		if (cont==TAM) {
			System.out.println("Seu número é um Palíndromo");
		} else {
			System.out.println("Seu número não é um Palíndromo");
		}
		ler.close();
	}

}
