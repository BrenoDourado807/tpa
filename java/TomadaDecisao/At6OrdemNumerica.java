package prjTomadaDecisao;
import java.util.Scanner;

public class At6OrdemNumerica {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Digite valor de A");
		a = ler.nextInt();
		System.out.println("Digite o valor de B");
		b = ler.nextInt();
		System.out.println("Digite o valor de C");
		c = ler.nextInt();
		
		if (a>=b & b>=c) {
			System.out.println(a+" "+b+" "+c);
		} else { if (b>=a & a>=c) {
			System.out.println(b+" "+a+" "+c);
			} else { if (a>=c & c>=b) {
				System.out.println(a+" "+c+" "+b);
				} else { if (c>=a & a>=b) {
					System.out.println(c+" "+a+" "+b);
					} else {
						System.out.println(c+" "+b+" "+a);
					}
				}
			}
		}
		
		ler.close();

	}

}
