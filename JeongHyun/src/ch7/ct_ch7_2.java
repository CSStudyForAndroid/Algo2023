package ch7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ct_ch7_2 { // 이진 탐색
    static int n;
    static int[] n_arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        n_arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(n_arr);

        int m = Integer.parseInt(br.readLine());
        int[] m_arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < m_arr.length; i++) {
            int target = m_arr[i];
            if(binarySearch(target, 0, n-1)) System.out.println("yes ");
            else System.out.println("no ");
        }

    }

    static boolean binarySearch(int target, int start, int end) {
        while (start <= end) {
            int mid = (start + end) / 2;

            if (target < n_arr[mid]) {
                end = mid - 1;
                binarySearch(target, start, end);
            }else if(target > n_arr[mid]) {
                start = mid + 1;
                binarySearch(target, start, end);
            }else {
                // 같은 경우
                return true;
            }
        }
        return false;
    }
}
