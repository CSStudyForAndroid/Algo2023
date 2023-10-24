//package personal;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class CT1023P {
//    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        int size = Integer.parseInt(str);
////        String[][] list = new String[size][4];
////        for (int i = 0; i < size; i++) {
////            str = br.readLine();
////            StringTokenizer st = new StringTokenizer(str, " ");
//////            list[i][0] = st.nextToken();
//////            list[i][1] = st.nextToken();
//////            list[i][2] = st.nextToken();
//////            list[i][3] = st.nextToken();
////            int j = 0;
////            while (st.hasMoreTokens()) {
////                list[i][j] = st.nextToken();
////                j++;
////            }
////        }
////        Solution temp = new Solution();
////        String[] result = temp.solution(list);
////        for (int i = 0; i < size; i++) {
////            System.out.println(result[i]);
////        }
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        int size = Integer.parseInt(br.readLine());
////        String[] list = new String[size];
////        String temp = br.readLine();
////        StringTokenizer st = new StringTokenizer(temp, " ");
////        for (int i = 0; i < size; i++) {
////            list[i] = st.nextToken();
////        }
////        Solution result = new Solution();
////        System.out.println(result.solution(list));
//    }
//}
//
//class Solution {
//
//
////    public int solution(int[] list) {
////        Arrays.sort(list);
////        return list[(list.length - 1) / 2];
////    }
//
////    public String[] solution(String[][] list) {
////        Arrays.sort(list, (String[] a, String[] b) -> {
////            if (Integer.parseInt(a[1]) != Integer.parseInt(b[1]))
////                return Integer.parseInt(b[1]) - Integer.parseInt(a[1]);
////            else if (Integer.parseInt(a[2]) != Integer.parseInt(b[2]))
////                return Integer.parseInt(a[2]) - Integer.parseInt(b[2]);
////            else if (Integer.parseInt(a[3]) != Integer.parseInt(b[3]))
////                return Integer.parseInt(b[3]) - Integer.parseInt(a[3]);
////            else return a[0].compareTo(b[0]);
////        });
////        String[] result = new String[list.length];
////        for (int i = 0; i < list.length; i++) {
////            result[i] = list[i][0];
////        }
////        return result;
////    }
//}