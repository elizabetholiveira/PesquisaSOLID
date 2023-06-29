package dependencyInversion;

public class Lanchonete implements IFood {

    @Override
    public void fazerPedido(String pedido) {
        System.out.println("Pedido da Lanchonete: " + pedido);
    }
}
