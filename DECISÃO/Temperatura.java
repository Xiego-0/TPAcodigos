package prjLista3;
import java.util.Scanner;
public class Temperatura {
	public static void main(String [] args) {
		Scanner ler = new Scanner(System.in);
		double temperaturaF, temperaturaC;
		System.out.println("Digite a temperatura em Fahrenheit");
		temperaturaF = ler.nextDouble();
		temperaturaC = (temperaturaF-32)*5 / 9;
		System.out.println("A temperatura é igual a: " + temperaturaC + " Graus Celsius");
		if(temperaturaC<0) {
			System.out.println("Esta: Frio extremo");
		}else if (temperaturaC<=10) {
			System.out.println("Esta: Frio");
		}else if (temperaturaC<=20){
			System.out.println("Esta: Frio Moderado");
		}else if (temperaturaC<=24){
			System.out.println("Esta: Clima Ameno");
		}else {
			System.out.println("Esta: Calor");
		}
	}

}
  