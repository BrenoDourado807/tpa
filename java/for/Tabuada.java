package prjFor;

public class Tabuada {

	public static void main(String[] args) {
		
		int n=1, i=1, r;
		
		for (n=1; n<=10; n++) {
			for (i=1; i<=10; i++) {
				r = i*n;
				System.out.println(n+"x"+i+"= "+r);
			}
		}

	}

}
