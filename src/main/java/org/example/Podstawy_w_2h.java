package org.example;

import java.util.Scanner;

public class Podstawy_w_2h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean shouldContinue = true;

        Party party = new Party();

        while (shouldContinue){
            System.out.println("Wybierz opcje");
            System.out.println("1. Wyswietl gosci");
            System.out.println("2. Dodaj goscia");
            System.out.println("3. Wyswietl potrawy");
            System.out.println("4. Znajdz po numerze telefonu");
            System.out.println("5. Wyjscie");

            int userChoise = scanner.nextInt();

            switch (userChoise) { // new version switch
                case 1 -> party.displayGuests();
                case 2 -> party.addGuest();
                case 3 -> party.displayMeals();
                case 4 -> party.displayGuestByPhoneNumber();
                case 5 -> shouldContinue = false;
            }

//            switch (userChoise) {  //old version switch
//                case 1 : System.out.println("wybrano 1"); break;
//                case 2 : System.out.println("wybrano 2"); break;
//                case 3 : System.out.println("wybrano 3"); break;
//                case 4 : System.out.println("wybrano 4"); break;
//                case 5 : shouldContinue = false;          break;
//            }
        }









































    }
}
