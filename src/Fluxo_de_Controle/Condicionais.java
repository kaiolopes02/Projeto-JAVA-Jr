package Fluxo_de_Controle;

import java.util.Scanner;

public class Condicionais {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int energia = 0;

        System.out.println("--- Aventura do herói ---");
        System.out.println("Digite a energia do herói, entre 0 a 100");
        energia = input.nextInt();

        if (energia > 60 && energia <= 100) {
            System.out.println("O herói está forte e pode lutar!");
        } else {
            System.out.println("O herói está cansado, melhor descansar.");

            try { Thread.sleep(2000); } catch (Exception e) { e.printStackTrace(); }
            System.out.println("\nO herói precisa se recuperar.");

            try { Thread.sleep(2000); } catch (Exception e) { e.printStackTrace(); }
            System.out.println("O herói foi para uma loja de poções.");

            try { Thread.sleep(2000); } catch (Exception e) { e.printStackTrace(); }
            System.out.println("O herói tem três opções de poção, escolha um número correspondente.");

            try { Thread.sleep(2000); } catch (Exception e) { e.printStackTrace(); }
            System.out.println("1.Poção de cura, 2. Poção de Força, 3. Poção de Invisibidade");
            int pocaoEscolhida = input.nextInt();

            switch (pocaoEscolhida) {
                case 1:
                    System.out.println("Você bebeu a poção de cura, o seu herói recuperou +20 HP.");
                    break;
                case 2:
                    System.out.println("Você bebu a poção de força, o seu herói ganhou +15 energias.");
                    break;
                case 3:
                    System.out.println("Você bebeu a poção de invisibilidade, o herói coseguiu descansar.");
                    break;
                default:
                    System.out.println("Essa poção não existe, escolha outra poção.");
                    break;
            }
        }
    }
}
