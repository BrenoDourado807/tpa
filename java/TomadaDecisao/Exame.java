package prjTomadaDecisao;
import java.util.Scanner;

public class Exame {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double n1, n2, n3, n4, n5, m1, m2;
		
		System.out.println("Digite sua 1° nota");
		n1 = ler.nextDouble();
		System.out.println("Digite sua 2° nota");
		n2 = ler.nextDouble();
		System.out.println("Digite sua 3° nota");
		n3 = ler.nextDouble();
		System.out.println("Digite sua 4° nota");
		n4 = ler.nextDouble();
		
		m1 = (n1+n2+n3+n4)/4;
		System.out.println("Média: "+m1);
		
		if (m1>=7) {
			System.out.println("Aprovado");
		} else { if(m1<5) {
			System.out.println("Reprovado");
			} else {
				System.out.println("Exame");
				n5 = ler.nextDouble();
				m2= (n5+m1)/2;
					if (m2>=7) {
						System.out.println("Aprovado no exame");
					} else {
						System.out.println("Reprovado no exame");
				}
			}
		}
		
	ler.close();

	}

}
