package chapter03.c00_시간_복잡도_활용하기.ex00;

import java.util.Arrays;
import java.util.Scanner;

public class Book_2750 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);
        for (int answer : array) {
            System.out.println(answer);
        }
    }
}

