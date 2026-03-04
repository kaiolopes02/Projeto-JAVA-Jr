package Fundamentos_de_JAVA_e_OO;

public class Variaveis {

    static void main(String[] args) {

//        1.Declarando Variáveis
        int idade = 22;
        double altura = 1.7;
        boolean gostoDeProgramar = true;
        String nome = "Kaio";

//        2.Imprimindo os dados
        System.out.println("Oi, me chamo " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " metros");
        System.out.println("Eu gosto de progrmar? " + gostoDeProgramar);
        System.out.println("--------------------------------------");

//        3.Mudando valores
        idade = 22;
        altura = 1.68;
        gostoDeProgramar = false;
        nome = "Flávia";

//        4.Imprimindo os valores novos
        System.out.println("Oi, me chamo " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Minha altura é " + altura + " metros");
        System.out.println("Eu gosto de progrmar? " + gostoDeProgramar);
    }

}
