package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ct_ch3_4 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int count = 0;
        count += n % k; // 1 빼는 연산 횟수
        n -= count;
        while(n != 1){
            n /= k;
            count++;
        }

        System.out.println(count);
    }*/

    public static void main(String[] args) throws IOException {
        /*
        N이 K로 나눠 떨어질 때만 나누기 가능
        N에서 1 빼기
        최소 횟수 구하기

        26 5 -> 5 5 1
        26 % 5 만큼 1을 뺌
        나머지 만큼 나누기 가능
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int result = n % k;
        n -= result;
        while (n != 1 ){
            n /= k;
            result++;
        }
        System.out.println(result);
    }
}
