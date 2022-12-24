package chapter03.c03_투_포인터.ex06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count = 0;
        
        long[] sumArray = new long[number + 1];

        for (int i = 1; i < number + 1; i++) {
            sumArray[i] = sumArray[i-1] + i;
        }
        
//        for (int i = 1; i < number + 1; i++) { 메모리 초과
//            for (int j = 0; j < i; j++) {
//                if (sumArray[i] - sumArray[j] == number) {
//                    count++;
//                }
//            }
//        }

        for (int i = 1; i < number + 1; i++) { // 메모리 초과
            for (int j = 0; j < i; j++) {
                if (sumArray[i] - sumArray[j] > number) {
                    break;
                }
                if (sumArray[i] - sumArray[j] == number) {
                    count++;
                }
            }
        }
        System.out.println(count);

    }
}

/*
N입력받기 1~N까지 넣은 합집합 S[] 만들기
합집합 S는 long형태
합집합은 0을 앞에 포함한 방식으로 만들기
S[i] - S[j] == N인 경우 찾기
i == j 는 의미없으니 제외하기
j = 0, i = 1 부터 시작

전부다 연산하지 말기 만약 N보다 커지면 다음 걸로 넘어가자

 */
