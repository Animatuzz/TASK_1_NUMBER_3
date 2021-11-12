package com.Animatuz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Введите по очереди V1,V2,a1,a2,S");

        double firstCarSpeed = readVariable();
        double secondCarSpeed = readVariable();
        double firstCarAccelerate = readVariable();
        double secondCarAccelerate = readVariable();
        double distance = readVariable();
        double resultTime = calcTime(firstCarSpeed, secondCarSpeed, firstCarAccelerate, secondCarAccelerate, distance);

        printResult(firstCarSpeed, secondCarSpeed, firstCarAccelerate, secondCarAccelerate, distance, resultTime);

    }

    static double readVariable() {

        Scanner scanner = new Scanner(System.in);

        return scanner.nextDouble();

    }

    static double calcTime(double firstCarSpeed, double secondCarSpeed, double firstCarAccelerate, double secondCarAccelerate, double distance) {

        return (-(firstCarSpeed + secondCarSpeed) + Math.sqrt(Math.pow((firstCarSpeed + secondCarSpeed), 2) + (firstCarAccelerate + secondCarAccelerate) * 2 * distance) / (firstCarAccelerate + secondCarAccelerate));
    }

    static void printResult(double firstCarSpeed, double secondCarSpeed, double firstCarAccelerate, double secondCarAccelerate, double distance, double resultTime) {

        if (resultTime >= 0) {

            System.out.println(" Скорость первой машины=" + firstCarSpeed + " Скорость второй машины=" + secondCarSpeed + " Ускорение первой машины=" + firstCarAccelerate + " Ускорение второй машины=" + secondCarAccelerate + " Пройденный путь=" + distance);
            System.out.print("Время = ");
            System.out.println(resultTime);

        } else {

            System.out.println("Ошибка! Переменные введены неверно. Значение S должно быть больше 0");

        }

    }
}