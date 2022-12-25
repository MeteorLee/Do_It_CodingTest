package chapter03.c02_구간합.ex04;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        int sizeNum = Integer.parseInt(stringTokenizer.nextToken());
        int quizNum = Integer.parseInt(stringTokenizer.nextToken());

        int[][] array = new int[sizeNum][sizeNum];

        for (int i = 0; i < sizeNum; i++) { // 배열 값 입력
            stringTokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < sizeNum; j++) {
                array[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        long[][] sumArray = new long[sizeNum + 1][sizeNum + 1];

        for (int i = 1; i < sizeNum + 1; i++) {
            for (int j = 1; j < sizeNum + 1; j++) {
                sumArray[i][j]  = sumArray[i][j - 1] + array[i - 1][j - 1];
            }
        }

        for (int q = 0; q < quizNum; q++) {
            stringTokenizer = new StringTokenizer(br.readLine(), " ");
            int X1 = Integer.parseInt(stringTokenizer.nextToken());
            int Y1 = Integer.parseInt(stringTokenizer.nextToken());
            int X2= Integer.parseInt(stringTokenizer.nextToken());
            int Y2 = Integer.parseInt(stringTokenizer.nextToken());

            long sum = 0;
            for (int i = X1; i <= X2; i++) {
                sum += sumArray[i][Y2] - sumArray[i][Y1 - 1];

            }
            sb.append(sum).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        br.close();

    }
}

/*
N X N 2차원 배열
합을 구하는 합배열이 필요
X 또는 Y축을 기준으로 만들기
X1 Y1  X2 Y2 에 맞게 출력
1024 * 100000 * X개 상당히 큰 숫자 long필요
 */

/*
    숫자 2개 N, M 입력 받기
    N * N 배열 생성 (int형)
    입력 받아 배열에 넣기 (2중 for문) [][] <- [x][y]라고 생각하기

    [x]축을 기준으로 합배열[][] S문 만들기 (long형)
     - 배열 크기 N + 1 해주기 
     - 인덱스 0인 곳 비워두고 1인 곳 부터 넣기
     - for문 (i = 1, i < N + 1, i++)
     - S[i][j] = sum[i][j - 1] + array[i - 1][j - 1];

    
    (X1, Y1) (X2, Y2) 입력받는 for문 작성 (i < M) {
        퀴즈 입력 받기
        for 문 (i = X1, i <= X2, i++) {
            sum += S[Y2] - S[Y1 - 1];
        }
        빌더.append(sum)
    }
    출력

 */