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
public class Fahrzeug 
{
    private short Reifen;
    private String Farbe;
    private short PS;
    private short Tueren;
    private boolean Gestartet;
    private short Geschwindigkeit;
    public static int Anzahl;
    
    public void starten()
    {
        Gestartet = true;
    }
    
    public void stoppen()
    {
        Gestartet = false;
    }
    
    public void beschleunigen(short Geschwindigkeit)
    {
        if(this.Gestartet==true)
        {
            this.Geschwindigkeit+=Geschwindigkeit;
        }
        if(this.Geschwindigkeit>250)
        {
            this.Geschwindigkeit=250;
        }
    }
    
    public void bremsen(short Geschwindigkeit)
    {
        if(this.Gestartet==true)
        {
            this.Geschwindigkeit-=Geschwindigkeit;
        }
        if(this.Geschwindigkeit<0)
        {
            this.Geschwindigkeit=0;
        }
    }

    public short getReifen() {
        return Reifen;
    }

    public String getFarbe() {
        return Farbe;
    }

    public short getPS() {
        return PS;
    }

    public short getTueren() {
        return Tueren;
    }

    public boolean isGestartet() {
        return Gestartet;
    }

    public short getGeschwindigkeit() {
        return Geschwindigkeit;
    }

    public static int getAnzahl() {
        return Anzahl;
    }

    public void setReifen(short Reifen) {
        this.Reifen = Reifen;
    }

    public void setFarbe(String Farbe) {
        this.Farbe = Farbe;
    }

    public void setPS(short PS) {
        this.PS = PS;
    }

    public void setTueren(short Tueren) {
        this.Tueren = Tueren;
    }

    public void setGestartet(boolean Gestartet) {
        this.Gestartet = Gestartet;
    }

    public void setGeschwindigkeit(short Geschwindigkeit) {
        this.Geschwindigkeit = Geschwindigkeit;
    }

    public static void setAnzahl(int Anzahl) {
        Fahrzeug.Anzahl = Anzahl;
    }

    public Fahrzeug(short Reifen, String Farbe, short PS, short Tueren) {
        this.Reifen = Reifen;
        this.Farbe = Farbe;
        this.PS = PS;
        this.Tueren = Tueren;
        this.Gestartet = false;
        this.Geschwindigkeit = 0;
        
        Anzahl++;
    }
    
    
}
