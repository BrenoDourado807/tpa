package prjTomadaDecisao;
import java.util.Scanner;

public class At4Equacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, x1, x2;
		
		System.out.println("Digite valor de A");
		a = ler.nextDouble();
		System.out.println("Digite o valor de B");
		b = ler.nextDouble();
		System.out.println("Digite o valor de C");
		c = ler.nextDouble();
		
		d = (b*b)-(4*a*c);
		
		if (d<0) {
			System.out.println("Não existem raízes");
		} else { if(d==0) {
			x1 = (-b+d)/(2*a);
			System.out.println(x1);
			} else {
				x1 = (-b+Math.pow(d, 0.5))/(2*a);
				x2 = (-b-Math.pow(d, 0.5))/(2*a);
				System.out.println(x1+" e "+x2);
			}
		}
	ler.close();
	}
}
