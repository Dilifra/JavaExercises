import java.util.*;

public class MaiorNumero {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o primeiro numero: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		if (n1>n2 && n1>n3) {
			System.out.print("O primeiro numero e maior");
		} else if (n2>n3 && n2>n3) {
			System.out.print("O segundo numero e maior");
		} else {
			System.out.print("O terceiro numero e maior");
		}
  }
}