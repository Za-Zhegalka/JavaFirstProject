package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите градусы в Фаренгейтах: ");
        double fahrenheit = input.nextDouble();

        double celsius = (5.0/9) * (fahrenheit - 32);
        System.out.println("Фаренгейт " + fahrenheit + " это " + celsius + " в градусах Цульсия");
    }
}
