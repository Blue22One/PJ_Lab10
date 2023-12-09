package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Vehicul {
    @Value("Audi")
    private String marca;
    @Value("600000")
    private float pret;

    public Vehicul() {
    }

    public Vehicul(String marca, float pret) {
        super();
        this.marca = marca;
        this.pret = pret;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPret() {
        return pret;
    }

    public void setPret(float pret) {
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Vehicul{" +
                "marca='" + marca + '\'' +
                ", pret=" + pret +
                '}';
    }
}
