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
public class Student extends Menschen
{
    private String matrikelnummer;
    private String Studiengang;

    public Student(String matrikelnummer, String Studiengang, String vorname, String nachname, int alter) 
    {
        super(vorname, nachname, alter);
        this.matrikelnummer = matrikelnummer;
        this.Studiengang = Studiengang;
    }

    @Override
    public void Status() 
    {
        System.out.println("Es handelt sich um einen Studenten! Vorname: "+getVorname()+", Nachname: "+getNachname()+", Alter: "+getAlter()+", Matrikelnummer: "+matrikelnummer+", Studiengang: "+Studiengang);
    }
    
    
}
