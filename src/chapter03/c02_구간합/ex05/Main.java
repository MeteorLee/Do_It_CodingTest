package chapter03.c02_구간합.ex05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main { // 문제 못 품
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");

        int number = Integer.parseInt(stringTokenizer.nextToken());
        int division = Integer.parseInt(stringTokenizer.nextToken());

        int[] array = new int[number];
        stringTokenizer = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < number; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
//
//        long[] sumArray = new long[number + 1];
//
//        for (int i = 1; i < number + 1; i++) {
//            sumArray[i] = sumArray[i - 1] + array[i - 1];
//        }
//
//        int count = 0;
//
//        for (int i = number; i > 1; i--) {
//            for (int j = 0; j < i; j++) {
//                long flag = sumArray[i] - sumArray[j];
//                if (flag % division == 0) {
//                    count++;
//                }
//            }
//        }
//
//        System.out.println(count);


        long sumArray[][] = new long[number + 1][number + 1];
        int count = 0;

        for (int i = 1; i < number + 1; i++) {
            for (int j = i; j < number + 1; j++) {
                sumArray[i][j] = sumArray[i][j - 1] + array[j - 1];
                if (sumArray[i][j] % division == 0) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}


/*

구간 합이 M으로 나누어 떨어진다.
1. 합집합을 이중 for문을 통해서 한다?
합집합을 만들고 for문을 i--방식안에 i++방식을 하나 더 만든다

2. 합집합을 2차원으로 만든다?
    x1 ~ xn까지니까
    x1 y2 ->
 */

/*

M N 입력 받기
입력 받아서 수배열[N] 만들기
합배열[N] 만들기

갯수 count 생성

for문 i-- {
    for문 j++
    ij = 합배열[i] - 합배열[j]
    if (ij % M == 0){
        count++
    }
}
count 출력

 */

/*
M N 입력 받기
입력 받아서 수배열[N] 만들기
2차원 합배열 만들기
count 생성
    크기 : N * N
    뭘 넣을지 (x1, y1) 1~1 (x3, y4) 이중 for문으로 i~n+1까지 넣자
        fori (1 ~ N+1) {
            forj (i ~ N + 1) {
                Sum[i][j] = Sum[i][j-1] + array[j - 1];
                if(Sum[i][j] % M == 0) {
                    count++;
                }
            }
        }
        
count 출력

 */