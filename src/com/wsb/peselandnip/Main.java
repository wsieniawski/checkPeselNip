package com.wsb.peselandnip;

import java.util.Scanner;

import static com.wsb.peselandnip.Nip.*;
import static com.wsb.peselandnip.Pesel.*;

public class Main {

//    1. Program sprawdzający poprawność numerów PESEL, NIP.
//    Maksymalna liczba punktów: 15

    public static void main(String[] args) {
        Scanner scDecyzja = new Scanner(System.in);
        System.out.println("Chcesz sprawdzic PESEL czy NIP?");
        String decyzja = scDecyzja.nextLine();

        if (decyzja.toLowerCase().equals("pesel")) {
            Scanner scPesel = new Scanner(System.in);
            System.out.print ("Podaj numer PESEL i kliknij enter: " );
            String pesel = scPesel.nextLine();
            System.out.println("Twój PESEL jest " + ((sprawdzPesel(pesel)) ? "poprawny." : "niepoprawny"));

        } else if (decyzja.toLowerCase().equals("nip")) {
            Scanner scNip = new Scanner(System.in);
            System.out.print ("Podaj numer NIP i kliknij enter: " );
            String nip = scNip.nextLine();
            System.out.println("Twój NIP jest " + ((sprawdzNip(nip)) ? "poprawny." : "niepoprawny"));

        } else {
            System.out.println("Bledna komenda");
        }

    }
}
