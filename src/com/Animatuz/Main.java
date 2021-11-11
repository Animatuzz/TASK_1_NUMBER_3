package com.Animatuz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double variableY= 0; // y - число, которое вводится с клавиатуры
        double resultTime;
        double time = 0;

        printwelcomemessage();

        double firstCarSpeed = writeVariable(variableY);
        double secondCarSpeed = writeVariable(variableY);
        double firstCarAccelerate = writeVariable(variableY);
        double secondCarAccelerate = writeVariable(variableY);
        double distance = writeVariable(variableY);

        resultTime = calcTime(firstCarSpeed, secondCarSpeed, firstCarAccelerate, secondCarAccelerate, distance, time);
        printResult(firstCarSpeed, secondCarSpeed, firstCarAccelerate, secondCarAccelerate, distance, resultTime);

    }

    static void printwelcomemessage() {

        System.out.println("Введите по очереди V1,V2,a1,a2,S");

    }

    static void printerrormessage() {

        System.out.println("Ошибка!");

    }

    static double writeVariable(double x) {

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();

        return x;
    }

    static double calcTime(double firstCarSpeed, double secondCarSpeed, double firstCarAccelerate, double secondCarAccelerate, double distance, double time) {

        time = (-(firstCarSpeed + secondCarSpeed) + Math.sqrt(Math.pow((firstCarSpeed + secondCarSpeed), 2) + (firstCarAccelerate + secondCarAccelerate) * 2 * distance) / (firstCarAccelerate + secondCarAccelerate));

        return time;
    }

    static void printResult(double firstCarSpeed, double secondCarSpeed, double firstCarAccelerate, double secondCarAccelerate, double distance, double time) {

        if (time >= 0) {
            System.out.println(" Скорость первой машины=" + firstCarSpeed + " Скорость второй машины=" + secondCarSpeed + " Ускорение первой машины=" + firstCarAccelerate + " Ускорение второй машины=" + secondCarAccelerate + " Пройденный путь=" + distance);
            System.out.print("Время = ");
            System.out.println(time);
        } else {
            printerrormessage();
        }

    }
}