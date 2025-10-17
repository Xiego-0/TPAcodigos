package prjDoWhile;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
				Scanner ler = new Scanner (System.in);
				int fatorial, n, i;
				System.out.println("Digite, seu nigger");
				n = ler.nextInt();
				i = 1;
				fatorial = 1;
				do {
					fatorial = fatorial*i;
					i++;
				}while(i<=n);
				System.out.println(fatorial);
			}
		}
