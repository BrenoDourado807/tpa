package prjData;

import java.util.Scanner;

public class DataSeguinte {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i = 0, d, m, a;
		
		do {
			
			System.out.println("digite o dia");
			d = ler.nextInt();
			System.out.println("digite o mês");
			m = ler.nextInt();
			System.out.println("digite o ano");
			a = ler.nextInt();
			
			switch (m) {
			
				case 1:
				case 3:
				case 5:
				case 7:
				case 10:
				case 12:
					if (d<31) {
						d = d+1;
					} else {
						d = 1;
						m = m+1;
						if (m>12) {
							m = 1;
							a = a+1;		
						}
					}
					break;
				case 4:
				case 6:
				case 8:
				case 9:
				case 11:	
					if (d<30) {
						d = d+1;
					} else {
						d = 1;
						m = m+1;
					}
					break;
				case 2:
					if (a % 4 ==0) {
						if (d<29) {
							d = d+1;
						} else {
							d = 1;
							m = m+1;
						}
					} else {
						if (d<28) {
							d = d+1;
						} else {
							d = 1;
							m = m+1;
						}
					}
			}
			
			System.out.println(d+"/"+m+"/"+a);
			
			System.out.println("Deseja continuar? 1- Não 2- Sim ");
			i = ler.nextInt();
		} while (i > 1);
		
		
		ler.close();
	}
}
