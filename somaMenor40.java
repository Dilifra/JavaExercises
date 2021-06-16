import java.util.*;

public class somaMenor40 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int r = 0;

		while (x<10){
			System.out.print("Escreva um numero:");
			int n = sc.nextInt();
			
			if (n<40){
				r = r+n;
			}
			x++;
		}
		System.out.print("A soma dos numeros e " + r);
  }
}	