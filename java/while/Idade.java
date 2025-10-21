import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int i=1, a=0, j=0, y;
		
		while (i<=5) {
			
			System.out.println("Digite a idade");
			y = ler.nextInt();
			if (y>=18) {
				a = a+1;
			} else {
				j = j+1;
			}
			i++;
		}
		
		System.out.println(a+" maiores de idade");
		System.out.println(j+" menores de idade");
		
		ler.close();
	}
}
