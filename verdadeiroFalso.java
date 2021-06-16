import java.util.*;

public class verdadeiroFalso {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe dois numeros:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();

	if (n1>0 && n2>0) {
		System.out.print("Verdadeiro");
	}
	else {
		System.out.print("Falso");
	}
  }
}