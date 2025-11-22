package prjSimples;
import java.util.Scanner;

public class LucroTotal {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double pp, pv, qtdd, lu, lt;
		
		System.out.println("Digite o preço do produto");
		pp = ler.nextDouble();
		System.out.println("Digite a quantidade vendida");
		qtdd = ler.nextDouble();
		System.out.println("Digite o preço de venda");
		pv = ler.nextDouble();
		
		lu = pv-pp;
		lt = lu*qtdd;
		
		System.out.println("Lucro total: "+lt);

	ler.close();
	}

}
