package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Motocicleta extends Vehicul {
    @Value("350")
    private float maxSpeed;

    public Motocicleta() {
    }

    public Motocicleta(String marca, float pret, float maxSpeed) {
        super(marca, pret);
        this.maxSpeed = maxSpeed;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return super.toString() + " Motocicleta{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    @PostConstruct
    public void Creare() {
        System.out.println("Motocicleta creata");
    }

    @PreDestroy
    public void Distrugere() {
        System.out.println("Motocicleta distrusa");
    }
}
