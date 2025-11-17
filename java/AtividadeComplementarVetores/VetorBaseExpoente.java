package prjComplementarVetor;

public class VetorBaseExpoente {

	public static void main(String[] args) {
		
	int a[], i=0, v=0, p=1;
	
	final int TAM=11;
	
	a = new int [TAM];
	
	for (i=0; i<TAM; i++) {
		
		while (v<i) {
			p=p*2;
			v++;
		}
		a[i]=p;
	}
	
	for (i=0; i<TAM; i++) {
		System.out.println(a[i]+" ");	
	}
	
	}

}
