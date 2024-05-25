package cz.itnetwork;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean opakovat = true;
        do {
            System.out.println("‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒");
            System.out.println("Evidence pojištěných");
            System.out.printf("‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒‒\n\n");
            System.out.println("Vyber akci");
            System.out.println("1 - Přidat nového pojištěného");
            System.out.println("2 - Vypsat všechny pojištěné");
            System.out.println("3 - Vyhledat pojištěného");
            System.out.println("4 - Ukončit a vymazat data");

            boolean chybaZadani;
            do {
                chybaZadani = false;
                int volba = Integer.parseInt(scanner.nextLine());
                switch (volba) {
                    case 1:
                        new Registrace();
                        break;
                    case 2:
                        new Vypis();
                        break;
                    case 3:
                        new Vyhledani();
                        break;
                    case 4:
                        opakovat = false;
                        break;
                    default:
                        System.out.println("Neplatné zadání. opakujte");
                        chybaZadani = true;
                }
            }while(chybaZadani);
        }while (opakovat);
    }
}