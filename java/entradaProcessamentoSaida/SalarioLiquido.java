package prjSimples;
import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double sb, inss,  vt, desconto, sl;
		
		System.out.println("Digite o salário bruto");
		sb = ler.nextDouble();
		
		inss = sb*0.08;
		vt = sb*0.06;
		desconto = inss+vt;
		sl = sb-desconto;
		
		System.out.println("Salário líquido: "+sl);
		
	ler.close();
	}

}
