package prjTreinamentoVetores;

public class Potencia {
	public static void main(String[] args) {
	    int p, a[];
	    final int TAM = 11;
	    a = new int[TAM];
	    
		for (int i = 0; i < TAM; i++) {
		    p = 1;
		    for (int j = 0; j < i; j++) {
		        p = p * 2;
		    }
		    a[i] = p;
		}
		
		for (int i = 0; i < TAM; i++) {
		    System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
