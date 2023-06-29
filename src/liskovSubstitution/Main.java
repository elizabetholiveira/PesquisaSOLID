package liskovSubstitution;

public class Main {
    public static void main(String[] args) {
        Macas maca = new Macas();
        MacaVerde macaVerde = new MacaVerde();

        maca.temMaca();

        macaVerde.temMaca();
    }
}
