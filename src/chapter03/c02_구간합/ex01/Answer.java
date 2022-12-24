package chapter03.c02_구간합.ex01;

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
            sum += charArray[i] - '0'; // 48이라는 int 값이 아닌 '0'의 문자형을 빼준다.
        }
        bw.write(String.valueOf(sum));
        bw.flush();
        br.close();
    }
}

// 문자열 -> 문자형 배열[]로 변환 시 .toCharArray()를 사용하자.
// 2, 5, 8과 같은 숫자로 이루어진 문자형을 int형으로 변환할 때 -48이 아닌
// 문자형은 연산이 가능하기에 -'0'을 해주자