package Problema2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Tir extends Vehicul{
    @Value("1000")
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
        return super.toString()+" Tir{" +
                "maxLoad=" + maxLoad +
                '}';
    }
    @PostConstruct
    public void init(){
        System.out.println("init()");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy()");
    }
}
