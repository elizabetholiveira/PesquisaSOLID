package dependencyInversion;

public class Main {
    public static void main(String[] args) {
        IFood lanchonete = new Lanchonete();
        IFood hamburgueria = new Hamburgueria();

        Comida lanche = new Comida(lanchonete);
        lanche.fazerPedido("Eu gostaria de um lanche!");

        Comida hamburguer = new Comida(hamburgueria);
        hamburguer.fazerPedido("Eu gostaria de um hamburguer!");
    }
}
