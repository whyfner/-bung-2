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
public class Wasserfahrzeug extends Fahrzeug
{
    private double Tiefgang;
    private short Schrauben;
    private double Ladung;
    
    public void entladen()
    {
        this.Ladung=0;
        try
        {
            Thread.sleep(5000);
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }

    public double getTiefgang() {
        return Tiefgang;
    }

    public short getSchrauben() {
        return Schrauben;
    }

    public double getLadung() {
        return Ladung;
    }

    public void setTiefgang(double Tiefgang) {
        this.Tiefgang = Tiefgang;
    }

    public void setSchrauben(short Schrauben) {
        this.Schrauben = Schrauben;
    }

    public void setLadung(double Ladung) {
        this.Ladung = Ladung;
    }

    public Wasserfahrzeug(double Tiefgang, short Schrauben, double Ladung, short Reifen, Farbe farbe, short PS, short Tueren) {
        super(Reifen, farbe, PS, Tueren);
        this.Tiefgang = Tiefgang;
        this.Schrauben = Schrauben;
        this.Ladung = Ladung;
    }

    @Override
    public String toString() {
        return ("Mein Wasserfahrzeug hat "+getPS()+" PS und einen Tiefgang von "+getTiefgang()+" m."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
