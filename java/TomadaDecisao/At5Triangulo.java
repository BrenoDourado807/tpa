package prjTomadaDecisao;
import java.util.Scanner;

public class At5Triangulo {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite valor de A");
		a = ler.nextInt();
		System.out.println("Digite o valor de B");
		b = ler.nextInt();
		System.out.println("Digite o valor de C");
		c = ler.nextInt();
		
		if (c>(a+b) || a>(b+c) || b>a+c) {
			System.out.println("Não é triangulo");
		} else { if(a==b & b==c & c==a) {
			System.out.println("triângulo equilatero");
			} else { if (a!=b & b!=c & c!=a) {
				System.out.println("Triângulo escaleno");
				} else {
					System.out.println("Triângulo isósceles");
				}
			}
		}
		
	ler.close();
	}

}
