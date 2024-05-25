package cz.itnetwork;

public class Validator {

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
