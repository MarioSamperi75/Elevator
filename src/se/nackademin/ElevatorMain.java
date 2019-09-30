package se.nackademin;

import java.util.ArrayList;

/**
 *En klass för att implementera klassen Elevator
 */
public class ElevatorMain {


    /**
     *Main metoden i klassen ElevatorMain som testar kostruktorerna
     *och instansmetoderna i Klass Elevator.
     *Utskriften är en tabell som förklarar alla prov steg för steg.
     *Metoden använder tillfälliga try-catch för att kunna visa alla prov på en gång.
     */
    public static void main(String[] args) {

        Elevator el1 = new Elevator();

        System.out.println("-----------------Test hiss 1-------------------");
        System.out.println("(man anger inget värde vid objekt skapelsen.)");
        System.out.println();
                System.out.println("// where()      ------> " + el1.where());
                System.out.print("// goTo(-44)    ------>");
        try {
            el1.goTo(-44);
        } catch (Exception e) {
            System.out.println("\t" + e.getMessage());
        }
        System.out.print("// goTo(9)      ------> ");
        el1.goTo(9);
        System.out.println("// where()      ------> "+ el1.where());
        System.out.print("// goTo(9)      ------> ");
        el1.goTo(9);
        System.out.println("// where()      ------> " + el1.where());
        System.out.print("// goTo(0)      ------> ");
        el1.goTo(0);
        System.out.println("// where()      ------> " + el1.where());


        System.out.println();


        System.out.println("-----------------Test hiss 2------------------");
        System.out.println("(man anger ett otillåtet värde vid objekt skapelsen.)");
        System.out.println();
        Elevator el2 = null;
        try {
            el2 = new Elevator(-3);
        } catch (Exception e) {
            System.out.println("// Elevator el2 = new Elevator(-3)  ------>  " + e.getMessage());
            System.exit(0);
        }
        System.out.println("// where()      ------> "+ el2.where());
        System.out.print("// goTo(8)      ------> ");
        el2.goTo(8);
        System.out.println("// where()      ------> " + el2.where());
        System.out.print("// goTo(4)      ------> ");
        el2.goTo(4);
        System.out.println("// where()      ------> " + el2.where());



    }
}
