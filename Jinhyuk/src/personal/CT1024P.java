//package personal;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.HashMap;
//import java.util.StringTokenizer;
//
//public class CT1024P {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        int size = Integer.parseInt(st.nextToken());
//        int targetNum = Integer.parseInt(st.nextToken());
//        str = br.readLine();
//        st = new StringTokenizer(str, " ");
//        int[] list = new int[size];
//        for (int i = 0; i < size; i++) {
//            list[i] = Integer.parseInt(st.nextToken());
//        }
//
//        Solution temp = new Solution();
//        System.out.println(temp.solution(list, targetNum));
//
//    }
//}
//
//class Solution {
//    public int solution(int[] list, int num) {
//        int startIdx = findFirst(list, num, 0, list.length - 1);
//        int lastIdx = findLast(list, num, 0, list.length - 1);
//        System.out.println(startIdx + " " + lastIdx);
//        return lastIdx - startIdx + 1;
//    }
//
//    public int findFirst(int[] list, int num, int start, int end) {
//        if (start > end) return -1;
//        int mid = (start + end) / 2;
//
//        if (list[mid] == num && (mid == 0 || list[mid - 1] < num)) {
//            return mid;
//        }
//        if (list[mid] >= num) {
//            return findFirst(list, num, start, mid - 1);
//        } else {
//            return findFirst(list, num, mid + 1, end);
//        }
//    }
//
//    public int findLast(int[] list, int num, int start, int end) {
//        if (start > end) return -1;
//        int mid = (start + end) / 2;
//
//        if (list[mid] == num && (mid == list.length - 1 || list[mid + 1] > num)) {
//            return mid;
//        }
//        if (list[mid] > num) {
//            return findLast(list, num, start, mid - 1);
//        } else {
//            return findLast(list, num, mid + 1, end);
//        }
//    }
//
////    public int[] solution(int N, int[] stages) {
////        int allPeople = stages.length;
////        double[][] answer = new double[N][2];
////        for (int i = 0; i < N; i++) {
////            int count = 0;
////            for (int j = 0; j < stages.length; j++) {
////                if (stages[j] == (i + 1)) count++;
////            }
////            answer[i][0] = i + 1;
////            if (allPeople == 0) answer[i][1] = 0;
////            else answer[i][1] = count / (allPeople * 1.0);
////            allPeople -= count;
////        }
////
////        Arrays.sort(answer, (a, b) -> {
////            if (a[1] == b[1]) {
////                return (int) (a[0] - b[0]);
////            } else {
////                if (((b[1] - a[1]) > 0)) return 1;
////                else return -1;
////            }
////        });
////
////        int[] result = new int[N];
////        for (int i = 0; i < N; i++) {
////            result[i] = (int) answer[i][0];
////        }
////        return result;
////    }
//}
//
////class Solution {
////    public int[] solution(int N, int[] stages) {
////
////        Map<Integer, Double> map = new HashMap<>();
////        for (int i = 1; i <= N; i++) {
////            double total = 0;
////            double fail = 0;
////            for (int j = 0; j < stages.length; j++) {
////                if (i <= stages[j]) total++;
////                if (i == stages[j]) fail++;
////            }
////            if (total == 0 && fail == 0) total = 1;
////            map.put(i, fail / total);
////        }
////
////        int[] answer = new int[N];
////        for (int i = 0; i < N; i++) {
////            double max = -1;
////            int rKey = 0;
////            for (int key : map.keySet()) {
////                if (max < map.get(key)) {
////                    max = map.get(key);
////                    rKey = key;
////                }
////            }
////            answer[i] = rKey;
////            map.remove(rKey);
////        }
////
////        return answer;
////    }
////}