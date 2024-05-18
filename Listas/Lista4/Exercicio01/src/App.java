public class App {
    public static void main(String[] args) throws Exception {

        Vingador homemAranha = new Vingador();
        homemAranha.nome = "Homem-Aranha";
        homemAranha.identidadeSecreta = "Peter Parker";
        homemAranha.poderPrincipal = "Agilidade e teia";
        homemAranha.fraqueza = "Vulnerabilidade a ataques físicos";
        homemAranha.imprimirDetalhes();

        Vilao duendeVerde = new Vilao();
        duendeVerde.nome = "Duende Verde";
        duendeVerde.planoMaligno = "Espalhar o caos em Nova York";
        duendeVerde.forca = 8;
        duendeVerde.imprimirDetalhes();

        Poder superForca = new Poder();
        superForca.nome = "Super Força";
        superForca.descricao = "Capacidade de levantar objetos pesados";
        superForca.imprimirDetalhes();

    }
}
