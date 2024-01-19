package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class CT0120P {

//    static LinkedList<Integer>[] nearList;
//    static boolean[] visitList;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int nodeSize = Integer.parseInt(st.nextToken());
//        int edgeSize = Integer.parseInt(st.nextToken());
//
//        nearList = new LinkedList[nodeSize + 1];
//        for (int i = 0; i <= nodeSize; i++) {
//            nearList[i] = new LinkedList<Integer>();
//        }
//
//        visitList = new boolean[nodeSize + 1];
//        visitList[0] = true;
//
//        for (int i = 0; i < edgeSize; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            int point1 = Integer.parseInt(st.nextToken());
//            int point2 = Integer.parseInt(st.nextToken());
//
//            nearList[point1].add(point2);
//            nearList[point2].add(point1);
//        }
//
//        int count = 0;
//        for (int i = 1; i < nodeSize + 1; i++) {
//            if (visitList[i] == false) {
//                count++;
//                dfs(i);
//            }
//        }
//
//        System.out.println(count);
//    }
//
//    static void dfs(int v) {
//        if (visitList[v]) {
//            return;
//        }
//
//        visitList[v] = true;
//
//        for (int i : nearList[v]) {
//            if (!visitList[i]) {
//                dfs(i);
//            }
//        }
//    }


    static LinkedList<Integer> list;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        list = new LinkedList<>();
        countNum(2, 1, size);
        countNum(3, 1, size);
        countNum(5, 1, size);
        countNum(7, 1, size);
    }

    static void countNum(int number, int now, int limit) {
        if (now == limit) {
            if (isPrime(number)) {
                System.out.println(number);
            }
            return;
        }

        for (int i = 1; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }

            if (isPrime(number * 10 + i)) {
                countNum(number * 10 + i, now + 1, limit);
            }
        }
    }

    static boolean isPrime(int num) {
        int limit = (int) Math.sqrt(num);
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
