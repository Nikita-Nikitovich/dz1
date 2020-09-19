package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите свое имя");
        Scanner name = new Scanner(System.in);
        String str = name.nextLine();
        System.out.println("Привет " + str);
    }
}
