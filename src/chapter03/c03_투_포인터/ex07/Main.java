package chapter03.c03_투_포인터.ex07;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int result = sc.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = sc.nextInt();
        }

        Arrays.sort(array);

        int start_index = 0;
        int end_index = 1;
        int count = 0;
        int sum = 0;

        while (start_index != number - 1) {
            sum = array[start_index] + array[end_index];
            if (sum < result) {
                end_index++;
            } else if (sum == result) {

            }
        }
        System.out.println(count);

    }
}


/*
숫자 범위 1 ~ 100000000 -> int형
배열 길이 15000 -> 1.5 * 10^4 n^2하면 2초넘어가서 안됨
O(n) 이나 O(nlog(n))까지 가능

array -> sort하기

시작지점 2개의 start index, end index해서 만들기
sum < result     end++
sum = result     start++
sum > result     start++

 */

/*
내 생각과 다르게 index의 위치가 끝으로 넘어가 버려서 문제가 생김

 */