package personal;

import java.io.*;
import java.util.*;
import java.util.PriorityQueue;

public class CT1225P {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        int[][] array = new int[size][2];

        for (int i = 0; i < size; i++) {
            int num = Integer.parseInt(br.readLine());
            array[i][0] = num;
            array[i][1] = i;
        }

        Arrays.sort(array, (int[] a, int[] b) -> a[0] - b[0]);

        int max = 0;
        for (int i = 0; i < size; i++) {
            max = Math.max(max, array[i][1] - i);
        }
        max++;

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(max + "");

        bw.flush();
        bw.close();
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int count = Integer.parseInt(br.readLine());
//
//        PriorityQueue<Integer> queue = new PriorityQueue<>((a, b) -> {
//            if (Math.abs(a) != Math.abs(b)) {
//                return Math.abs(a) - Math.abs(b);
//            } else {
//                return a - b;
//            }
//        });
//
//        LinkedList<Integer> result = new LinkedList<>();
//        for (int i = 0; i < count; i++) {
//            int num = Integer.parseInt(br.readLine());
//            if (num == 0) {
//                if (queue.size() > 0) result.add(queue.poll());
//                else result.add(0);
//            } else {
//                queue.offer(num);
//            }
//        }
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        for (int i = 0; i < result.size(); i++) {
//            bw.write(result.get(i) + "\n");
//        }
//
//        bw.flush();
//        bw.close();
//    }
}
