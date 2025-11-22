package prjSimples;
import java.util.Scanner;

public class VolumeCubo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int aresta, volume;
		
		System.out.println("Digite a aresta do cubo");
		aresta = ler.nextInt();
		
		volume = aresta*aresta*aresta;
		
		System.out.println("Volume= "+volume);
				
	ler.close();
	}

}
