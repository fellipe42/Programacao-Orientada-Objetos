public class Vilao {
    String nome;
    String planoMaligno;
    int forca;

    public void terUmPlano() {
        System.out.println(nome + "esta criando um plano maligno");
    }

    public void dominarMundo(){
        System.out.println(nome + "quer dominar/destruir/resetar/limpar/matar metade da populacao d/transformar o mundo!");
    }

    public void imprimirDetalhes() {
        System.out.println("Vilão: " + nome);
        System.out.println("Plano Maligno: " + planoMaligno);
        System.out.println("Força: " + forca);
    }
}