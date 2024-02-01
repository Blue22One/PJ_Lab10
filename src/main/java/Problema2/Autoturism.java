package Problema2;

public class Autoturism extends Vehicul{
    private float volum;
    private float masa;

    public Autoturism() {
    }

    public Autoturism(String marca, float pret, float volum, float masa) {
        super(marca, pret);
        this.volum = volum;
        this.masa = masa;
    }

    public float getVolum() {
        return volum;
    }

    public void setVolum(float volum) {
        this.volum = volum;
    }

    public float getMasa() {
        return masa;
    }

    public void setMasa(float masa) {
        this.masa = masa;
    }

    @Override
    public String toString() {
        return super.toString()+" Autoturism{" +
                "volum=" + volum +
                ", masa=" + masa +
                '}';
    }
}
