public class Vingador {

    String nome;
    String identidadeSecreta;
    String poderPrincipal;
    String fraqueza;

    public void salvarMundo(){
        System.out.println(nome + " esta ajudando o Gavião Arqueiro a salvar o mundo!");

    }

    public void tentarLevantarMjolnir() {
        System.out.println(nome + "esta tentando levantar o martelo do Thor");
    }

    public void imprimirDetalhes() {
        System.out.println("Vingador: " + nome);
        System.out.println("Identidade Secreta: " + identidadeSecreta);
        System.out.println("Poder Principal: " + poderPrincipal);
        System.out.println("Fraqueza: " + fraqueza);

    }
}
