package singleResponsibility;

public class Main {
    public static void main(String[] args) {

        Geladeira geladeira = new Geladeira(3);

        Acoes acoes = new Acoes();

        acoes.quantidadeMacas(geladeira);

        acoes.adicionarMaca(geladeira);

        acoes.quantidadeMacas(geladeira);

    }
}
