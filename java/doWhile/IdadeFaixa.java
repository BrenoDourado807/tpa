package doWhile;
import java.util.Scanner;

public class IdadeFaixa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double p1, p2, p3, p4, p5;
		int f1=0, f2=0, f3=0, f4=0, f5=0, y, i=0, r;
		
		do {
			
			System.out.println("Digite a idade");
			y = ler.nextInt();
			
			if (y<16) {
				System.out.println("1° Faixa");
				f1 = f1+1;
				} else { if (y<=31) {
					System.out.println("2° Faixa");
					f2 = f2+1;
					}  else { if (y<=46) {
						System.out.println("3° Faixa");
						f3 = f3+1;
						} else { if (y<=61) {
							System.out.println("4° Faixa");
							f4 = f4+1;
							} else {
								System.out.println("5° Faixa");
								f5 = f5+1;
							}
						}
					}
				}
			
			i++;
			System.out.println("Deseja continuar? 1-sim 2-não");
			r = ler.nextInt();
		}	while (r<2);
		
		p1 = (f1*100)/i;
		p2 = (f2*100)/i;
		p3 = (f3*100)/i;
		p4 = (f4*100)/i;
		p5 = (f5*100)/i;
		
		System.out.println("1° Faixa: "+f1+" Pessoas e "+p1+"% do total");
		System.out.println("2° Faixa: "+f2+" Pessoas e "+p2+"% do total");
		System.out.println("3° Faixa: "+f3+" Pessoas e "+p3+"% do total");
		System.out.println("4° Faixa: "+f4+" Pessoas e "+p4+"% do total");
		System.out.println("5° Faixa: "+f5+" Pessoas e "+p5+"% do total");
		
			
		ler.close();

	}

}
