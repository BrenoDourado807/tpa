import java.util.Scanner;

public class Tabuada {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int m, i = 1, r;
		
		System.out.println("digite um número");
		m = ler.nextInt();
		
		while (i<=10) {
			
			r = i*m;
			System.out.println(m+"x"+i+"= "+r);
			i++;
		}
		ler.close();
	}
}
