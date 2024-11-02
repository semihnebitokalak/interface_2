// Kare sınıfı
class Kare implements Sekil {
    private double kenar;

    public Kare(double kenar) {
        this.kenar = kenar;
    }

    @Override
    public double alan() {
        return kenar * kenar;
    }

    @Override
    public double cevre() {
        return 4 * kenar;
    }
}
