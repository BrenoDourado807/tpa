package prjVetor;
import java.util.Scanner;

public class Inverso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a[], b[], i=0;
		
		final int TAM=10;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0; i<10; i++) {
			System.out.println("Digite um número");
			a[i] = ler.nextInt();
		}
		for (i=9; i>=0; i--) {
			b[i] = a[i];
			System.out.println(b[i]);
		}
	
	ler.close();
	}
	
}
