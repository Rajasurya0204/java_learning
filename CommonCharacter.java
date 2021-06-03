package com.devglan.set1;

import java.util.*;
import java.util.Arrays;
import java.util.stream.IntStream;

public class CommonCharacter {

    public void removeCommonCharacter(String s1, String s2) {

        String commonChars = "";

        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    commonChars += s1.charAt(i);
                }
            }
        }

        for (int i = 0; i < commonChars.length(); i++) {
            String charToRemove = commonChars.charAt(i) + "";
            s1 = s1.replace(charToRemove, "");
            s2 = s2.replace(charToRemove, "");
        }
        System.out.println("After removing common character " + s1);
        System.out.println("After removing common character " + s2);
    }

    public static void main(String[] args) {

        String name1, name2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the first name:");
        name1 = sc.nextLine();
        System.out.printf("Enter the second name:");
        name2 = sc.nextLine();
        CommonCharacter commonCharacter = new CommonCharacter();
        commonCharacter.removeCommonCharacter(name1, name2);
    }
}