/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung_2.classes;

/**
 *
 * @author Hannes
 */
public class Mensch extends Säugetier
{
    public Mensch(String name, int alter, char geschlecht) 
    {
        super(name, alter, geschlecht);
    }
    
    @Override
    public String printAll() 
    {
        return(getName()+"#"+getAlter()+"#"+getGeschlecht());
    }
    
    
    
    
}
