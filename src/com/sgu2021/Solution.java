package com.sgu2021;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        int max = 0;
        int prev_max = 0;
        for (int i = 0; i < count; i++) {
            arr[i] = scanner.nextInt();
            if (arr[i] > max) {
                prev_max = max;
                max = arr[i];
            } else if (arr[i] > prev_max && arr[i] < max) {
                prev_max = arr[i];
            }
        }
        int k1 = 1;
        int k2 = 1;
        String text = "";
        if (max / 2 == prev_max) {
            k1 = 2;
            k2 = 2;
        } else if (max / 2 > prev_max) {
            k1 = 2;
        } else if (max / 2 < prev_max) {
            k2 = 2;
        }
        int result = 0;
        for (int i = 0; i < count; i++) {
            if (arr[i] == max) {
                result = arr[i] / 2;
                result = result / k1;
            } else if (arr[i] == prev_max) {
                result = arr[i] / k2;
            } else
                result = arr[i];

            if (i == 0)
                text = text + Integer.toString(result);
            else
                text = text + " " + Integer.toString(result);
        }
        System.out.println(text);
    }
}

