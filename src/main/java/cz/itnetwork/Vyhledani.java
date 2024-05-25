package cz.itnetwork;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static cz.itnetwork.UlozistePojistenych.pojisteni;

public class Vyhledani {

    Scanner scanner = new Scanner(System.in);

    public Vyhledani(){

        String hledaneJmeno;
        String hledanePrijmeni;
        String[] pojistenyPole = new String[0];
        boolean nalezeno = false;

        System.out.println("Zdejte jméno:");
        hledaneJmeno = StringUtils.capitalize(scanner.nextLine().toLowerCase());
        System.out.println("Zadejte příjmení:");
        hledanePrijmeni = StringUtils.capitalize(scanner.nextLine().toLowerCase());

        for(String pojisteny:pojisteni) {
            pojistenyPole = pojisteny.split(", ");
            if(pojistenyPole[0].equals(hledaneJmeno) && pojistenyPole[1].equals(hledanePrijmeni)){
                System.out.printf("| %-8s | %-10s | %-4s | %-10s |\n", pojistenyPole);
                nalezeno = true;
            }else continue;
        }
        if(!nalezeno){
            System.out.println("Nenalezeno");
        }
    }
}
