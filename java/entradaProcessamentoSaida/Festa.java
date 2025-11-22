package prjSimples;
import java.util.Scanner;

public class Festa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int h, m, salgado;
		double refri, bolo;
		
		System.out.println("Digite a quantidade de homens");
		h = ler.nextInt();
		System.out.println("Digite a quantidade de mulheres");
		m = ler.nextInt();
		
		salgado = (h*10)+(m*6);
		refri = ((h*800)+(m*600))/1000;
		bolo = ((h+m)*100)/1000;
		
		
		
		System.out.println("salgados: "+salgado+" refrigerante: "+refri+"L bolo: "+bolo+" Kg");
		
	ler.close();
	}
}
