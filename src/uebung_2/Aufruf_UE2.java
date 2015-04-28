/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung_2;

import uebung_2.classes.Mensch;
import uebung_2.classes.Menschen;
import uebung_2.classes.Student;

/**
 *
 * @author Hannes
 */
public class Aufruf_UE2 
{
    public static void main(String[] args) 
    {
        Mensch man = new Mensch("David", 30, 'm');
        System.out.println(man.printAll());
        
        Menschen me = new Menschen("Hannes", "Weifner", 20);
        me.Status();
        
        Student ich = new Student("1410653083", "WEB", "Hannes", "Weifner", 20);
        ich.Status();
        
        
    }
    
}
