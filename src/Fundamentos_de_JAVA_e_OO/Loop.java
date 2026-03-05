package Fundamentos_de_JAVA_e_OO;

public class Loop {

    static void main(String[] args) {
        System.out.println("----- Contagem Regressiva -----");

//        1.Utilizamos a variavel 'i' commo um item ou índice
        for (int i = 10; i > 0; i--) {
            System.out.println("Faltam " + i + " segundos...");

//        2.Desacelerar o Loop
            try { Thread.sleep(1000); } catch (Exception e) {}
        }
        System.out.println("----- Fim da Contagem -----");
    }
}
