package ch6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.IntStream;

public class ct_ch6_4 {
    /*public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        Integer[] arr1 = new Integer [n];
        Integer[] arr2 = new Integer[n];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr2[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr1); // 오름차순
        Arrays.sort(arr2, Collections.reverseOrder()); // 내림차순

        for(int i = 0; i < k; i++){
            if(arr1[i] < arr2[i]){
                // swap
                int temp = arr1[i];
                arr1[i] = arr2[i];
                arr2[i] = temp;
            }else break;
        }

        int answer = 0;
        for(int i = 0; i < n; i++)
            answer += arr1[i];

        System.out.println(answer);
    }*/

    public static void main(String[] args) throws IOException {
        /*
        A 배열은 오름차순, B 배열은 내림차순 정렬
        i를 0부터 k-1번까지 비교해서 B 배열의 수가 더 클 때까지 서로 교환
        => List로 만들기?
        A 모두 더하기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        Integer[] a = new Integer[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        Integer[] b = new Integer[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(a);
        Arrays.sort(b, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            if (b[i] > a[i]) {
                // swap
                int temp = a[i];
                a[i] = b[i];
                b[i] = temp;
            }else break;
        }

        System.out.println(Arrays.stream(Arrays.stream(a).mapToInt(Integer::intValue).toArray()).sum());
    }
}
