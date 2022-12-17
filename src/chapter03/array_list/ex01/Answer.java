package chapter03.array_list.ex01;

import java.io.*;

public class Answer {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int num = Integer.parseInt(br.readLine());
        String inputString = br.readLine();
        char[] charArray = inputString.toCharArray();

        if (charArray.length != num) {
            return;
        }

        for (int i = 0; i < charArray.length; i++) {
            sum += charArray[i] - '0';
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
    }
}
