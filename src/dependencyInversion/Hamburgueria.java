package dependencyInversion;

public class Hamburgueria implements IFood {

    @Override
    public void fazerPedido(String pedido) {
        System.out.println("Pedido da Hamburgueria: " + pedido);
    }
}
