package prjTomadaDecisao;
import java.util.Scanner;

public class At1Idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int an, at, i;
		
		System.out.println("Digite seu ano de nascimento");
		an = ler.nextInt();
		System.out.println("Digite o ano atual");
		at = ler.nextInt();
		
		i = at-an;
		
		if (i<=10) {
			System.out.println(i+" anos. Criança");
		} else { if (i<18) {
			System.out.println(i+" Anos. Adolescente");
			} else { if (i<60) {
				System.out.println(i+" Anos. Adulto");
				} else {
					System.out.println(i+" Anos. Idoso");
				}
			}
		}
		
		ler.close();
	}

}
