package prjTomadaDecisao;
import java.util.Scanner;

public class IdadeMaiorMenor {

	public static void main(String[] args) {
 Scanner ler = new Scanner(System.in);
		
		int i1,i2,i3,i4,i5, maior=0, menor=0, pp, pg;
		
		System.out.println("Digite digite a 1° idade");
		i1 = ler.nextInt();
		System.out.println("Digite digite a 2° idade");
		i2 = ler.nextInt();
		System.out.println("Digite digite a 3° idade");
		i3 = ler.nextInt();
		System.out.println("Digite digite a 4° idade");
		i4 = ler.nextInt();
		System.out.println("Digite digite a 5° idade");
		i5 = ler.nextInt();
		
		if (i1>17) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		
		if (i2>17) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		
		if (i3>17) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		
		if (i4>17) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		
		if (i5>17) {
			maior = maior+1;
		} else {
			menor = menor+1;
		}
		
		pg = (maior*100)/5;
		pp = (menor*100)/5;
		
		System.out.println(maior+" Pessoas maiores de idade "+pg+"% do total");
		System.out.println(menor+" Pessoas menores de idade "+pp+"% do total");
		
		ler.close();
	}

}
