package com.Animatuz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        printWelcomeMessage();

        double firstCarSpeed = readVariable();
        double secondCarSpeed = readVariable();
        double firstCarAccelerate = readVariable();
        double secondCarAccelerate = readVariable();
        double distance = readVariable();
        double resultTime = calcTime(firstCarSpeed, secondCarSpeed, firstCarAccelerate, secondCarAccelerate, distance);

        printResult(firstCarSpeed, secondCarSpeed, firstCarAccelerate, secondCarAccelerate, distance, resultTime);

    }

    static void printWelcomeMessage() {

        System.out.println("Введите по очереди V1,V2,a1,a2,S");

    }

    static void printErrorMessage() {

        System.out.println("Ошибка!");

    }

    static double readVariable() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();

    }

    static double calcTime(double firstCarSpeed, double secondCarSpeed, double firstCarAccelerate, double secondCarAccelerate, double distance) {

        return (-(firstCarSpeed + secondCarSpeed) + Math.sqrt(Math.pow((firstCarSpeed + secondCarSpeed), 2) + (firstCarAccelerate + secondCarAccelerate) * 2 * distance) / (firstCarAccelerate + secondCarAccelerate));
    }

    static void printResult(double firstCarSpeed, double secondCarSpeed, double firstCarAccelerate, double secondCarAccelerate, double distance, double time) {

        if (time >= 0) {

            System.out.println(" Скорость первой машины=" + firstCarSpeed + " Скорость второй машины=" + secondCarSpeed + " Ускорение первой машины=" + firstCarAccelerate + " Ускорение второй машины=" + secondCarAccelerate + " Пройденный путь=" + distance);
            System.out.print("Время = ");
            System.out.println(time);

        } else {

            printErrorMessage();

        }

    }
}