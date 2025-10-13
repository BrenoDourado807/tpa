package switchCase;
import java.util.Scanner;

public class Mes {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);

		int m;
		
		System.out.println("Digite um número de 1 a 12");
		m = ler.nextInt();	
		
		switch (m) {
		
			case 1:
			case 3:
			case 5:
			case 7:
			case 10:
			case 12:
				System.out.println("31 dias");
			break;
			case 4:
			case 6:
			case 8:
			case 9:
			case 11:
				System.out.println("30 dias");
			break;
			case 2:	
				System.out.println("28 dias");
			default:
			System.out.println("não é um número de 1 a 12");
			
		}
		ler.close();
	}

}
