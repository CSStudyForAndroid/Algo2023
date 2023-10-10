package ch12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ct_ch12_07 { // 럭키 스트레이
    /*
    점수가 특정 조건을 만족할 때만 렁키 스트레이트 기술 사용 가능
    N: 현재 캐릭터 점수
    123402 -> 1 + 2 + 3 == 4 + 0 + 2
    가능 -> LUCKY
    불가능 -> READY

    N <= 99,999,999 -> O(N)

    교재에서는 변수 하나 사용하고 앞부분 더하고 뒷부분 빼면서 0인지 아닌지 판단
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

        int a = 0, b = 0;
        for(int i = 0; i < arr.length/2; i++){
            a += arr[i];
            b += arr[arr.length-1-i];
        }

        if(a == b) System.out.println("LUCKY");
        else System.out.println("READY");
    }
}
