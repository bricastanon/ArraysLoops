package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //---- OUTPUT 63 65 60 53 58 37 35 31
        int[] nums = {63, 65, 60, 53, 58, 37, 35, 31};
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        // OUTPUT NAMES
        String[] names = {"Esme", "Sophia", "Fred"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " ");
        }
        System.out.println();


        // ---- OUTPUT 00000
        int[] nums1 = new int[5];
        for (int i = 0; i < nums1.length; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();


        // ---- OUTPUT null null null null null
        String[] words = new String[5];
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        System.out.println();

        // ---- OUTPUT NAMES
        String[] schools = {"Brianna", "Gio", "Rebecca",
                "David", "Heather"};
        for (String school : schools) {
            System.out.println(school);
        }

        //------------------------ SORTING AN ARRAY USEFUL FOR JOBS --------------------------------
        // ----------------------- HAVE TO IMPORT java.util.arrays;
        // ----------------------- OUTPUTS NAMES IN ORDER
        String[] nameList = {"Brianna", "Brian", "Emma", "Jake", "Chad", "Dan", "Angela", "Charlie", "Matt"};
        Arrays.sort(nameList);
        for(String name : nameList) {
            System.out.println(name);
        }

    }
}