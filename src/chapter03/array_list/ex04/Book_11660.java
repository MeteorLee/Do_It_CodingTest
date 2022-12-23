package chapter03.array_list.ex04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Book_11660 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        int[][] A = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            stringTokenizer = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j <=N ; j++) {
                A[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }
        int[][] D = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                // 구간 합 구하기
                D[i][j] = D[i][j - 1] + D[i - 1][j] - D[i - 1][j - 1] + A[i][j];
            }
        }

        for (int i = 0; i < M; i++) {
            stringTokenizer = new StringTokenizer(br.readLine(), " ");
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2= Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());

            int result = D[x2][y2] - D[x1 - 1][y2] - D[x2][y1 - 1] + D[x1 - 1][y1 - 1];
            System.out.println(result);
        }
    }
}