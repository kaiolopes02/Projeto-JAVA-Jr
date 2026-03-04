package Fundamentos_de_JAVA_e_OO;

import java.util.Scanner;

public class QuizMatematica {

    static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        int pontos = 0; // Começamos com zero pontos

        System.out.println("----- Bem-vindo ao quiz de matemática -----");

//        Pergunta  1: Soma
        System.out.println("\nPergunta 1: Quanto é 15 + 25?");
        int resposta1 = leitor.nextInt();

//        Usar o operador lógico '==' para comparar se é igual
        if (resposta1 == 40) {
            System.out.println("Acertou, +10 pontos.");
            pontos += 10;
        }else {
            System.out.println("Errou,a resposta era 40.");
        }

//        Pergunta 2: Multiplicação
        System.out.println("\nPergunta 2: Quanto é 7 x 8?");
        int resposta2 = leitor.nextInt();

        if (resposta2 == 56) {
            System.out.println("Acertou, +10 pontos.");
            pontos += 10;
        }else  {
            System.out.println("Errou,a resposta era 56.");
        }

//        Resultado final
        System.out.println("\n----- Fim de Jogo -----");
        System.out.println("\nSua pontuação foi: " + pontos);

//        Utilização do operador lógico '>'
        if (pontos == 20) {
            System.out.println("Parabéns, você acertou todas as questôes!");
        } else if (pontos > 0 && pontos < 20) {
            System.out.println("Você acertou algumas questões, tente novamente.");
        } else {
            System.out.println("Você não fez nenhum ponto, tente novamente.");
        }
    }
}
