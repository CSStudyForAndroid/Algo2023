package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;

public class CT0202P {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            int num = Integer.parseInt(br.readLine());
            q.add(num);
        }
        Collections.sort(q);
        int sum = 0;
        while (q.size() > 1) {
            int biggest = q.removeLast();
            if (biggest * q.getLast() > biggest + q.getLast()) {
                int subBiggest = q.removeLast();
                sum += biggest * subBiggest;
            } else {
                sum += biggest;
            }
        }
        sum += q.getLast();
        System.out.println(sum);
    }
//    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int size = Integer.parseInt(br.readLine());
//        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->a-b);
//        for(int i = 0 ; i < size ; i++){
//            int num = Integer.parseInt(br.readLine());
//            q.add(num);
//        }
//        int result = 0;
//        while(true){
//            int first = q.poll();
//            if(q.isEmpty()) {
//                System.out.println(result);
//                break;
//            }
//            int second = q.poll();
//            int sum = first+second;
//            q.add(sum);
//            result += sum;
//        }
//    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int coin = Integer.parseInt(st.nextToken());
//        int target = Integer.parseInt(st.nextToken());
//        int[] coinList = new int[coin];
//        for (int i = 0; i < coin; i++) {
//            coinList[i] = Integer.parseInt(br.readLine());
//        }
//        int result = 0;
//        for (int i = coin - 1; i >= 0; i--) {
//            if (target / coinList[i] > 0) {
//                int count = (target / coinList[i]);
//                result += count;
//                target -= count * coinList[i];
//            }
//        }
//        System.out.println(result);
//    }
//    static int[] lengths;
//    static int lesson;
//    static int blueRay;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        lesson = Integer.parseInt(st.nextToken());
//        blueRay = Integer.parseInt(st.nextToken());
//        lengths = new int[lesson];
//        int sum = 0;
//        int start = 0;
//        st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < lesson; i++) {
//            lengths[i] = Integer.parseInt(st.nextToken());
//            sum += lengths[i];
//            if (start < lengths[i]) start = lengths[i];
//        }
//
//        int result = findMinLength(start, sum);
//        System.out.println(result);
//    }
//
//    static int findMinLength(int start, int end) {
//        if (start > end) return start;
//
//        int mid = (start + end) / 2;
//
//        if (checkNum(mid)) {
//            return findMinLength(start, mid - 1);
//        } else {
//            return findMinLength(mid + 1, end);
//        }
//    }
//
//    static boolean checkNum(int num) {
//        int sum = 0;
//        int count = 1;
//        for (int i = 0; i < lesson; i++) {
//            sum += lengths[i];
//            if (sum > num) {
//                sum = lengths[i];
//                count++;
//            }
//            if (count > blueRay) return false;
//        }
//        return true;
//    }
//    static int[] nums;
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int count = Integer.parseInt(br.readLine());
//        nums = new int[count];
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < count; i++) {
//            nums[i] = Integer.parseInt(st.nextToken());
//        }
//        Arrays.sort(nums);
//        int findCount = Integer.parseInt(br.readLine());
//        st = new StringTokenizer(br.readLine(), " ");
//        for (int i = 0; i < findCount; i++) {
//            int targetNum = Integer.parseInt(st.nextToken());
//            int result = checkNum(0, count - 1, targetNum);
//            System.out.println(result);
//        }
//    }
//
//    static int checkNum(int start, int end, int target) {
//        if (start > end) return 0;
//
//        int mid = (start + end) / 2;
//        if (nums[mid] == target) return 1;
//        else if (nums[mid] < target) return checkNum(mid + 1, end, target);
//        else return checkNum(start, mid - 1, target);
//    }
}
