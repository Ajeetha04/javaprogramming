/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ashwi
 */
import java.util.ArrayList;
import java.util.List;
public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrack(nums, used, current, result);
        return result;
    }
    private static void backtrack(int[] nums, boolean[] used, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            used[i] = true;
            current.add(nums[i]);
            backtrack(nums, used, current, result);
            used[i] = false;
            current.remove(current.size() - 1);
        }
    }
    public static void main(String[] args) {
        int[] nums = {2, 4, 6};
        List<List<Integer>> permutations = permute(nums);
        for (List<Integer> permutation : permutations) {
            System.out.println(permutation);
        }
    }
}




