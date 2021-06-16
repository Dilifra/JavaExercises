import java.util.*;

public class OperacoesMath {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe dois numeros:");
		double n1 = sc.nextInt();
		double n2 = sc.nextInt();
	
		System.out.print("1) Soma\n");
		System.out.print("2) sub\n");
		System.out.print("3) mult\n");
		System.out.print("4) div\n\n");
		System.out.print("Escolha uma operacao:");
		int op = sc.nextInt();
		
		switch (op) {
		case 1:
			double soma = n1+n2;
			System.out.print("A soma dos numeros e igual a: " + soma);
			break;
		case 2:
			double sub = n1-n2;
			System.out.print("A subtracao dos numeros e igual a: " + sub);
			break;
		case 3:
			double mult = n1*n2;
			System.out.print("A multiplicacao dos numeros e igual a: " + mult);
			break;
		case 4:
			double div = n1/n2;
			System.out.print("A divisao dos numeros e igual a: " + div);
			break;
		}
   }
}
		
