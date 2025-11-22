package prjTomadaDecisao;
import java.util.Scanner;

public class At2TesteEconomia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double gm, dp, ct;
		
		System.out.println("Digite a distância percorrida em KM");
		dp = ler.nextDouble();
		System.out.println("Digite  a capacidade do tanque em litros");
		ct = ler.nextDouble();
		
		gm = dp/ct;
		
		if (gm>=10) {
			System.out.println(gm+"km/L Econômico");
		} else {
			System.out.println(gm+"km/L Não econômico");
		}
		ler.close();
	}

}
