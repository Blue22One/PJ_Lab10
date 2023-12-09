package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        Autoturism vehicul1=(Autoturism) context.getBean("Autoturism1");
        System.out.println(vehicul1);

        //Persoana p=(Angajat)context.getBean("angajat");
        Autoturism vehicul2=(Autoturism) context.getBean("Autoturism2");
        System.out.println(vehicul2);

        Vehicul vehicul3 = (Motocicleta) context.getBean("Motocicleta1");
        System.out.println(vehicul3);
        context.registerShutdownHook();
        context.close();
    }
}