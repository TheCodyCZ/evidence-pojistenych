package cz.itnetwork;

import static cz.itnetwork.UlozistePojistenych.pojisteni;

/**
 * Funkce pro výpis všech pojištěných v tabulce
 */

public class Vypis {

    public Vypis(){

        String[] pojistenyPole = new String[0];
        //uvození tabulky s prvním informačním řádkem
        System.out.printf("\nSeznam pojištěných:\n");
        System.out.printf("| %-8s | %-10s | %-4s | %-10s |\n", "Jméno", "Příjmení", "Věk", "Telefon");
        //vyklus pro vypsání všech uložených pojištěných
        for(String pojisteny:pojisteni) {
            //rozdělení stringu s pojištěnci zpět na jednotlivé elementy
            pojistenyPole = pojisteny.split(", ");
            //výpis v tabulce
            System.out.printf("| %-8s | %-10s | %-4s | %-10s |\n", pojistenyPole);
        }
    }
}
