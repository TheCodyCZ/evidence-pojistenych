package cz.itnetwork;

/**
 * Funkce pro validaci obsahu při registraci
 */

public class Validator {
    //validace textového řetězce, který nesmí obsahovat čísla a nesmí být prázdný
    public static boolean ValidatorText(String text) {

        boolean validni = true;

        if (text.isEmpty()) {
            System.out.println("Toto pole nesmí být prázdné, zadejte znovu:");
            return false;
        } else{
            for (char a : text.toCharArray()) {
                if (!Character.isAlphabetic(a)) {
                    System.out.println("Toto pole nesmí obsahovat čísla, zadejte znovu");
                    validni = false;
                    break;
                }
            }
            return validni;
        }
    }
    //validace textového řetězce který musí obsahovat pouze čísla pro potřeby parsování a nesmí být prázdný
    public static boolean ValidatorNumber(String number) {

        boolean validni = true;

        if (number.isEmpty()) {
            System.out.println("Toto pole nesmí být prázdné, zadejte znovu:");
            return false;
        } else{
            for (char a : number.toCharArray()) {
                if (!Character.isDigit(a)) {
                    System.out.println("Toto pole musí obsahovat pouze čísla, zadejte znovu");
                    validni = false;
                    break;
                }
            }
            return validni;
        }
    }

}
