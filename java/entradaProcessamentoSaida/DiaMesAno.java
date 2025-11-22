package prjSimples;
import java.util.Scanner;

public class DiaMesAno {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dia, mes, ano;
		
		System.out.println("Digite os dias");
		dia = ler.nextInt();
		
		mes = dia/30;
		ano = dia/365;
		
		System.out.println("Meses: "+mes+" Anos: "+ano);

	ler.close();
	}

}
