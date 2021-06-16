import java.util.*;

public class PositivoNegativo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe um numero: ");
		int n = sc.nextInt();

		if (n>0) {
			System.out.print("O numero e positivo");
		} else if (n == 0) {
			System.out.print("O numero e igual a 0");
		} else {
			System.out.print("O numero e negativo");
		}
  }
}