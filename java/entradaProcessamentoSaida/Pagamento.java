package prjSimples;
import java.util.Scanner;

public class Pagamento {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double preco, pix, credito;
		
		System.out.println("Digite o preço");
		preco = ler.nextDouble();
		
		pix=preco*0.9;
		credito=preco*1.05;
		
		System.out.println("pix: "+pix+" credito: "+credito);
		
	ler.close();
	}

}
