package com.encoding;

public class Main {

    public static void main(String[] args) {
        int a = 7;
        String temp = "";
        while (a != 0) {
            b = a % 2;
            temp = b + temp;
            a = a / 2;
        }
        System.out.println(temp);
    }
}
