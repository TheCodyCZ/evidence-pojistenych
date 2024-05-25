package cz.itnetwork;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static cz.itnetwork.UlozistePojistenych.Ulozeni;
import static cz.itnetwork.Validator.ValidatorNumber;
import static cz.itnetwork.Validator.ValidatorText;

public class Registrace {

    Scanner scanner = new Scanner(System.in);

    public Registrace() {

        String jmeno;
        String prijmeni;
        String vekString;
        String telefonString;
        int vek;
        int telefon;
        String ulozit;
        boolean validni;

        System.out.println("Zadejte jméno pojištěného:");
        do {
            jmeno = StringUtils.capitalize(scanner.nextLine().toLowerCase());
            validni = ValidatorText(jmeno);
        }while (!validni);

        System.out.println("Zadejte příjmení:");
        do{
            prijmeni = StringUtils.capitalize(scanner.nextLine().toLowerCase());
            validni = ValidatorText(prijmeni);
        }while (!validni);

        System.out.println("Zadejte věk:");
        do{
            vekString = scanner.nextLine();
            validni = ValidatorNumber(vekString);
        }while (!validni);
        vek = Integer.parseInt(vekString);

        System.out.println("Zadejte telefoní číslo:");
        do{
            telefonString = scanner.nextLine();
            validni = ValidatorNumber(telefonString);
        }while (!validni);
        telefon = Integer.parseInt(telefonString);

        Pojisteny pojisteny = new Pojisteny(jmeno,prijmeni,vek,telefon);

        System.out.printf("\nZadaný nový pojištěný:\n");

        System.out.printf(pojisteny.toString());
        System.out.printf("\n\nPřejete si uložit?\n1 - Ano\n0 - Ne\n");
        ulozit = scanner.nextLine();
        if(ulozit.equals("1")){

            Ulozeni(pojisteny.toString());
            System.out.println("Uloženo");

        }else {
            System.out.println("Neuloženo");
        }
    }
}
