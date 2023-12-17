package personal;

import java.io.*;
import java.util.*;

public class CT1217P {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int n = Integer.parseInt(br.readLine());
//        int startNum = 1;
//        int endNum = 1;
//        int sum = 1;
//        int count = 0;
//        while (endNum <= n) {
//            if (sum == n) {
//                count++;
//                endNum++;
//                sum += endNum;
//            } else if (sum < n) {
//                endNum++;
//                sum += endNum;
//            } else {
//                sum -= startNum;
//                startNum++;
//            }
//        }
        int source = Integer.valueOf(br.readLine());
        int target = Integer.valueOf(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] list = new int[source];
        for (int i = 0; i < source; i++) {
            list[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(list);
        int start = 0;
        int end = source-1;
        int sum = list[0];
        int count = 0;
        while (start < end) {
            if (list[start] + list[end] == target) {
                start++;
                end--;
                count++;
            } else if (list[start] + list[end] < target) {
                start++;
            } else {
                end--;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(count+"");
        bw.write(count+"");

        bw.flush();
        bw.close();
    }
}
