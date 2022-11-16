package test11_20;

import java.io.*;
public class Test13 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int sum = 0;
        for (int i = 0; i <numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println(45-sum);
    }
}
