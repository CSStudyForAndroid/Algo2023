package ch7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ct_ch7_3 {
    static int n, m;
    static int[] arr;
    static int max = 0;

    public static void main(String[] args) throws IOException {
        /*
        한 봉지 안의 떡 총 길이는 동일한데 각 떡의 길이는 일정하지 않음
        한 봉지 안의 떡 총 길이: H

        이진 탐색
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        System.out.println(binarySearch(0, (int) 1e9));
    }

    static private int binarySearch(int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            int total = 0;

            // 잘린 떡의 양 구하기
            for (int i = 0; i < n; i++){
                if (arr[i] > mid) {
                    total += arr[i] - mid;
                }
            }

            // 총 길이가 m보다 작은 경우
            if (total < m) {
                end = mid - 1; // 절단기의 H를 낮춰야 함
            }else {
                max = Math.max(max, mid);
                start = mid + 1;
            }

        }

        return max;
    }
}
