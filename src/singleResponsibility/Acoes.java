package singleResponsibility;

//Classe Acoes responsável pelos métodos

public class Acoes {

    Geladeira geladeira = new Geladeira(0);
    public int adicionarMaca(Geladeira geladeira){
        int macas = geladeira.getApples() + 1;
        geladeira.setApples(geladeira.getApples() + 1);
        System.out.println("Você adicionou uma maçã na geladeira!");
        return macas;
    }

    public void quantidadeMacas(Geladeira geladeira){
        System.out.println("Existem " + geladeira.getApples() + " maçãs na geladeira");
    }

}
