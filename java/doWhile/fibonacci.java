package doWhile;
import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n, p = 0, v = 1, i = 1, r;
		
		System.out.println("digite o enésimo número");
		n = ler.nextInt();
		
		do {
			r = v+p;
					System.out.println(r);
			p = 0+v;
			v = 0+r;
			i++;
		} while (i<=n);
		
		
		ler.close();
	}

}
