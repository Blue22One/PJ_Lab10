package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Tir extends Vehicul{
    private int maxLoad;

    public Tir() {
    }

    public Tir(String marca, float pret, int maxLoad) {
        super(marca, pret);
        this.maxLoad = maxLoad;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    @Override
    public String toString() {
        return super.toString() + " Tir{" +
                "maxLoad=" + maxLoad +
                '}';
    }
}
