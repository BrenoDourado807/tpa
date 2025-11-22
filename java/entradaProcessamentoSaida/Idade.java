package prjSimples;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int an, at, y;
		
		System.out.println("Digite o ano de nascimento");
		an = ler.nextInt();
		System.out.println("Digite o ano atual");
		at = ler.nextInt();

		y = at-an;
		
		System.out.println("Idade: "+y);

	ler.close();
	}
}
