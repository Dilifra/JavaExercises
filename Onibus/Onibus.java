/*Crie uma classe para um ônibus turístico para levar pessoas de São Paulo até uma cidade turística.
A classe deve armazenar o local atual, quantidade de paradas, capacidade do ônibus e quantas pessoas estão
presentes nele. A classe deve também disponibilizar os seguintes métodos: Inicializa (método construtor),
 Entra (quando entra alguém), Sai (quando alguém desce do ônibus), Parar (o ônibus para de andar) e andar.

Crie um prgrama que instacie essa classe três vezes, listando suas paradas, quantas pessoas sobem e
quantas pessoas descem. Dentro do programa, deve ser possível modificar cada um dos atributos do ônibus.*/
import java.util.Random;

public class Onibus {
    
    String localAtual;
    int paradas;
    int assentosOnibus;
    int pessoas;
    boolean portas;
    int velocidade;
    int entrar;
    int sair;

    public Onibus(String localAtual, int paradas, int assentosOnibus,int pessoas) {
        this.localAtual = localAtual;
        this.paradas = paradas;
        this.assentosOnibus = assentosOnibus;
        this.pessoas = pessoas;
    }

    Random gerador = new Random();

    public String ReturnLocal(){
        return this.localAtual;
    }

    public int ReturnParadas(){
        return paradas;
    }

    public int ReturnPessoas() {
        return this.pessoas;
    }

    public int ReturnVelocidade() {
        return velocidade;
    }

    public void Liga() {
        System.out.println("O onibus esta ligado\n");
    }

    public void Andar(){
        this.velocidade = gerador.nextInt(80);
    }

    public void Parar(){
        this.velocidade = 0;
        System.out.print("Chegamos em " + localAtual + ", a velocidade atual e " + velocidade + "\n");
    }

    public void AbrirPorta() {
        portas = true;
        System.out.print("As portas se abriram, os passageiros ja podem sair, novos passageiros, por favor espere todos descerem para embarcar\n");
    }

    public void FecharPorta() {
        portas = false;
        System.out.print("Todos os passageiros embarcaram e as portas fecharam, agora o onibus vai partir\n");
    }

    public void Paradas() {
        paradas++;
    }

    public void Local() {
        if (paradas == 1){
            localAtual = "cidade1";
        } else if (paradas == 2){
            localAtual = "cidade2";
        } else if (paradas == 3){
            localAtual = "cidade3";
        } else if (paradas == 0){
            localAtual = "São Paulo";
        }
    }

    public void Entrar() {
        entrar = gerador.nextInt(assentosOnibus-pessoas);
        pessoas = pessoas + entrar;
        System.out.print(entrar + " passageiros embarcaram, as portas iram se fechar\n");
    }

    public void Assentos() {
        assentosOnibus = assentosOnibus - pessoas;
    }

    public void Sair() {
        sair = gerador.nextInt(pessoas);
        pessoas = pessoas - sair;
        System.out.print(sair + " passageiros desembarcaram\n");
    }

}
