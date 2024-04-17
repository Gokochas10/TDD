

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println("Escribe el numero a convertir a romano: ");
            Scanner sc = new Scanner (System.in);
            int number = sc.nextInt();
            String roman = Roman.getRoman(number);

            System.out.println("El numero "+number+" en romano es: "+ roman);
            sc.close();
        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
