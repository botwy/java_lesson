package com.sgu2036;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        ArrayList<String> list_result = new ArrayList<String>();
        for (int i = 0; i < count + 1; i++) {
            String str = scanner.nextLine();
            if (i != 0)
                if (checkWords(str))
                    list_result.add(str);
        }

        for (int i = 0; i < list_result.size(); i++) {
            System.out.println(list_result.get(i));
        }
    }


    private static boolean checkWords(String str) {
        char[] arr = str.toCharArray();
        boolean curr = false;
        boolean prev = false;
        boolean past_prev = false;
        for (int j = 0; j < arr.length; j++) {
            past_prev = prev;
            prev = curr;
            if (arr[j] == 'e' || arr[j] == 'y' || arr[j] == 'u' || arr[j] == 'i' || arr[j] == 'o' || arr[j] == 'a')
                curr = true;
            else
                curr = false;

            if (curr && prev && past_prev)
                return false;

        }
        return true;
    }
}
