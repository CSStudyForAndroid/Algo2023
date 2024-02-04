package personal;

import java.util.*;
import java.io.*;

public class CT0205P {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());

        LinkedList<int[]> timeLine = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int startTime = Integer.parseInt(st.nextToken());
            int endTime = Integer.parseInt(st.nextToken());
            timeLine.add(new int[]{startTime, endTime});
        }

        Collections.sort(timeLine, (a, b) -> {
            if (a[1] == b[1]) {
                return a[0] - b[0];
            } else {
                return a[1] - b[1];
            }
        });

        int count = 0;
        int endT = 0;
        for(int[] i : timeLine){
            if(endT <= i[0]){
                endT = i[1];
                count++;
            }
        }
        System.out.println(count);
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int size = Integer.parseInt(br.readLine());
//        LinkedList<Integer> twoUp = new LinkedList<>();
//        int ones = 0;
//        boolean zero = false;
//        LinkedList<Integer> minus = new LinkedList<>();
//        for (int i = 0; i < size; i++) {
//            int num = Integer.parseInt(br.readLine());
//            if (num >= 2) {
//                twoUp.add(num);
//            } else if (num == 1) {
//                ones++;
//            } else if (num == 0) {
//                zero = true;
//            } else {
//                minus.add(num);
//            }
//        }
//
//        Collections.sort(twoUp);
//        Collections.sort(minus, Collections.reverseOrder());
//
//        int total = 0;
//        while (twoUp.size() > 1) {
//            int first = twoUp.removeLast();
//            int second = twoUp.removeLast();
//            total += (first * second);
//        }
//        if (twoUp.size() > 0) total += twoUp.removeLast();
//
//        while (minus.size() > 1) {
//            int first = minus.removeLast();
//            int second = minus.removeLast();
//            total += (first * second);
//        }
//        if (minus.size() > 0 && !zero) total += minus.removeLast();
//
//        total += ones;
//
//        System.out.println(total);
//    }
}
