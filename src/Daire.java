// Daire sınıfı
class Daire implements Sekil {
    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }

    @Override
    public double alan() {
        return Math.PI * yaricap * yaricap;
    }

    @Override
    public double cevre() {
        return 2 * Math.PI * yaricap;
    }
}



