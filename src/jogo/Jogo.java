package jogo;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);
        LogicaDoJogo lg = new LogicaDoJogo();

        try {
            System.out.println("------------------------");
            System.out.println("Vamos jogar?");
            System.out.println("0 - Para encerrar");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.println("Digite um numero: ");
            numero = teclado.nextInt();

            switch (numero) {

                case 0:
                    System.out.println("------------------------");
                    lg.Encerrado();
                    break;

                case 1:
                    System.out.println("------------------------");
                    lg.Pedra();
                    break;

                case 2:
                    System.out.println("------------------------");
                    lg.Papel();
                    break;

                case 3:
                    System.out.println("------------------------");
                    lg.Tesoura();
                    break;

                default:
                    break;

            }

        } catch (Exception e) {
            System.out.println("Você digitou um caractere invalido!");
        }
        
        finally{
        teclado.close();
        }

    }

}
