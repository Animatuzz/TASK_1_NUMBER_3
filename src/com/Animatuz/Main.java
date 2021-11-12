package com.Animatuz;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        double firstCarSpeed = readVariable("скорость первой машины (м/с): ");
        double secondCarSpeed = readVariable("скорость второй машины (м/с): ");
        double firstCarAccelerate = readVariable("ускорение первой машины (м/с^2): ");
        double secondCarAccelerate = readVariable("ускорение второй машины (м/с^2): ");
        double distance = readVariable("расстояние (м): ");

        double time = findTime(firstCarSpeed, secondCarSpeed, firstCarAccelerate, secondCarAccelerate, distance);

        printResult(time);

    }

    static double readVariable(String dataType) {
        System.out.print("Введите " + dataType);
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        if (value < 0) {
            System.out.println("Ошибка! Значение не может быть отрицательным.");
            return readVariable(dataType);
        }
        return value;
    }

    static double findTime(double v1, double v2, double a1, double a2, double s) {
        double sumSpeeds = v1 + v2, sumAccelerates = a1 + a2;
        if (v1 == 0 && v2 == 0 && a1 == 0 && a2 == 0) {
            return -1;
        } else if (a1 == 0 && a2 == 0) {
            return s / (v1 + v2);
        } else {
            return (Math.sqrt(Math.pow(sumSpeeds, 2) + 2 * sumAccelerates * s) - sumSpeeds) / sumAccelerates;
        }
    }

    static void printResult(double time) {
        if (time == -1) {
            System.out.println("Ошибка! Согласно введённым данным машины никогда не встретятся.");
        } else {
            System.out.println("Время (с): " + time);
        }
    }

}