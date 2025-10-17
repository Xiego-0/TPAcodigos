package prjDoWhile;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int n, i, f, a;
		n = ler.nextInt();
		i = 1;
		f = 1;
		a = 0;
		do {
			System.out.println(f);
			f = f+a;
			a = f-a;
			i++;
		}while(i<=n);
	}

}
