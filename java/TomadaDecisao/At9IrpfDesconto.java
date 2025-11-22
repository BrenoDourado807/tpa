package prjTomadaDecisao;
import java.util.Scanner;

public class At9IrpfDesconto {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double s, irpf;
		
		System.out.println("Digite seu salário");
		s = ler.nextDouble();
		
		if(s<=1434.59) {
			System.out.println("isento do IRPF");
		} else { if (s<=2150) {
			irpf = s*7.5/100-107.59;
			System.out.println("Desconto IRPF: R$"+irpf);
			} else { if (s<=2866.70) {
				irpf = s*15/100-268.84;
				System.out.println("Desconto IRPF: R$"+irpf);
				} else { if (s<=2150) {
					irpf = s*22.5/100-483.84;
					System.out.println("Desconto IRPF: R$"+irpf);
					} else {
						irpf = s*27.5/100-662.94;
						System.out.println("Desconto IRPF: R$"+irpf);
					}
				}
			}
		}
		
		ler.close();
	}

}
