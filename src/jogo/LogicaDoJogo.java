package jogo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LogicaDoJogo {

    private final String lista[] = {"Pedra", "Papel", "Tesoura"};
    private final List<String> jogo = Arrays.asList(lista);
    private final String maquina = jogo.get(new Random().nextInt(jogo.size()));

    public LogicaDoJogo() {
    }

    public void Encerrado(){
        System.out.println("Jogo encerrado");
    }
    
    public void Pedra() {

        if (null != maquina) {
            switch (maquina) {
                case "Pedra":
                    System.out.println("Você escolheu: Pedra");
                    System.out.printf("A maquina escolheu: %s", maquina);
                    System.out.println();
                    System.out.println("Rseultado da partida: Emapete!");
                    break;
                case "Papel":
                    System.out.println("Você escolheu: Pedra");
                    System.out.printf("A maquina escolheu: %s", maquina);
                    System.out.println();
                    System.out.println("Rseultado da partida: Você perdeu!");
                    break;
                case "Tesoura":
                    System.out.println("Você escolheu: Pedra");
                    System.out.printf("A maquina escolheu: %s", maquina);
                    System.out.println();
                    System.out.println("Rseultado da partida: Você ganhou!");
                    break;
                default:
                    break;
            }
        }
    }

    public void Papel() {

        if (null != maquina) {
            switch (maquina) {
                case "Pedra":
                    System.out.println("Você escolheu: Papel");
                    System.out.printf("A maquina escolheu: %s", maquina);
                    System.out.println();
                    System.out.println("Rseultado da partida: Você ganhou!");
                    break;
                case "Papel":
                    System.out.println("Você escolheu: Papel");
                    System.out.printf("A maquina escolheu: %s", maquina);
                    System.out.println();
                    System.out.println("Rseultado da partida: Emapate!");
                    break;
                case "Tesoura":
                    System.out.println("Você escolheu: Papel");
                    System.out.printf("A maquina escolheu: %s", maquina);
                    System.out.println();
                    System.out.println("Rseultado da partida: Você Perdeu!");
                    break;
                default:
                    break;
            }
        }
    }

    public void Tesoura() {

        if (null != maquina) {
            switch (maquina) {
                case "Pedra":
                    System.out.println("Você escolheu: Tesoura");
                    System.out.printf("A maquina escolheu: %s", maquina);
                    System.out.println();
                    System.out.println("Rseultado da partida: Você perdeu!");
                    break;
                case "Papel":
                    System.out.println("Você escolheu: Tesoura");
                    System.out.printf("A maquina escolheu: %s", maquina);
                    System.out.println();
                    System.out.println("Rseultado da partida: Você ganhou!");
                    break;
                case "Tesoura":
                    System.out.println("Você escolheu: Tesoura");
                    System.out.printf("A maquina escolheu: %s", maquina);
                    System.out.println();
                    System.out.println("Rseultado da partida: Empate!");
                    break;
                default:
                    break;
            }
        }

    }

}
