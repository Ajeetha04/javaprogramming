/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashwi
 */
 import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddEvenArrays {
    public static void main(String[] args) {
        int[] inputArray = {2,4,9,3,15,7,6};
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        for (int num : inputArray) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        Integer[] oddArray = oddList.toArray(new Integer[0]);
        Integer[] evenArray = evenList.toArray(new Integer[0]);
        System.out.println("Odd Elements: " + Arrays.toString(oddArray));
        System.out.println("Even Elements: " + Arrays.toString(evenArray));
    }
}
