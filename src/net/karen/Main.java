package net.karen;

public class Main {
    public static void main(String[] args) {
        /* Switch Statement */

        /* USUALLY is used on INTEGER variables;
           NEVER used on FLOAT variables;
        */

        // Integer variable
        int medalPlacement = 1; // 1 = GOLD MEDAL; 2 = SILVER MEDAL; 3 = BRONZE MEDAL;

        switch(medalPlacement) {
            case 1: System.out.println("GOLD MEDAL");   break;
            case 2: System.out.println("SILVER MEDAL"); break;
            case 3: System.out.println("BRONZE MEDAL"); break;
            default: System.out.println("NO MEDAL");    break;
        }
    }
}