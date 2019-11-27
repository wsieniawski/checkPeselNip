package com.wsb.peselandnip;

import java.util.Scanner;

import static com.wsb.peselandnip.Pesel.sprawdz;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print ("Podaj numer PESEL i kliknij enter: " );

        // pobieramy od użytkownika PESEL
        String pesel = sc.nextLine();

        // wyświetlamy na ekranie informacje o poprawności sumy kontrolnej PESEL
        System.out.println("Twój PESEL jest " + ((sprawdz(pesel)) ? "poprawny." : "niepoprawny"));

    }
}
