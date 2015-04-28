/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uebung_2.classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Hannes
 */
public class Auto extends Fahrzeug implements Comparable<Auto>
{
    private boolean Klimaanlage;
    private short Airbag;
    
    public void klimaanlageAn()
    {
        if(this.Klimaanlage==false)
        {
            this.Klimaanlage=true;
        }
        else if(this.Klimaanlage==true)
        {
            JOptionPane.showMessageDialog(null, "Die Klimaanlage ist bereits an!");
        }
    }
    
    public void klimaanlageAus()
    {
        if(this.Klimaanlage==true)
        {
            this.Klimaanlage=false;
        }
        else if(this.Klimaanlage==false)
        {
            JOptionPane.showMessageDialog(null, "Die Klimaanlage ist bereits aus!");
        }
    }

    public void setAirbag(short Airbag) 
    {
        this.Airbag = Airbag;
    }

    public short getAirbag() 
    {
        return Airbag;
    }

    public boolean getKlimaanlage() {
        return Klimaanlage;
    }

    public void setKlimaanlage(boolean Klimaanlage) {
        this.Klimaanlage = Klimaanlage;
    }

    public Auto(short Airbag, short Reifen, Farbe farbe, short PS, short Tueren) {
        super(Reifen, farbe, PS, Tueren);
        this.Klimaanlage = false;
        this.Airbag = Airbag;
    }

    @Override
    public String toString() 
    {
        return ("Mein Auto hat "+getPS()+" PS und fährt mit "+getGeschwindigkeit()+" km/h."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Auto o) 
    {
        if(this.getPS()==o.getPS())
        {
            return 0;
        }
        else if(this.getPS()<o.getPS())
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

    public Auto(boolean Klimaanlage, short Airbag, short Reifen, short PS, short Tueren) {
        super(Reifen, Farbe.BLACK, PS, Tueren);
        this.Klimaanlage = Klimaanlage;
        this.Airbag = Airbag;
    }
    
    

    

    
    
    
    
    
}
