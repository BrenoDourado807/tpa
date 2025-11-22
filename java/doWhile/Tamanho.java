package doWhile;

public class Tamanho {

	public static void main(String[] args) {
	
		double j=1.34, p=1.45, i=0;
		
		j = j*100;
		p = p*100;
		
		do {
			p = p+2;
			j = j+2.5;
			i++;
		} while (j<p);
		
		System.out.println(i+" Anos");

	}

}
