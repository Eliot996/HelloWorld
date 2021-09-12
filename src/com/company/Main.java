package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // outputs a line
        System.out.println("Hello, World!");

        // outputs 10 lines with an incrementing number
        for(int i = 1 ; i <= 10 ; i++) System.out.println("this is line " + i);


        // creates 2 strings
        String line;
        String line2;

        // creates a new scanner
        Scanner in = new Scanner(System.in);

        //requests line from user and returns it
        System.out.println("Hello, write a line please");
        line = in.nextLine();
        System.out.println("You wrote: " + line);

        // request a new line from user
        System.out.println("Write an additional line please");
        line2 = in.nextLine();

        // checks if the two entered lines are the same
        if (line.equals(line2)){
            System.out.println("You wrote: '" + line + "' the first time and the second time");
        }else{
            System.out.println("You did not write the same twice!");

        }

    }
}
