package prjTomadaDecisao;
import java.util.Scanner;

public class ConversaoTemperatura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double f, c;
		
		System.out.println("Digite a temperatura em fahrenheit");
		f = ler.nextDouble();
		
		c = (f-32)/1.8;
		System.out.print("Temperatura em °c "+c);
		
		if (c<15) {
			System.out.println(" Frio");
		} else { if(c<22) {
			System.out.println(" Ameno");
			} else { System.out.println(" Calor"); }
		}
		ler.close();
	}

}
