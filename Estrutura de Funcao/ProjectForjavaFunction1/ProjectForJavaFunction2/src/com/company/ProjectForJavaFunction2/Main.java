package com.company.ProjectForJavaFunction2;

import java.util.Scanner;

public class Main {

    static void repeticao(int numrepeat) {
        for(int i = 0;i < numrepeat; i++) {
            for(int j = 0;j < (i+1); j++) {
                System.out.println((j+1) + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero de repetições");
        int numrepeat = scan.nextInt();
        repeticao(numrepeat);
    }
}
