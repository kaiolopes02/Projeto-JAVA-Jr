package Fundamentos_de_JAVA_e_OO;

import java.util.Random;
import java.util.Scanner;

public class QuizAleatorio {

    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random dado = new Random(); // Criação do 'dado'

        System.out.println("----- Desafio de Matemática Aleatório -----");

//        1. Seleção aleatória dos números
        int num1 = dado.nextInt(11);
        int num2 = dado.nextInt(11);

//        2. Conta realizada para ter o resultado
        int resultadoCerto = num1 * num2;

//        3.O desafio começa
        System.out.println("\nOs numeros sorteados são " + num1 + " e " + num2);
        System.out.println("Qual o valor da multiplicação dos dois numeros?");

        int resposta = leitor.nextInt();

//        4.Resultado final
        if (resposta == resultadoCerto) {
            System.out.println("\nParabéns, você acertou a resposta!");
        } else {
            System.out.println("\nInfelizmente você errou, a resposta certa era " + resultadoCerto);
        }
        System.out.println("----- Fim do Desafio -----");

    }
}
