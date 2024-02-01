package Problema2;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Motocicleta extends Vehicul implements InitializingBean, DisposableBean{
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
        return super.toString()+" Motocicleta{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }
    public void init(){
        System.out.println("init()");
    }
    public void disp(){
        System.out.println("disp()");
    }
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean - afterPropertiesSet()");
    }
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean - destroy()");
    }
}
