package prjVetor2;

public class At6BaseExpoente {

	public static void main(String[] args) {
		int a[], i=0, cont=0, inicial=1;
		
		final int TAM=11;
		
		a = new int [TAM];
		
		//troca de índice
		for (i=0; i<TAM; i++) {
			
			//multiplicação por 2^índice
			while (cont<i) {
				inicial=inicial*2;
				cont++;
			}
			a[i]=inicial;
		}
		
		for (i=0; i<TAM; i++) {
			System.out.println(a[i]+" ");	
		}
	}

}
