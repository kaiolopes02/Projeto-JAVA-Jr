package Fundamentos_de_JAVA_e_OO;

import java.util.Scanner;

public class CalculadoraMedia {

    static void main(String[] args) {

//        1.Caixa de entrada de dados do usuário
        Scanner caixaTexto = new Scanner(System.in);

        System.out.println("----- Calculadora de Media -----");

//        2.O usuário insere as notas requeridas
        System.out.println("Digite a primeira nota: ");
        double nota1 = caixaTexto.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = caixaTexto.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = caixaTexto.nextDouble();

//        3.Calculo da média das notas
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.println("Sua média finalde notas é: " + media);

//        4.Decisão lógica final com a média
        if (media >= 7) {
            System.out.println("Parabéns! Você passou de ano");
        }else {
            System.out.println("Infelizmente você não passou de ano");
        }
    }
}
