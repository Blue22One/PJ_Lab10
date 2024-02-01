package Problema3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.time.LocalDateTime;
import java.time.Year;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans03.xml");
        BD operatii = (BD) context.getBean("operatiiJDBC");

        int opt;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("0.Iesire");
            System.out.println("1)Adaugare in BD");
            System.out.println("2)Stergere");
            System.out.println("3)Cautare");
            System.out.println("4)Afisare BD");
            System.out.println("5)Afisare cu marca");
            System.out.println("6)Afisare sub 100000");
            System.out.println("7)Afisare <5 ani");
            System.out.println("Dati optiunea:");

            opt = scanner.nextInt();
            switch (opt) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    operatii.insert("BH71LAF", "VW", 2007, "negru", 50000);
                    operatii.insert("HD50ROB", "Audi", 2017, "gri", 10000);
                    operatii.insert("TM02LAG", "Mercedes", 2009, "alb", 80000);
                    operatii.insert("B300FLX", "Mercedes", 2019, "violet", 30000);
                    operatii.insert("BH02LAG", "Dacia Logan", 2020, "albastru", 0);
                    break;
                case 2:
                    System.out.println("Dati nr de inmat:");
                    operatii.delete(scanner.next());
                    break;
                case 3:
                    System.out.println("Dati nr de inmat:");
                    String n = scanner.next();
                    Masina gasit = operatii.getMasina(n);
                    System.out.println(gasit.toString());
                    break;
                case 4:
                    List<Masina> masinaList = operatii.getListaMasini();
                    for (Masina m : masinaList)
                        System.out.println(m.toString());
                    break;
                case 5:
                    System.out.println("Dati marca:");
                    String m = scanner.next();
                    System.out.println(operatii.getNrCuMarca(m));
                    break;
                case 6:
                    List<Masina> mList = operatii.getListaMasini();
                    for (Masina masina : mList)
                        if(masina.getNr_KM()<100000)
                            System.out.println(masina);
                    break;
                case 7:
                    List<Masina> sevenList = operatii.getListaMasini();
                    for (Masina masina : sevenList)
                        if(Year.now().getValue() - masina.getAn_fab() < 5)
                            System.out.println(masina);
                    break;
                default:
                    System.out.println("Optiune inexistenta! Incercati din nou");
            }
        } while (opt != 0);
        scanner.close();
    }
}
