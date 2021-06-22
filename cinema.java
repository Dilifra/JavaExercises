import java.util.*;

public class cinema {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String nome, fileira;
		int filme, escolha, assento,preferencia;
		int sala = 1;
		//fileiras//
		int[] f = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		int[] e = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		int[] d = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		int[] c = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		int[] b = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		int[] a = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23};
		//sala Beta//
		int[] eb = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		int[] bb = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		int[] ab = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		//numeros de assentos//
		int x=0;

		System.out.print("Bem vindo ao cinema do Jailson\nQual seria seu nome?\n");
		nome = sc.nextLine();

		System.out.print("\nQual filme voce gostaria de assistir hoje " + nome + "?\n1.Branquelas\n2.A Chegada\n");
		filme = sc.nextInt();

		switch(filme) {
			case 1:
				while (sala == 1) {
					System.out.print("Voce escoheu o filme As Branquelas.\nVoce possui alguma deficiencia e gostaria de escolher assentos preferenciais?\n1.Sim | 2.Nao\n ");
					preferencia = sc.nextInt();

					if (preferencia == 2) { 
						System.out.print("\nEscolha uma fileira:\nF\nE\nD\nC\nB\nA\n");
						fileira = sc.next();
						
						if (fileira.equalsIgnoreCase("f")) {
							System.out.print("\nVoce gostaria de escolher um assento dessa fileira:\n\n-->" 
									+ Arrays.toString(f) + "<--\n   "
									+ Arrays.toString(e) + "\n "
									+ Arrays.toString(d) + "\n "
									+ Arrays.toString(c) + "\n   "
									+ Arrays.toString(b) + "\n   "
									+ Arrays.toString(a) + "\n\n"
									+ "                           1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
							
							while (escolha == 1) {

								System.out.print("\n\nEscolha um assento:" + Arrays.toString(f));
								assento = sc.nextInt();
		
								int[] f2 = new int[f.length - 1]; 
								System.arraycopy(f, 0, f2, 0, assento); 
								System.arraycopy(f, assento + 1, f2, assento, f.length - assento - 1); 
								f = f2.clone();
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (f.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
							}

						} 
						else if (fileira.equalsIgnoreCase("e")) {
							System.out.print("Voce gostaria de escolher um assento dessa fileira:\n\n   "
									+ Arrays.toString(f) + "\n-->"
									+ Arrays.toString(e) + "<--\n "
									+ Arrays.toString(d) + "\n "
									+ Arrays.toString(c) + "\n   "
									+ Arrays.toString(b) + "\n   "
									+ Arrays.toString(a) + "\n\n"
									+ "                          1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
														
							while (escolha == 1) {

								System.out.print("Escolha um assento:" + Arrays.toString(e));
								assento = sc.nextInt();
						
								int[] e2 = new int[e.length - 1]; 
								System.arraycopy(e, 0, e2, 0, assento); 
								System.arraycopy(e, assento + 1, e2, assento, e.length - assento - 1); 
								e = e2.clone();
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (e.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
							}

						}
						else if (fileira.equalsIgnoreCase("d")) {
							System.out.print("\nVoce gostaria de escolher um assento dessa fileira:\n\n     " 
									+ Arrays.toString(f) + "\n     "
									+ Arrays.toString(e) + "\n-->"
									+ Arrays.toString(d) + "<--\n   "
									+ Arrays.toString(c) + "\n     "
									+ Arrays.toString(b) + "\n     "
									+ Arrays.toString(a) + "\n\n"
									+ "                           1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
							
							while (escolha == 1) {

								System.out.print("\n\nEscolha um assento:" + Arrays.toString(d));
								assento = sc.nextInt();
		
								int[] d2 = new int[d.length - 1]; 
								System.arraycopy(d, 0, d2, 0, assento); 
								System.arraycopy(d, assento + 1, d2, assento, d.length - assento - 1); 
								d = d2.clone();
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (f.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
							}

						}
						else if (fileira.equalsIgnoreCase("c")) {
							System.out.print("\nVoce gostaria de escolher um assento dessa fileira:\n\n     " 
									+ Arrays.toString(f) + "\n     "
									+ Arrays.toString(e) + "\n   "
									+ Arrays.toString(d) + "\n-->"
									+ Arrays.toString(c) + "<--\n     "
									+ Arrays.toString(b) + "\n     "
									+ Arrays.toString(a) + "\n\n"
									+ "                           1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
							
							while (escolha == 1) {

								System.out.print("\n\nEscolha um assento:" + Arrays.toString(c));
								assento = sc.nextInt();
		
								int[] c2 = new int[c.length - 1]; 
								System.arraycopy(c, 0, c2, 0, assento); 
								System.arraycopy(c, assento + 1, c2, assento, c.length - assento - 1); 
								c = c2.clone();
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (f.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
							}

						}
						else if (fileira.equalsIgnoreCase("b")) {
							System.out.print("\nVoce gostaria de escolher um assento dessa fileira:\n\n   " 
									+ Arrays.toString(f) + "\n   "
									+ Arrays.toString(e) + "\n "
									+ Arrays.toString(d) + "\n "
									+ Arrays.toString(c) + "\n-->"
									+ Arrays.toString(b) + "<--\n   "
									+ Arrays.toString(a) + "\n\n"
									+ "                           1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
							
							while (escolha == 1) {

								System.out.print("\n\nEscolha um assento:" + Arrays.toString(b));
								assento = sc.nextInt();
		
								int[] b2 = new int[b.length - 1]; 
								System.arraycopy(b, 0, b2, 0, assento); 
								System.arraycopy(b, assento + 1, b2, assento, b.length - assento - 1); 
								b = b2.clone();
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (f.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
							}

						}
						else if (fileira.equalsIgnoreCase("a")) {
							System.out.print("\nVoce gostaria de escolher um assento dessa fileira:\n\n   " 
									+ Arrays.toString(f) + "\n   "
									+ Arrays.toString(e) + "\n "
									+ Arrays.toString(d) + "\n "
									+ Arrays.toString(c) + "\n   "
									+ Arrays.toString(b) + "\n-->"
									+ Arrays.toString(a) + "<--\n\n"
									+ "                           1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
							
							while (escolha == 1) {

								System.out.print("\n\nEscolha um assento:" + Arrays.toString(a));
								assento = sc.nextInt();

								if (assento > 12) {
									int []a2 = new int[a.length - 1]; 
									System.arraycopy(a, 0, a2, 0, assento); 
									System.arraycopy(a, assento + 1, a2, assento, a.length - assento - 1); 
									a = a2.clone();
									System.out.print("\nAssento " + assento + " comprado!\n");

									if (f.length > 13) {
										System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
										escolha = sc.nextInt();
									} else {
										System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
										escolha = 2;
									}
								} else {
									System.out.print("Esse assento é para pessoas com deficencias.Gostaria de escolher outro?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								}
							}

						}
						else { 
							System.out.print("Essa opcao e invalida");
						}
						
					}//Assentos Preferenciais Alpha//
					else if (preferencia == 1) {

						int[] a3 = a.clone();
						int[] a2 = new int[a.length -11]; 
						System.arraycopy(a, 0, a2, 0, 13); 
						a = a2.clone();
						System.out.print("Esses sao os assentos disponiveis para pessoas com deficiencia\n\n" 
										 + "Fileira A: -->" + Arrays.toString(a)
										 + "<--\n\nVoce gostaria de escolher um deles?\n1.Sim | 2.Nao\n");
						escolha = sc.nextInt();
							
							while (escolha == 1) {

								System.out.print("\n\nEscolha um assento:" + Arrays.toString(a));
								assento = sc.nextInt();
		
								a2 = new int[a.length - 1]; 
								System.arraycopy(a, 0, a2, 0, assento); 
								System.arraycopy(a, assento + 1, a2, assento, a.length - assento - 1);
								a = a2.clone(); 
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (f.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
								x++;
							}
						a = new int[a3.length - x];
						System.arraycopy(a2, 0, a, 0, 13-x);
						System.arraycopy(a3, 13, a, 13-x, 11);
					}
					System.out.print("Gostaria de comprar ingressos de outra fileira?\n1.Sim | 2.Nao\n");
					sala = sc.nextInt();
				}
				System.out.print("O ingressos restantes nas respectivas fileiras sao esses:\n"); 
				System.out.print("F:" + f.length + " - 1\n");
				System.out.print("E:" + e.length + " - 1\n");
				System.out.print("D:" + d.length + " - 1\n");
				System.out.print("C:" + c.length + " - 1\n");
				System.out.print("B:" + b.length + " - 1\n");
				System.out.print("A:" + a.length + " - 1\n");
				break;
			case 2: 
				while (sala == 1) {
					System.out.print("Voce escoheu o filme A Chegada.\nVoce possui alguma deficiencia e gostaria de escolher assentos preferenciais?\n1.Sim | 2.Nao\n ");
					preferencia = sc.nextInt();

					if (preferencia == 2) { 
						System.out.print("\nEscolha uma fileira:\nE\nD\nC\nB\nA\n");
						fileira = sc.next();
						
						if (fileira.equalsIgnoreCase("e")) {
							System.out.print("Voce gostaria de escolher um assento dessa fileira:\n\n-->"
									+ Arrays.toString(eb) + "<--\n   "
									+ Arrays.toString(d) + "\n   "
									+ Arrays.toString(c) + "\n   "
									+ Arrays.toString(bb) + "\n   "
									+ Arrays.toString(ab) + "\n\n"
									+ "                          1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
														
							while (escolha == 1) {

								System.out.print("Escolha um assento:" + Arrays.toString(eb));
								assento = sc.nextInt();
						
								int[] eb2 = new int[eb.length - 1]; 
								System.arraycopy(eb, 0, eb2, 0, assento); 
								System.arraycopy(eb, assento + 1, eb2, assento, e.length - assento - 1); 
								eb = eb2.clone();
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (e.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
							}

						}
						else if (fileira.equalsIgnoreCase("d")) {
							System.out.print("\nVoce gostaria de escolher um assento dessa fileira:\n\n   " 
									+ Arrays.toString(eb) + "\n-->"
									+ Arrays.toString(d) + "<--\n   "
									+ Arrays.toString(c) + "\n   "
									+ Arrays.toString(bb) + "\n   "
									+ Arrays.toString(ab) + "\n\n"
									+ "                           1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
							
							while (escolha == 1) {

								System.out.print("\n\nEscolha um assento:" + Arrays.toString(d));
								assento = sc.nextInt();
		
								int[] d2 = new int[d.length - 1]; 
								System.arraycopy(d, 0, d2, 0, assento); 
								System.arraycopy(d, assento + 1, d2, assento, d.length - assento - 1); 
								d = d2.clone();
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (f.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
							}

						}
						else if (fileira.equalsIgnoreCase("c")) {
							System.out.print("\nVoce gostaria de escolher um assento dessa fileira:\n\n   " 
									+ Arrays.toString(eb) + "\n   "
									+ Arrays.toString(d) + "\n-->"
									+ Arrays.toString(c) + "<--\n   "
									+ Arrays.toString(bb) + "\n   "
									+ Arrays.toString(ab) + "\n\n"
									+ "                           1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
							
							while (escolha == 1) {

								System.out.print("\n\nEscolha um assento:" + Arrays.toString(c));
								assento = sc.nextInt();
		
								int[] c2 = new int[c.length - 1]; 
								System.arraycopy(c, 0, c2, 0, assento); 
								System.arraycopy(c, assento + 1, c2, assento, c.length - assento - 1); 
								c = c2.clone();
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (f.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
							}

						}
						else if (fileira.equalsIgnoreCase("b")) {
							System.out.print("\nVoce gostaria de escolher um assento dessa fileira:\n\n   " 
									+ Arrays.toString(eb) + "\n   "
									+ Arrays.toString(d) + "\n   "
									+ Arrays.toString(c) + "\n-->"
									+ Arrays.toString(bb) + "<--\n   "
									+ Arrays.toString(ab) + "\n\n"
									+ "                           1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
							
							while (escolha == 1) {

								System.out.print("\n\nEscolha um assento:" + Arrays.toString(bb));
								assento = sc.nextInt();
		
								int[] bb2 = new int[bb.length - 1]; 
								System.arraycopy(bb, 0, bb2, 0, assento); 
								System.arraycopy(bb, assento + 1, bb2, assento, bb.length - assento - 1); 
								bb = bb2.clone();
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (f.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
							}

						}
						else if (fileira.equalsIgnoreCase("a")) {
							System.out.print("\nVoce gostaria de escolher um assento dessa fileira:\n\n   " 
									+ Arrays.toString(eb) + "\n   "
									+ Arrays.toString(d) + "\n   "
									+ Arrays.toString(c) + "\n   "
									+ Arrays.toString(bb) + "\n-->"
									+ Arrays.toString(ab) + "<--\n\n"
									+ "                           1.Sim | 2.Nao\n");
							escolha = sc.nextInt();
							
							while (escolha == 1) {
								
								System.out.print("\n\nEscolha um assento:" + Arrays.toString(ab));
								assento = sc.nextInt();

								if (assento > 6){
									int[] ab2 = new int[ab.length - 1]; 
									System.arraycopy(ab, 0, ab2, 0, assento); 
									System.arraycopy(ab, assento + 1, ab2, assento, ab.length - assento - 1); 
									ab = ab2.clone();
									System.out.print("\nAssento " + assento + " comprado!\n");

									if (f.length > 7) {
										System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
										escolha = sc.nextInt();
									} else {
										System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
										escolha = 2;
									}
								} else {
									System.out.print("Esse assento é para pessoas com deficencias.Gostaria de escolher outro?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								}
							}

						}
						else { 
							System.out.print("Essa opcao e invalida");
						}
						
					}//Assentos Preferenciais Beta//
					else if (preferencia == 1) {

						int[] ab3 = ab.clone();
						int[] ab2 = new int[ab.length -18]; 
						System.arraycopy(ab, 0, ab2, 0, 7); 
						ab = ab2.clone();
						System.out.print("Esses sao os assentos disponiveis para pessoas com deficiencia\n\n" 
										 + "Fileira A: -->" + Arrays.toString(ab)
										 + "<--\n\nVoce gostaria de escolher um deles?");
						escolha = sc.nextInt();
							
							while (escolha == 1) {

								System.out.print("\n\nEscolha um assento:" + Arrays.toString(ab));
								assento = sc.nextInt();
		
								ab2 = new int[a.length - 1]; 
								System.arraycopy(ab, 0, ab2, 0, assento); 
								System.arraycopy(ab, assento + 1, ab2, assento, ab.length - assento - 1); 
								ab = ab2.clone();
								System.out.print("\nAssento " + assento + " comprado!\n");

								if (f.length > 1) {
									System.out.print("\nVoce gostaria de escolher mais um assento?\n1.Sim | 2.Nao\n");
									escolha = sc.nextInt();
								} else {
									System.out.print("Perdao, nao ha mais assentos disponiveis nessa fileira");
									escolha = 2;
								}
							}
						a = new int[ab3.length - x];
						System.arraycopy(ab2, 0, ab, 0, 13-x);
						System.arraycopy(ab3, 13, ab, 13-x, 11);	

					}
					System.out.print("Gostaria de comprar ingressos de outra fileira?\n1.Sim | 2.Nao\n");
					sala = sc.nextInt();
				}
				System.out.print("O ingressos restantes nas respectivas fileiras sao esses:\n"); 
				System.out.print("E:" + eb.length + " - 1\n");
				System.out.print("D:" + d.length + " - 1\n");
				System.out.print("C:" + c.length + " - 1\n");
				System.out.print("B:" + bb.length + " - 1\n");
				System.out.print("A:" + ab.length + " - 1\n");
				break;
		}
		System.out.print("\n" + nome + ", seus ingressos foram comprados com sucesso. Aproveite a pipoca gratis e tenha um bom filme.");
  }
}
/*A sala Alpha possui 140 lugares divididos em 6 fileiras (A, B, C, D, E, F) com mais 12 assentos para pessoas com deficiência.
A sala Beta possui 120 lugares divididos em 5 fileiras (A, B, C, D, E) com mais 6 lugares para pessoas com deficiência.

Haverá uma sessão na Sala Alpha de "As Branquelas" e outra sessão na Sala Beta de "A Chegada".

Construa um programa em que uma pessoa compre um ingresso para qualquer uma das salas e possa escolher a fileira em que vai sentar.

Uma vez que o assento seja escolhido, é necessário que o programa exiba quantos lugares ainda estão disponíveis no total e também em quais fileiras.

É importante que o comprador possa escolher a quantidade de ingressos que quer comprar e que ele não possa comprar mais ingressos do que a fileira tenha disponível.

Ao final, o programa deve exibir a mensagem "[COMPRADOR], seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme.".*/