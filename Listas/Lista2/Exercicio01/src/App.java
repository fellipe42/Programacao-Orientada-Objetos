import java.util.*;

public class App {

    static final int NUMERO_PERGUNTAS = 3;
    static String[] RESPOSTAS = new String[NUMERO_PERGUNTAS];
    static String[] GABARITO = new String[NUMERO_PERGUNTAS];
    static Scanner SCAN = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Chama função 2
        String nomeParticipante = receberNomeParticipantes();
        // Chama função 3
        comecarQuiz(nomeParticipante);
        //Chama perguntas
        fazerQuestao1(nomeParticipante);
        fazerQuestao2(nomeParticipante);
        fazerQuestao3(nomeParticipante);
        // Chama função 6
        mostraResultado(nomeParticipante);
        // Chama função 7
        agradecerPelaParticipacao(nomeParticipante);

    }

    // Função 2 - Pergunta o nome da pessoa e retorna formatado pela função 1

    static String receberNomeParticipantes() {
        System.out.println(
                """
                        Prove que você é um conhecedor dos principais metais da ficcção!
                        Antes de iniciarmos o Quiz,
                        como você quer ser chamado?

                            """

        );

        return formatarNome(SCAN.nextLine());

    }

    // Função 1 - Recebe um nome e formata para inicial maiuscula e resto minusculo

    static String formatarNome(String nome) {
        if (nome.isBlank()) {
            return "NPC";
        }
        nome = nome.trim();
        String[] nomeCompleto = nome.split(" ");
        String primeiroNome = nomeCompleto[0];
        String primeiraLetraDoNome = String.valueOf(primeiroNome.charAt(0));
        String primeiroNomeSemInicial = primeiroNome.substring(1);
        String nomeFormatado = primeiraLetraDoNome.toUpperCase() + primeiroNomeSemInicial;
        return nomeFormatado;
    }

    // Função 3 - Comerçar o quiz apertando o Enter, apresenta uma saudação
    static void comecarQuiz(String nomeParticipante) {

        System.out.println(String.format(
                """
                        %s, vamos começar?
                        As questões serão referentes aos metais famosos da cultura pop!

                        (Ao responder digite somente a letra da alternativa desejada.
                        Fazer qualquer coisa diferente disso
                        será equivalente a dar uma mamada no capeta, ou seja, estará errado.)

                        Aperte ENTER para iniciar!

                            """, nomeParticipante));

        SCAN.nextLine();
    }

    // Função QUESTÃO 1
    public static void fazerQuestao1(String nome) {
        String resposta = "";

        do {
            System.out.println(
                    """
                            De qual dessas ligas metálicas é feita o escudo do Capitão América nas HQs?
                            A - Vibranium e Uru
                            B - Adamantium e Vibranium
                            C - Eternium e Carbonadium
                            """);

            resposta = SCAN.nextLine();
        } while (!conferirResposta(resposta));

        GABARITO[0] = "B";
        RESPOSTAS[0] = resposta;

    }

    // Função QUESTÃO 2

    public static void fazerQuestao2(String nome) {
        String resposta = "";

        do {
            System.out.println(
                    """
                            Quais desses metais são conhecidos por serem virtualmente indestrutiveis?
                            A - Dalekanium e afroidium
                            B - Dargonita e adamantium  
                            C - Carbonita e Osmium
                            """);

            resposta = SCAN.nextLine();
        } while (!conferirResposta(resposta));

        GABARITO[1] = "B";
        RESPOSTAS[1] = resposta;
    }

    // Função QUESTÃO 3
    public static void fazerQuestao3(String nome) {
        String resposta = "";

        do {
            System.out.println(
                    """
                            Qual desses metais mágicos fazem parte do universo da DC Comics?
                            A - Mithril e Baskar
                            B - Energon e Kriptonita azul
                            C - Amazonium e Eternium
                            """);

            resposta = SCAN.nextLine();
        } while (!conferirResposta(resposta));

        GABARITO[2] = "C";
        RESPOSTAS[2] = resposta;
    }

    // Função 5 - recebe como parametro a resposta do usuário, se a entrada for
    // vazia ou em branco: false, c n true
    static boolean conferirResposta(String resposta) {
        if (resposta.isBlank()) {
            System.out.println(
                    """
                            Infelizmente essa sua resposta eh equivalente a voce ter dado uma mamada no capeta :(
                                Vamos tentar de novo s2
                            """);
            return false;
        }
        return true;
    }

    // Função 6 - mostra o resultado do Quiz
    static void mostraResultado(String nomeParticipante) {
        System.out.println(String.format(
                """
                        %s, vamos descobrir o quanto voce entende sobre as ligas metalicas da ficcao:
                         """,
                nomeParticipante));
        for (int i = 0; i < NUMERO_PERGUNTAS; i++) {
            System.out.println(String.format(
                    "%s - %s", (i + 1), RESPOSTAS[i].equalsIgnoreCase(GABARITO[i]) ? "ACERTOU" : "ERROU"));
        }
    }

    // Função 7 - Agradece por ter participado

    static void agradecerPelaParticipacao(String nomeParticipante) {
        System.out.println(String.format(
                """
                        %s, parabens e obrigado por ter se disposto a participar!
                        Estude mais sobre a fisica dos elementos quimicos da cultura pop e volte mais vezes!
                        Valeu!!

                            """, nomeParticipante

        ));
    }

}
