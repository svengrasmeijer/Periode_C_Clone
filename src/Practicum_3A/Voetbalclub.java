package Practicum_3A;

import java.util.Objects;

public class Voetbalclub {

    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public Voetbalclub(String enteredName){
        naam = enteredName;
        if (enteredName == null | Objects.equals(enteredName, ""))
        {
            naam = "FC";
        }
    }

    public void verwerkResultaat(char ch){
        if (ch == 'w')
            aantalGewonnen = aantalGewonnen + 1;
        if (ch == 'g')
            aantalGelijk = aantalGelijk + 1;
        if (ch == 'v')
            aantalVerloren = aantalVerloren + 1;
    }

    public int aantalPunten(){
        return aantalGewonnen * 3 + aantalGelijk;
    }

    public int aantalGespeeld(){
        return aantalGewonnen + aantalGelijk + aantalVerloren;
    }

    public String toString(){
        return naam+" "+aantalGespeeld()+" "+aantalGewonnen+" "+aantalGelijk+" "+aantalVerloren+" "+aantalPunten();
    }
}
