package chapter03.array_list.ex03;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int number = Integer.parseInt(st.nextToken());
        int count = Integer.parseInt(st.nextToken());

        int[] numberArray = new int[number];
        str = br.readLine();
        st = new StringTokenizer(str, " ");

        for (int i = 0; i < number; i++) {
            numberArray[i] = Integer.parseInt(st.nextToken());
        }

        long[] sumArray = new long[number];
        sumArray[0] = numberArray[0];

        for (int i = 1; i < number; i++) {
            sumArray[i] = sumArray[i - 1] + numberArray[i];
        }


        for (int i = 0; i < count; i++) {
            str = br.readLine();
            st = new StringTokenizer(str, " ");

            int sectionI = Integer.parseInt(st.nextToken()) - 1;
            int sectionJ = Integer.parseInt(st.nextToken()) - 1;

            long answer;

            if (sectionI == 0) {
                answer = sumArray[sectionJ];
            } else {
                answer = sumArray[sectionJ] - sumArray[sectionI - 1];
            }

            bw.write(answer + "\n");
        }
        bw.flush();
        br.close();

    }
}
