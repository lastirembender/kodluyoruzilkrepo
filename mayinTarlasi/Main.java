package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        System.out.println("Harita büyüklüğünü giriniz.");
        System.out.println("Satır sayisi : ");
        int row = scan.nextInt();
        System.out.println("Sütun sayisi: ");
        int col = scan.nextInt();

        MineSweeper mine = new MineSweeper(row, col);
        mine.run();
    }
}
