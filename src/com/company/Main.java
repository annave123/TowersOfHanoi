package com.company;

import java.util.Scanner;

public class Main {

    public void solve(int n, String start, String middle, String end) {
        if (n == 1) {
            System.out.println(start + " Moved to " + end+"\n");


        } else {
            solve(n - 1, start, end, middle);
            System.out.println(start + " Moved to " + end+"\n");
            solve(n - 1, middle, start, end);


        }
    }

    public static void main(String[] args) {
        Main ending = new Main();
        System.out.print("How many disks are there? : ");
        Scanner picking = new Scanner(System.in);
        int discs = picking.nextInt();
        ending.solve(discs, "A", "B", "C");
    }
}
