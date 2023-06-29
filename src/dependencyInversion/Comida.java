package dependencyInversion;

public class Comida {

    private IFood iFood;

    public Comida(IFood iFood) {
        this.iFood = iFood;
    }

    public void fazerPedido(String pedido){
        iFood.fazerPedido(pedido);
    }
}
