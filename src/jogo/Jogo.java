package jogo;

import java.util.Scanner;

public class Jogo {

    public static void main(String[] args) {

        int numero;

        Scanner teclado = new Scanner(System.in);
        LogicaDoJogo lg = new LogicaDoJogo();

        try {

            String cor = "\u001B[";

            System.out.print(cor + "32" + "m");
            System.out.println("------------------------");
            System.out.print(cor + "m");
            System.out.println("Vamos jogar?");
            System.out.println("0 - Para encerrar");
            System.out.println("1 - Pedra");
            System.out.println("2 - Papel");
            System.out.println("3 - Tesoura");
            System.out.println("Digite um numero: ");
            numero = teclado.nextInt();

            switch (numero) {

                case 0:
                    System.out.print(cor + "32" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");
                    System.out.print(cor + "33" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");
                    lg.Encerrado();
                    System.out.print(cor + "33" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");

                    break;

                case 1:
                    System.out.print(cor + "32" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");
                    System.out.print(cor + "33" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");
                    lg.Pedra();
                    System.out.print(cor + "33" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");
                    break;

                case 2:

                    System.out.print(cor + "32" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");
                    System.out.print(cor + "33" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");
                    lg.Papel();
                    System.out.print(cor + "33" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");

                    break;

                case 3:

                    System.out.print(cor + "32" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");
                    System.out.print(cor + "33" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");
                    lg.Tesoura();
                    System.out.print(cor + "33" + "m");
                    System.out.println("------------------------");
                    System.out.print(cor + "m");

                    break;

                default:
                    break;

            }

        } catch (Exception e) {

            String cor2 = "\u001B[";
            System.out.print(cor2 + "31" + "m");
            System.out.println("------------------------");
            System.out.print(cor2 + "m");
            System.out.println("Você digitou um caractere invalido!");
            System.out.print(cor2 + "31" + "m");
            System.out.println("------------------------");
            System.out.print(cor2 + "m");

        } finally {
            teclado.close();
        }

    }

}
