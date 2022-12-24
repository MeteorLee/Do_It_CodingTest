package chapter03.c02_구간합.ex01;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int sum = 0;
        int number = Integer.parseInt(br.readLine());
        int[] array = new int[number];
        String str = br.readLine();


        for (int i = 0; i < array.length; i++) {
            array[i] = str.charAt(i) - 48;
            sum += array[i];
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
    }
}
