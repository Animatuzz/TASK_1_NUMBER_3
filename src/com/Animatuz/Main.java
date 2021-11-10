package com.Animatuz;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double y = 0; // y - число, которое вводится с клавиатуры
        double result;
        double t =0;

        printwelcomemessage();

        double V1 = write(y);
        double V2 = write(y);
        double a1 = write(y);
        double a2 = write(y);
        double S = write(y);

        result = calc(V1,V2,a1,a2,S,t);
        printResult(V1,V2,a1,a2,S,result);

    }

    static void printwelcomemessage(){

        System.out.println("Введите по очереди V1,V2,a1,a2,S");

    }

    static void printerrormessage(){

        System.out.println("Ошибка!");

    }

    static double write(double x) {

        Scanner scanner = new Scanner(System.in);
        x = scanner.nextDouble();

        return x;
    }

    static double calc(double V11, double V21, double a11, double a21, double S1, double t1) {

        t1 = ( -( V11+V21 )+ Math.sqrt( Math.pow((V11+V21), 2)+(a11+a21)*2*S1 )/(a11+a21) );

        return t1;
    }

    static void printResult(double V1, double V2, double a1, double a2, double S, double t2) {

        if (t2>=0) {
            System.out.println(" V1="+ V1 + " V2=" + V2 + " a1=1" + a1 + " a2=" + a2 + " S=" + S);
            System.out.print("t = ");
            System.out.println(t2);
        } else {
            printerrormessage();
        }

    }
}