/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung_2;

import uebung_2.classes.Auto;
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
        Auto bmw = new Auto((short)4, (short)4, "silber", (short)220, (short)5);
        Auto audi = new Auto((short)8, (short)4, "schwarz", (short)180, (short)5);
        
        Wasserfahrzeug titanic = new Wasserfahrzeug(10.54, (short)3, (short)100000, (short)0, "blau", (short)51000, (short)0);
        
        System.out.println(bmw.toString());
        System.out.println(audi.toString());
        System.out.println(titanic.toString());
        System.out.println(Auto.Anzahl);
    }
    
}
