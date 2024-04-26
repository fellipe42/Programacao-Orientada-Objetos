import java.io.Console;
import java.util.*;

public class App {

    // ESCOPO GLOBAL:

    private static final Scanner READ = new Scanner(System.in);
    static final int TAMANHO_VETOR = 10;

    // MAIN:
    public static void main(String[] args) {

        // Chamar função 1 para preencher vetor
        System.out.println("Digite 10 numeros: ");
        int[] lista = new int[TAMANHO_VETOR];
        preencherVetor(lista);

        // Criar uma variável comum e pedir um numero para preenchê-la
        int numeroProcurado;
        System.out.println("Digite o numero procurado na lista: ");
        numeroProcurado = Integer.parseInt(READ.nextLine());

        // Colocar o numero como parâmetro na função 2
        // Criar uma variável boolean e salvar o retorno da função 2
        boolean resultado;
        resultado = procurarValor(lista, numeroProcurado);

        // Criar um IF para true escrever ACHEI, para false NÃO ACHEI
        if (resultado) {
            System.out.println("ACHEI");
        } else {
            System.out.println("NÃO ACHEI");
        }

    }

    // FUNÇÃO 1:
    public static void preencherVetor(int[] vetor) {

        for (int i = 0; i < TAMANHO_VETOR; i++) {
            vetor[i] = Integer.parseInt(READ.nextLine());
        }
    }

    // FUNÇÃO 2:
    public static boolean procurarValor(int[] vetor, int numero) {

        for (int i = 0; i < TAMANHO_VETOR; i++) {

            if (vetor[i] == numero) {
                return true;
            }
        }
        return false;
    }

}
