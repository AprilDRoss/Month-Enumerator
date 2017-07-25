package com.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Month calendarMonth = new Month();

        System.out.println("Please pick a starting month from the list below:");

        System.out.println("Month Selections:" + calendarMonth.getEnglishName());

        Scanner scanner = new Scanner();
        String calendarpick = scanner.nextLine();


    }
}
