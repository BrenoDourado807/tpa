package prjVetor;
import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int a[], i=0;
		double m=0;
		
		final int TAM = 10;
		
		a = new int [TAM];
		
		for(i=0; i<TAM; i++) {
			System.out.println("Digite o valor "+(i+1));
			a[i] = ler.nextInt();
			m = m+a[i];
		}
		
		m = m/TAM;
		System.out.println("A média dos valores é: "+m);
		
		ler.close();
	}

}
