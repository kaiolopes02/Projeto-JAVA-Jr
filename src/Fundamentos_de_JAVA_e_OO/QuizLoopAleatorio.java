package Fundamentos_de_JAVA_e_OO;

import java.util.Random;
import java.util.Scanner;

public class QuizLoopAleatorio {
    static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random sorteador = new Random();
        int pontosFinal = 0;

        System.out.println("-----Bem Vindo ao Quiz Aleatorio de Matemática-----");

//        1.3 Loops
        for (int i = 1; i <= 3; i++) {
            int num1 = sorteador.nextInt(10) + 1; // números de 1 a 10
            int num2 = sorteador.nextInt(10) + 1;
            int respostaCorreta = num1 * num2;

            System.out.println("\n--- Rodada " + i + "---");
            System.out.println("Quanto é " + num1 + " x " + num2 + " ? ");
            int resposta = leitor.nextInt();

//            2.Verificação da resposta do jogador
            if (resposta == respostaCorreta) {
                System.out.println("Resposta Correta! Obteve 10 pontos");
                pontosFinal += 10;
            }else  {
                System.out.println("Resposta Errada, a resposta era " + respostaCorreta);
            }
        }
//        3.Resultado final
        System.out.println("\nFim de Jogo, sua pontuação foi de " + pontosFinal + " pontos");

        if (pontosFinal == 30) {
            System.out.println("Parabéns, você acertou todas as questões");
        }else {
            System.out.println("Ótimo, tente novamente para obter a pontuação máxima");
        }
    }
}
