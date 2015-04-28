/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import uebung_2.classes.Auto;
import uebung_2.classes.Farbe;
import uebung_2.classes.Wasserfahrzeug;

/**
 *
 * @author Hannes
 */
public class Aufruf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Auto bmw = new Auto((short)4, (short)4, Farbe.BLACK, (short)220, (short)5);
        Auto audi = new Auto((short)8, (short)4, Farbe.SILVER, (short)180, (short)5);
        Auto vw = new Auto((short)4, (short)4, Farbe.WHITE, (short)160, (short)5);
        Auto fiat = new Auto((short)4, (short)4, Farbe.BLUE, (short)80, (short)3);
        Auto seat = new Auto((short)4, (short)4, Farbe.RED, (short)120, (short)5);
        
        Wasserfahrzeug titanic = new Wasserfahrzeug(10.54, (short)3, (short)100000, (short)0, Farbe.BLACK, (short)51000, (short)0);
        
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());
        System.out.println(Auto.Anzahl);
        
        List<Auto> liste = new ArrayList<>();
        liste.add(vw);
        liste.add(seat);
        liste.add(fiat);
        liste.add(bmw);
        liste.add(audi);
        
        Collections.sort(liste);
        for(Auto b : liste)
        {
            System.out.println(b.toString());
        }
    }
    
}
