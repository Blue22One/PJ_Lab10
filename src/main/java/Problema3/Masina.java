package Problema3;

public class Masina {
    private String nr_inmatriculare;
    private String marca;
    private int an_fab;
    private String culoare;
    private double nr_KM;

    public Masina() {
    }

    public Masina(String nr_inmatriculare, String marca, int an_fab, String culoare, double nr_KM) {
        this.nr_inmatriculare = nr_inmatriculare;
        this.marca = marca;
        this.an_fab = an_fab;
        this.culoare = culoare;
        this.nr_KM = nr_KM;
    }

    public String getNr_inmatriculare() {
        return nr_inmatriculare;
    }

    public void setNr_inmatriculare(String nr_inmatriculare) {
        this.nr_inmatriculare = nr_inmatriculare;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAn_fab() {
        return an_fab;
    }

    public void setAn_fab(int an_fab) {
        this.an_fab = an_fab;
    }

    public String getCuloare() {
        return culoare;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public double getNr_KM() {
        return nr_KM;
    }

    public void setNr_KM(double nr_KM) {
        this.nr_KM = nr_KM;
    }

    @Override
    public String toString() {
        return "Masina{" +
                "nr_inmatriculare='" + nr_inmatriculare + '\'' +
                ", marca='" + marca + '\'' +
                ", an_fab=" + an_fab +
                ", culoare='" + culoare + '\'' +
                ", nr_KM=" + nr_KM +
                '}';
    }
}