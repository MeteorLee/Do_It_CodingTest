package chapter03.c02_구간합.ex02;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());
        int[] array = new int[count];

        String stringNumber = br.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(stringNumber," ");

        int max = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(stringTokenizer.nextToken());
            sum += array[i];
            if (array[i] > max) max = array[i];
        }
        double avg = (double) sum / max * 100 / count;

        bw.write(String.valueOf(avg));
        bw.flush();
        br.close();

    }
}
