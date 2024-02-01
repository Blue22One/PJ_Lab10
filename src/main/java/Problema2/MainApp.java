package Problema2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        BeanFactory factory=new ClassPathXmlApplicationContext("beans01.xml");
        Autoturism a1 = (Autoturism)factory.getBean("Auto1");
        System.out.println(a1);

        Autoturism a2 = (Autoturism) factory.getBean("Auto2");
        System.out.println(a2);

        AbstractApplicationContext context1 = new ClassPathXmlApplicationContext("beans01.xml");
        Vehicul m1 = (Motocicleta) context1.getBean("Moto1");
        System.out.println(m1);
        context1.registerShutdownHook();
        context1.close();


        //nici cu Application Context nu merge. Daca comentezi liniile 24-27, iti merge programul
        AbstractApplicationContext context2 = new ClassPathXmlApplicationContext("beans02.xml");
        Tir t1 = (Tir)context2.getBean("Tir1");
        System.out.println(t1);
        context2.registerShutdownHook();
        context2.close();
    }
}
