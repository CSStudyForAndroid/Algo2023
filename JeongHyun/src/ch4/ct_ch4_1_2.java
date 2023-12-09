package ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ct_ch4_1_2 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j < 60; j++){
                for(int k = 0; k < 60; k++){
                    if(i % 10 == 3 || j % 10 == 3 || j / 10 == 3 || k % 10 == 3 || k / 10 == 3) result++;
                }
            }
        }

        System.out.println(result);
    }*/

    public static void main(String[] args) throws IOException {
        /*
        00시 00분 00초 ~ N시 59분 59초
        3이 하나라도 포함되는 경우의 수
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        int result = 0;
        for (int i = 0; i <= n; i++){
            for (int j = 0; j <= 60; j++){
                for (int k = 0; k <= 60; k++) {
                    if (i % 10 == 3 || j % 10 == 3 || j / 10 == 3 || k % 10 == 3 || k /10 == 3) result++;
                }
            }
        }
        System.out.println(result);

    }
}
