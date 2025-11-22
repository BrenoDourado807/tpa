package prjFor;
import java.util.Scanner;

public class AnaliseIdadeAlturaPeso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int y, h, k, i=0, y50=0, sh=0, ch=0, km40=0, yn=200, yv=-1;
		double mh=0, p;
		
		for (i=0; i<25; i++) {
			System.out.println("Digite sua idade");
			y = ler.nextInt();
			System.out.println("Digite sua altura (em centímetros)");
			h = ler.nextInt();
			System.out.println("Digite seu peso (em Kg)");
			k = ler.nextInt();
			
			if (y>50) {
				y50 = y50+1;
			}
			
			if (y>9 & y<21) {
				sh = sh+h;
				ch = ch+1;
			}
			
			if (k>40) {
				km40 = km40+1;
			}
			
			if (y<yn) {
				yn = y;
			}
			
			if (y>yv) {
				yv = y;
			}
			
		}
		
		mh = sh/ch;
		p = (km40*100)/i;
		
		System.out.println("Pessoas com idade superior a 50 anos: "+y50+" Pessoas");
		System.out.println("Média de altura das pessoas entre 10 a 20 anos: "+mh);
		System.out.println("Porcentagem de pessoas com menos de 40kg: "+p+"%");
		System.out.println("Pessoa mais velha:"+yv+" Anos");
		System.out.println("Pessoa mais nova: "+yn+" Anos");
		
		ler.close();
	}

}
