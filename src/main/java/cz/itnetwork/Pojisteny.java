package cz.itnetwork;

public class Pojisteny {

    private String jmeno;
    private String prijmeni;
    private int vek;
    private int telefon;

    public Pojisteny(String jmeno, String prijmeni, int vek, int telefon){

        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.vek = vek;
        this.telefon = telefon;

    }

    public String toString(){

        return jmeno + ", " + prijmeni + ", " + vek + ", " + telefon;

    }
}
