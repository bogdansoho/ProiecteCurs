package org.example;

import java.util.Scanner;

public class Calendar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduceti un an intre 1900 si 2016 : ");

        int year = scanner.nextInt();

        int zi = 28;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            zi = 29;
        }

        System.out.println("Numarul de zile din februarie pentru anul " + year + " este de " + zi + " zile.");

    }
}
