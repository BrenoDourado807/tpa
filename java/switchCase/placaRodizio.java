package switchCase;
import java.util.Scanner;

public class placaRodizio {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		 int m;
		 
		 System.out.println("digite o número da placa (0 a 9)");
		 m = ler.nextInt();
		 
		 switch (m) {
		 
		 	case 1:
		 	case 2:
		 		System.out.println("Segunda-feira");
		 		break;
		 	case 3:
		 	case 4:	
		 		System.out.println("Terça-feira");
		 		break;
		 	case 5:
		 	case 6:
		 		System.out.println("Quarta-feira");
		 		break;
		 	case 7:
		 	case 8:
		 		System.out.println("Quinta-feira");
		 		break;
		 	case 9:
		 	case 0:
		 		System.out.println("sexta-eira");
		 } 
		 ler.close();
	}
}
