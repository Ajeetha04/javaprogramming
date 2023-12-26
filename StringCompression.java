/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashwi
 */
public class StringCompression {
    public static void main(String[] args) {
        String input1 = "AAABBC";
        String input2 = "AAABBCCCDE";

        System.out.println("Input 1: " + input1);
        System.out.println("Output 1: " + compressString(input1));

        System.out.println("Input 2: " + input2);
        System.out.println("Output 2: " + compressString(input2));
    }

    private static String compressString(String input) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            if (i < input.length() - 1 && input.charAt(i) == input.charAt(i + 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }

        return compressed.toString();
    }
}

