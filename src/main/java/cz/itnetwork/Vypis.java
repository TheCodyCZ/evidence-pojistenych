package cz.itnetwork;

import static cz.itnetwork.UlozistePojistenych.pojisteni;

public class Vypis {

    public Vypis(){

        String[] pojistenyPole = new String[0];
        System.out.printf("\nSeznam pojištěných:\n");
        System.out.printf("| %-8s | %-10s | %-4s | %-10s |\n", "Jméno", "Příjmení", "Věk", "Telefon");
        for(String pojisteny:pojisteni) {
            pojistenyPole = pojisteny.split(", ");
            System.out.printf("| %-8s | %-10s | %-4s | %-10s |\n", pojistenyPole);
        }
    }
}
