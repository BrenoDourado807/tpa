package prjTomadaDecisao;
import java.util.Scanner;

public class At8Nota {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, m1, m2;
		
		System.out.println("Digite sua 1° nota");
		n1 = ler.nextDouble();
		System.out.println("Digite sua 2° nota");
		n2 = ler.nextDouble();
		
		m1 = (n1+n2)/2;
		
		if (m1<3) {
			System.out.println("Reprovado");
		} else { if(m1>=6) {
			System.out.println("Aprovado");
			} else {
				System.out.println("Novo exame. Apresente a nota do novo exame");
				n3 = ler.nextDouble();
				m2= (n3+m1)/2;
					if (m2>=6) {
						System.out.println("Aprovado");
					} else {
						System.out.println("Reprovado");
				}
			}
		}
		
	ler.close();
	}

}
