/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashwi
 */
import java.util.Scanner;

public class VerticalPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.next();
        verticalPrint(inputString);
        scanner.close();
    }
    private static void verticalPrint(String input) {
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(currentChar);
        }
    }
}



