package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Hello, ");
        String name = Keyboard.nextLine();
        System.out.println("" + name + " nice to meet you." );
    }
}
