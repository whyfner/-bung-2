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
abstract class Säugetier 
{
    private String name;
    private int alter;
    private char geschlecht;

    public Säugetier(String name, int alter, char geschlecht) 
    {
        this.name = name;
        this.alter = alter;
        this.geschlecht = geschlecht;
    }
    
    public abstract String printAll();

    public void setName(String name) {
        this.name = name;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void setGeschlecht(char geschlecht) {
        this.geschlecht = geschlecht;
    }

    public String getName() {
        return name;
    }

    public int getAlter() {
        return alter;
    }

    public char getGeschlecht() {
        return geschlecht;
    }
    
    
}
