/*
 *  Developed by András Ács (acsandras@gmail.com)
 *  Erhvervsakademi Sjælland / www.easj.dk
 *  Licensed under the WFTPL License - http://www.wtfpl.net/txt/copying/ 
 *  2017
 *
 */
package fange_krukke_sandsynlighed;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author andrasacs
 */
public class Fange_Krukke_Sandsynlighed {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Krukke k1 = new Krukke(0, 1); // 0 sorte, en hvid
        Krukke k2 = new Krukke(50, 49);
        int sortCount = 0;
        int hvidCount = 0;
        int runde = 10;
        Random r = new Random();

        for (int j = 0; j < runde; j++) {

            //System.out.println("Jeg vælger en tilfældig krukke: ");
            Krukke valgtKrukke;
            if (r.nextBoolean()) {
                valgtKrukke = k1;
            } else {
                valgtKrukke = k2;
            }
            //System.out.println(valgtKrukke.toString());
            //System.out.println("Jeg vælger en fra krukken:");
            int top = valgtKrukke.krukkensIndhold.size();
            int valgtBrik = r.nextInt(top);
            String farve = valgtKrukke.krukkensIndhold.get(valgtBrik).toString();
            //System.out.println(farve);
            if (farve == "hvid") {
                hvidCount++;
            }
            if (farve == "Sort") {
                sortCount++;
            }
        }
        double h = (double) hvidCount / runde * 100;
        String hStr = String.valueOf(h);
        double s = (double) sortCount / runde * 100;
        String sStr = String.valueOf(s);
        //String h = String.valueOf(hvidCount/runde);
        System.out.println("Hvid træk %: " + hStr + ". Sort træk %: " + sStr);
int frihedsCount = 0, faengselsCount = 0;
        
        int counter =1000;
        for (int j = 0; j < counter; j++) {
            ArrayList frihed = new ArrayList();

            frihed.add("Frihed");
            frihed.add("Fængsel");
            frihed.add("Fængsel");
            System.out.println(frihed.toString());
            int rand = r.nextInt(3);
            System.out.println(frihed.get(rand));
            int choice = r.nextInt(3);
            int newchoice = 0;
            if (choice == 0) {
                frihed.remove(2);
                newchoice = 1;
                System.out.println("a");
            }
            if (choice == 1) {
                frihed.remove(2);
                newchoice = 0;
                System.out.println("b");
            }
            if (choice == 2) {
                frihed.remove(1);
                newchoice = 0;
                System.out.println("c");
            }
            System.out.println(newchoice);
            String result = frihed.get(newchoice).toString();
            //System.out.println(result);
            
            if (result == "Frihed") {
                frihedsCount++;
            }
            if (result == "Fængsel") {
                faengselsCount++;
            }
        }
        String friStr;
        friStr  = String.valueOf(frihedsCount);
        System.out.println("Fri " + friStr + " af " + counter );
    }

}
