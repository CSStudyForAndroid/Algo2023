package ch4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ct_ch4_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        // 나이트 이동 가능한 위치
        int[] arr_x = {2, 2, -2, -2, 1, 1, -1, -1};
        int[] arr_y = {1,-1, 1, -1, 2, -2, 2, -2};

        // 현재 나이트 위치
        int row = Integer.parseInt(String.valueOf(str.charAt(1)));
        int column = str.charAt(0) - 'a' + 1;

        int result = 0;
        for(int i = 0; i < 8; i++){
            // 8가지 이동 가능한 방법에 대하여 실행
            if(row + arr_x[i] >= 1 && row + arr_x[i] <= 8 && column + arr_y[i] >= 1 && column + arr_y[i] <= 8) result++;
        }

        System.out.println(result);
    }
}
