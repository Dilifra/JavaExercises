/*Crie uma classe para um ônibus turístico para levar pessoas de São Paulo até uma cidade turística.
A classe deve armazenar o local atual, quantidade de paradas, capacidade do ônibus e quantas pessoas estão
presentes nele. A classe deve também disponibilizar os seguintes métodos: Inicializa (método construtor),
 Entra (quando entra alguém), Sai (quando alguém desce do ônibus), Parar (o ônibus para de andar) e andar.

Crie um prgrama que instacie essa classe três vezes, listando suas paradas, quantas pessoas sobem e
quantas pessoas descem. Dentro do programa, deve ser possível modificar cada um dos atributos do ônibus.*/
import java.util.*;

public class ProgramaOnibus {
    public static void main(String[] args) { 

        Scanner descer = new Scanner(System.in);
        
        Onibus Onibus1 = new Onibus ("Sao Paulo",0,30,14);

        Onibus1.Liga();

        while (Onibus1.ReturnParadas() < 3) {
            
            Onibus1.Andar();
            System.out.print("\nO onibus esta saindo de " + Onibus1.ReturnLocal() + " com " + Onibus1.ReturnPessoas() + "passageiros, a velocidade de " + Onibus1.ReturnVelocidade() + ", logo chegaremos no destino\n");
            Onibus1.Paradas();
            Onibus1.Parar();
            Onibus1.AbrirPorta();
            System.out.print("\nSeguir para a proxima parada\n1.Sim | 2.Nao");
            int resposta = descer.nextInt();
            if (resposta == 2){
                System.out.print("Voce desceu e o onibus seguiu viagem");
                Onibus1.paradas = 3;
            } else if (resposta == 1){
                Onibus1.Sair();
                Onibus1.Entrar();
                Onibus1.FecharPorta();
            }
        }
    }
}

/*Crie uma classe denominada Elevador para armazenar as informações de um elevador dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão presentes nele. A classe deve também disponibilizar os seguintes métodos:



Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra: para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver espaço);
Sai: para remover uma pessoa do elevador (só deve remover se houver alguém dentro dele);
Sobe: para subir um andar (não deve subir se já estiver no último andar);
Desce: para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get); */
