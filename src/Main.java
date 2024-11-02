public class Main {
    public static void main(String[] args) {
        Sekil daire = new Daire(5);
        Sekil kare = new Kare(4);

        System.out.println("Dairenin Alanı: " + daire.alan());
        System.out.println("Dairenin Çevresi: " + daire.cevre());

        System.out.println("Karenin Alanı: " + kare.alan());
        System.out.println("Karenin Çevresi: " + kare.cevre());
    }
}
