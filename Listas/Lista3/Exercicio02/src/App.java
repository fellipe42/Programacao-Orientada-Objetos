import java.util.*;

public class App {

    static final int NUMERO_CRITICOS = 3;
    static Scanner SCAN = new Scanner(System.in);
    static double[] notas = new double[NUMERO_CRITICOS];

    static void receberNotasDosCriticos() {

        for (int i = 0; i < NUMERO_CRITICOS; i++) {
            System.out.print("Digite a nota do " + (i + 1) + "º critico: ");
            notas[i] = SCAN.nextDouble();
        }
    }

    static double imprimirMedia() {

        double somaNotas = 0;
        for (int i = 0; i < NUMERO_CRITICOS; i++) {
            somaNotas += notas[i];
        }
        return somaNotas / NUMERO_CRITICOS;
    }

    public static void main(String[] args) {

        receberNotasDosCriticos(); 

        double media = imprimirMedia();

        System.out.println("A média do filme é: " + Math.round(media));
    }
}
