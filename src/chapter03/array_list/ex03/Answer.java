package chapter03.array_list.ex03;

import java.io.*;
import java.util.StringTokenizer;

public class Answer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine(), " ");
        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        int[] array = new int[suNo]; // 없이 생략 가능
        stringTokenizer = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
        }


        long[] sumArray = new long[suNo + 1]; // 원래 배열 길이보다 +1
        for (int i = 1; i < sumArray.length; i++) {
            sumArray[i] = sumArray[i - 1] + array[i - 1];
        }

        for (int q = 0; q < quizNo; q++) {
            stringTokenizer = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            sb.append(sumArray[j] - sumArray[i - 1]).append("\n");

        }
        bw.write(sb.toString());
        bw.flush();
        br.close();

    }
}

// 그냥 배열 A을 합 배열로 바꿀 시에 배열 길이를 +1 해줘야함
// 초기화는 굳이 안해줘도 됨