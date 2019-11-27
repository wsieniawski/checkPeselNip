package com.wsb.peselandnip;

public class Nip {

    public static boolean sprawdzNip(String nip) {
        //wagi NIPu
        int[] wagiNip = {6, 5, 7, 2, 3, 4, 5, 6, 7};

        if (nip.length() != 11) return false;

        int sumaNip = 0;

        for (int i = 0; i < 10; i++)
            sumaNip += Integer.parseInt(nip.substring(i, i + 1)) * wagiNip[i];

        // pobieramy do zmiennej cyfraKontrolna wartość ostatniej cyfry z PESEL'a
        int cyfraKontrolna = Integer.parseInt(nip.substring(10, 11));

        // obliczamy cyfrę kontrolną z sumy (najpierw modulo 10 potem odejmujemy 10 i jeszcze raz modulo 10)
        sumaNip %= 11;
        sumaNip = 11 - sumaNip;
        sumaNip %= 11;

        // zwracamy wartość logiczną porównania obliczonej i pobranej cyfry kontrolnej
        return (sumaNip == cyfraKontrolna);
    }
}
