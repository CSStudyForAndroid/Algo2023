package ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ct_ch11_02 { // 곱하기 혹은 더하기
    /*
    주어진 문자열에서 숫자 사이에 x 또는 + 연산자를 넣어
    가장 큰 수 만들기
    모든 연산은 왼쪽에서부터 순서대로 실행

    0 -> +
    1 -> +
    나머지 -> x
     */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();

        int result = 1;
        for(int i = 0; i < arr.length; i++){
            switch(arr[i]){
                case 0:
                case 1:
                    result += arr[i];
                default:
                    if(i > 0 && arr[i-1] == 0) result += arr[i];
                    else result *= arr[i];
            }
        }

        System.out.println(result);
    }
}
