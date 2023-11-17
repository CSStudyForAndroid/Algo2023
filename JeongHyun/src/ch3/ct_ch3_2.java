package ch3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ct_ch3_2 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int arr[] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        int first = arr[n-1];
        int second = arr[n-2];

        int cnt = (m / (k + 1)) * k;
        cnt += m % (k + 1);

        int result = 0;
        result += cnt * first;
        result += (m - cnt) * second;

        System.out.println(result);
    }*/

    public static void main(String[] args) throws IOException {
        /*
        m: 더해질 수의 개수
        k: 연속해서 K번까지만 더하기 가능

        배열을 정렬해 가장 큰 수, 두번째 큰수만 필요
        5개 최대 2개인 경우 -> 2 1 2
        7개 최대 2개인 경우 -> 2 1 2 1 1
        6개 최대 3개 -> 3 1 2
        8개 최대 3개 -> 3 1 3 1

        m / k - 1 번의 두번째 수
        나머지 개수 만큼의 첫번째 수
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        Arrays.sort(arr);

        int first = arr[arr.length-1];
        int second = arr[arr.length-2];

        int result = 0;
        int count = (m / (k + 1)) * k;
        result += count * first;
        result += (m-count) * second;

        System.out.println(result);
    }
}
