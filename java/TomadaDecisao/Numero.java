package prjTomadaDecisao;
import java.util.Scanner;

public class Numero {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n;
		
		System.out.println("Digite um número");
		n = ler.nextDouble();
		
		if (n>0) {
			System.out.println("número positivo");
		} else {
			if (n==0) {
				System.out.println("número neutro");
			} else { System.out.println("número negativo");}
		}
		ler.close();
	}

}
