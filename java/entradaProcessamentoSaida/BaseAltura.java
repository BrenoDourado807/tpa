package prjSimples;
import java.util.Scanner;

public class BaseAltura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b;
		double area;
		
		System.out.println("Digite a base");
		b = ler.nextInt();
		System.out.println("Digite a altura");
		a = ler.nextInt();

		area = (b*a)/2;
		
		System.out.println("area: "+area);

	ler.close();
	}

}
