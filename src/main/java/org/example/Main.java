package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        double u,alan;
        Scanner uzunluk=new Scanner(System.in);
        System.out.println("Üçgenin kenar uzunluklarını giriniz");
        System.out.print("1.kenar uzunluğu;");
        a= uzunluk.nextInt();
        System.out.print("2.kenar uzunluğu;");
        b= uzunluk.nextInt();
        System.out.print("3.kenar uzunluğu;");
        c= uzunluk.nextInt();
        u=(a+b+c)/2;
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Alan:"+alan);

    }
}