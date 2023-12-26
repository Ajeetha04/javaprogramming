/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashwi
 */
import java.util.HashSet;
import java.util.Set;

public class HappyNumberChecker {
    public static void main(String[] args) {
        int n = 20; 
        boolean isHappy = isHappyNumber(n);
        System.out.println(isHappy);
    }

    public static boolean isHappyNumber(int n) {
        Set<Integer> seen = new HashSet<>();

        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = getNextHappyNumber(n);
        }

        return n == 1;
    }

    public static int getNextHappyNumber(int n) {
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}

