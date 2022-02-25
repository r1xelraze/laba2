package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        double summ=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = scan.nextInt();
        if (n<1){
            System.out.println("Введите число соответствующее условию");
            return;
        }
        System.out.println("Введите x: ");
        int x = scan.nextInt();
        for (int i = 1; i<n; i++){
            int p = (2*i-1);
            int w = (2*i*(2 * i + 1));
            double q = Math.pow(x,(2*i+1) );
            double task = ((p * q) / w);
            summ = summ + task;
        }
        System.out.println("Результат: ");
        System.out.println(x+summ);
    }
}
