import java.util.*;

public class App {

    // ESCOPO GLOBAL:

    private static final Scanner SCAN = new Scanner(System.in);
    static final int TAMANHO_MATRIZ = 4;
    public static boolean[][] mapa = new boolean[TAMANHO_MATRIZ][TAMANHO_MATRIZ];

    // MAIN:
    public static void main(String[] args) {

        preencherMatriz(mapa);

        int linha;
        int coluna;

        System.out.println("Digite a coordenada da linha: ");
        linha = Integer.parseInt(SCAN.nextLine());

        System.out.println("Digite a coordenada da coluna: ");
        coluna = Integer.parseInt(SCAN.nextLine());

        // Colocar os numeros como parâmetro na função 2
        ativarTorre(mapa, linha, coluna);

        // Chamar a função 3 para imprimir
        imprimirMapa(mapa, linha, coluna);

    }

    public static void preencherMatriz(boolean[][] matriz) {

        for (int i = 0; i < TAMANHO_MATRIZ; i++) {

            for (int j = 0; j < TAMANHO_MATRIZ; j++) {

                matriz[i][j] = false;
            }

        }
    }

    // FUNÇÃO 2: recebe como param. linha e coluna do jogador e muda para true
    // nessas coords.
    public static void ativarTorre(boolean[][] matriz, int linha, int coluna) {

        for (int i = 0; i < TAMANHO_MATRIZ; i++) {

            for (int j = 0; j < TAMANHO_MATRIZ; j++) {

                if (i == linha && j == coluna) {
                    matriz[i][j] = true;
                }
            }
        }

    }

    // FUNÇÃO 3: Imprime a matriz, trocando True por O e false por X
    public static void imprimirMapa(boolean[][] matriz, int linha, int coluna) {

        for (int i = 0; i < TAMANHO_MATRIZ; i++) {

            for (int j = 0; j < TAMANHO_MATRIZ; j++) {

                if (matriz[i][j] == true && j == 3) {
                    System.out.print("|O|");

                } else if (matriz[i][j] == true) {
                    System.out.print("|O");

                } else if (matriz[i][j] == false && j == 3) {
                    System.out.print("|X|");
                } else {
                    System.out.print("|X");
                }

            }
            System.out.println();
        }
    }
}