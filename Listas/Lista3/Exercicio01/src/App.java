import java.util.*;

public class App {

    static final int ANO_ATUAL = 2024;
    static Scanner SCAN = new Scanner (System.in);
    public static void main(String[] args) throws Exception {

        System.out.println("Digite o ano de nascimento: ");

        int anoNascimento = SCAN.nextInt();
        int idade = calcularIdade(anoNascimento);

        System.out.println("Até o final de " + ANO_ATUAL + " você terá " + idade + " anos de idade.");

    }

    static int calcularIdade (int anoNascimento) {
        return ANO_ATUAL - anoNascimento;

    }
}
