/*
 *  Developed by András Ács (acsandras@gmail.com)
 *  Erhvervsakademi Sjælland / www.easj.dk
 *  Licensed under the WFTPL License - http://www.wtfpl.net/txt/copying/ 
 *  2017
 *
 */
package fange_krukke_sandsynlighed;

import java.util.ArrayList;

/**
 *
 * @author andrasacs
 */
public class Krukke {

    public ArrayList krukkensIndhold = new ArrayList();

    public Krukke(int sorte, int hvide) {
        String sortStr = "Sort";
        String hvidStr = "Hvid";
        
        if (sorte > 0) {
            for (int i = 0; i < sorte; i++) {
                krukkensIndhold.add(sortStr);
            }
        }
        if (hvide > 0) {
            for (int i = 0; i < hvide; i++) {
               krukkensIndhold.add("hvid");
            }
        }
        //System.out.println("Krukken indeholder " + sorte + " sorte " + hvide + " hvide.");
        
        
        
        
    }

    @Override
    public String toString() {
        return "Krukke{" + "krukkensIndhold=" + krukkensIndhold + '}';
    }
}
