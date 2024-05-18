public class Poder {
    String nome;
    String descricao;

    public void usar(){
        System.out.println("Quem tem o melhor poder eh : " + nome);
    }

    public void imprimirDetalhes() {
        System.out.println("Poder: " + nome);
        System.out.println("Descrição: " + descricao);
    }
}