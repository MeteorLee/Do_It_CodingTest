package chapter03.c03_투_포인터.ex08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] array = new long[number];
        for (int i = 0; i < number; i++) {
            array[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(array);
        int count = 0;
        for (int i = 2; i < number; i++) {
            long find = array[i];
            int start_index = 0;
            int end_index = i - 1;

            while (start_index < end_index) {
                if (array[start_index] + array[end_index] == find) {
                    count++;
                    break;
                } else if (array[start_index] + array[end_index] < find) {
                    start_index++;
                } else {
                    end_index--;
                }
            }

        }
        System.out.println(count);
        br.close();
    }
}
