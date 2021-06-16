import java.util.*;

public class cinema {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome,fileira;
		int filme;
		int[] f = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		int[] e = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		int[] d = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		int[] c = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		int[] b = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};

		System.out.print("Bem vindo ao cinema do Jailson\nQual seria seu nome?\n");
		nome = sc.nextLine();

		System.out.print("\nQual filme voce gostaria de assistir hoje " + nome + "?\n1.Branquelas\n2.A Chegada\n");
		filme = sc.nextInt();

		switch(filme) {
			case 1:
				System.out.print("\nEscolha uma fileira:\nF\nE\nD\nC\nB\nA\n");
				fileira = sc.next();
				
				if (fileira.equalsIgnoreCase("f")) {
					System.out.print("Escolha um assento:" + Arrays.toString(f));
				} 
				else if (fileira.equalsIgnoreCase("e")) {
					System.out.print("Escolha um assento:" + Arrays.toString(e));
				}
				else if (fileira.equalsIgnoreCase("d")) {
					System.out.print("Escolha um assento:" + Arrays.toString(d));
				}
				else if (fileira.equalsIgnoreCase("c")) {
					System.out.print("Escolha um assento:" + Arrays.toString(c));
				}
				else if (fileira.equalsIgnoreCase("b")) {
					System.out.print("Escolha um assento:" + Arrays.toString(b));
				}
				else if (fileira.equalsIgnoreCase("a")) {
					System.out.print("Escolha um assento:" + Arrays.toString(a));
				}
				else { 
					System.out.print("Essa opcao e invalida");
				}
				break;
			case 2: 
				System.out.print("\nEscolha um dos lugares disponiveis na sala Beta");
				break;
		}
		System.out.print(nome + ", seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.")
  }
}