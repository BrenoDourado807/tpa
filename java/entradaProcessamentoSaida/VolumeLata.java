package prjSimples;
import java.util.Scanner;

public class VolumeLata {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int raio, altura;
		double volume;
		
		System.out.println("Digite o raio da lata");
		raio = ler.nextInt();
		System.out.println("Digite a altura da lata");
		altura = ler.nextInt();
		
		volume = 3.14*raio*raio*altura;
		
		System.out.println("Volume= "+volume);
				
	ler.close();

	}

}
