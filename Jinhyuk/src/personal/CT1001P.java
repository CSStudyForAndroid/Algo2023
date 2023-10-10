//package personal;
//
//import java.io.*;
//import java.util.HashMap;
//import java.util.StringTokenizer;
//
//public class CT1001P {
//    public static void main(String[] args) throws IOException {
////        Solution temp = new Solution();
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        int n = Integer.parseInt(str);
////        str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int[] array = new int[n];
////        for (int i = 0; i < n; i++) {
////            array[i] = Integer.parseInt(st.nextToken());
////        }
////        System.out.println(temp.solution(n, array));
//
////        Solution temp = new Solution();
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        int n = Integer.parseInt(str);
////        System.out.println(temp.solution(n));
////        Solution temp = new Solution();
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int n = Integer.parseInt(st.nextToken());
////        int m = Integer.parseInt(st.nextToken());
////        int[] array = new int[n];
////        for (int i = 0; i < n; i++) {
////            str = br.readLine();
////            array[i] = Integer.parseInt(str);
////        }
////        System.out.println(temp.solution(m, array));
//    }
//}
//
//class Solution {
//
////    public int solution(int m, int[] array) {
////        HashMap<Integer, Integer> hash = new HashMap();
////        for (int i : array) {
////            hash.put(i, 1);
////        }
////        for (int i = 1; i <= m; i++) {
////            int min = m;
////            for (int j : array) {
////                if (hash.containsKey(i - j)) min = Math.min(min, hash.get(i - j) + 1);
////            }
////            if (min != m) hash.put(i, min);
////        }
////
////        if (hash.containsKey(m)) {
////            return hash.get(m);
////        } else {
////            return -1;
////        }
////    }
//
//
////    public int solution(int n) {
////        int[] maxArray = new int[n + 1];
////        maxArray[1] = 1;
////        maxArray[2] = 3;
////        for (int i = 3; i <= n; i++) {
////            maxArray[i] = maxArray[i - 1] + maxArray[i - 2] * 2;
////        }
////        return maxArray[n];
////    }
//
////    public int solution(int n, int[] array) {
////        int[] maxArray = new int[array.length];
////        maxArray[0] = array[0];
////        maxArray[1] = Math.max(array[0], array[1]);
////
////        for (int i = 2; i < n; i++) {
////            maxArray[i] = Math.max(maxArray[i - 2] + array[i], maxArray[i - 1]);
////        }
////
////        return maxArray[n - 1];
////    }
//}