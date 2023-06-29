package interfaceSegregation;

public class Main {
    public static void main(String[] args) {
        Calca calca = new Calca();
        calca.botar();

        Bota bota = new Bota();
        bota.calcar();
    }
}
