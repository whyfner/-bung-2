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
public class Menschen 
{
    private String vorname;
    private String nachname;
    private int alter;

    public Menschen(String vorname, String nachname, int alter) 
    {
        this.vorname = vorname;
        this.nachname = nachname;
        this.alter = alter;
    }
    
    public void Status()
    {
        System.out.println("Es handelt sich um einen Menschen! Vorname: "+vorname+", Nachname: "+nachname+", Alter: "+alter);
    }

    public String getVorname() {
        return vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public int getAlter() {
        return alter;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }
    
    
}
