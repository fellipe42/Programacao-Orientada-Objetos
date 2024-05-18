import java.util.*;

public class App {

    static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = SCAN.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = SCAN.nextLine();

        compararPalavras(palavra1, palavra2);

    }

    static void compararPalavras(String nome1, String nome2) {

        if (nome1.equals(nome2)) {

            System.out.println("As palavras sao identicas");

        } else if (nome1.equalsIgnoreCase(nome2)) {

            System.out.println("As palavras sao iguais ignorando maiusculo e minusculo");

        } else {
            System.out.println("As palavras sao diferentes");

        }
    }

}
