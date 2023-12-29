package com.sysnote8.fizzbuzzjava;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("範囲の最大値: ");
        int max = scanner.nextInt();
        scanner.close();
        for(int i=1;i<=max;i++) {
            System.out.println(getFizzBuzz(i));
        }
    }

    public static String getFizzBuzz(int i) {
        String output = "";
        if(i%3==0) output += "Fizz";
        if(i%5==0) output += "Buzz";
        if(output.isEmpty()) output += i;
        return output;
    }
}