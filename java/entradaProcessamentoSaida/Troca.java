package prjSimples;
import java.util.Scanner;

public class Troca {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite A");
		a = ler.nextInt();
		System.out.println("Digite B");
		b = ler.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.println(a+" "+b);

	ler.close();
	}

}
