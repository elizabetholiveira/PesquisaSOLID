package singleResponsibility;

//Classe Geladeira responsável pelas variáveis

public class Geladeira {

    private int apples;

    public Geladeira(int apples) {
        this.apples = apples;
    }

    public int getApples() {
        return apples;
    }

    public void setApples(int apples) {
        this.apples = apples;
    }

}
