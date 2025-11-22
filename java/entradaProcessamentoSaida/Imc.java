package prjSimples;
import java.util.Scanner;

public class Imc {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int peso;
		double altura, imc;
		
		System.out.println("Digite o peso da pessoa");
		peso = ler.nextInt();
		System.out.println("Digite a altura da pessoa");
		altura = ler.nextDouble();
		
		imc = peso/(altura*altura);
		
		System.out.println("imc = "+imc);
				
	ler.close();

	}

}
