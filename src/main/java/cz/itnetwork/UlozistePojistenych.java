package cz.itnetwork;

import java.util.*;

/**
 * Kolekce pro ukládání jednotlivých pojištěnců
 */

public class UlozistePojistenych {

    static Collection<String> pojisteni = new ArrayList<>();

    public static void Ulozeni(String pojisteny){

        pojisteni.add(pojisteny);

    }
}
