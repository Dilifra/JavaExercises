import java.util.*;

public class SomaDosMaiores {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe tres numeros:");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

	if (n1>n2 && n1>n3) {
		if (n2>n3) {
			int n = n1+n2;
			System.out.print("A soma do primeiro e segundo numeros e " + n);
		} else { 
			int n = n1+n3;
			System.out.print("A soma do primeiro e terceiro numeros e " + n);
		}
	} else if (n2>n1 && n2>n3) {
		if (n1>n3) {
			int n = n2+n1;
			System.out.print("A soma do segundo e primeiro numeros e " + n);
		} else {
			int n = n2+n3;
			System.out.print("A soma do segundo e terceiro numeros e " + n);
		}
	} else {
		if (n1>n3) {
			int n = n3+n1;
			System.out.print("A soma do terceiro e primeiro numeros e " + n);
		} else { 
			int n = n3+n2;
			System.out.print("A soma do terceiro e segundo numeros e " + n);
		}
	}
  }
}
