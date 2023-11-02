//package personal;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.nio.Buffer;
//import java.util.Arrays;
//import java.util.StringTokenizer;
//
//public class CT1031P {
//    //    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        StringTokenizer st = new StringTokenizer(str, " ");
////        int x = Integer.parseInt(st.nextToken());
////        int y = Integer.parseInt(st.nextToken());
////        int[][] list = new int[x][y];
////        str = br.readLine();
////        st = new StringTokenizer(str, " ");
////        for (int i = 0; i < x; i++) {
////            for (int j = 0; j < y; j++) {
////                list[i][j] = Integer.parseInt(st.nextToken());
////            }
////        }
////
////        Solution temp = new Solution();
////        System.out.println(temp.solution(list));
////    }
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        int size = Integer.parseInt(str);
////        int[][] list = new int[size][size];
////        for (int i = 0; i < size; i++) {
////            str = br.readLine();
////            StringTokenizer st = new StringTokenizer(str, " ");
////            for (int j = 0; j < i + 1; j++) {
////                list[i][j] = Integer.parseInt(st.nextToken());
////            }
////        }
////
////        Solution temp = new Solution();
////        System.out.println(temp.solution(list));
////    }
//    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        int size = Integer.parseInt(str);
////        int[][] list = new int[size][2];
////
////        for (int i = 0; i < size; i++) {
////            str = br.readLine();
////            StringTokenizer st = new StringTokenizer(str, " ");
////            list[i][0] = Integer.parseInt(st.nextToken());
////            list[i][1] = Integer.parseInt(st.nextToken());
////        }
////        Solution temp = new Solution();
////        System.out.println(temp.solution(list));
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        String str = br.readLine();
////        int size = Integer.parseInt(str);
////        int line = Integer.parseInt(br.readLine());
////        int[][] list = new int[line][3];
////        for (int i = 0; i < line; i++) {
////            str = br.readLine();
////            StringTokenizer st = new StringTokenizer(str, " ");
////            list[i][0] = Integer.parseInt(st.nextToken());
////            list[i][1] = Integer.parseInt(st.nextToken());
////            list[i][2] = Integer.parseInt(st.nextToken());
////        }
////        Solution temp = new Solution();
////        int[][] result = temp.solution(list, size);
////        for (int i = 0; i < size; i++) {
////            for (int j = 0; j < size; j++) {
////                System.out.print(result[i][j] + " ");
////            }
////            System.out.println();
////        }
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        StringTokenizer st = new StringTokenizer(str, " ");
//        int size = Integer.parseInt(st.nextToken());
//        int count = Integer.parseInt(st.nextToken());
//
//        int[][] list = new int[size][2];
//        for (int i = 0; i < count; i++) {
//            str = br.readLine();
//            st = new StringTokenizer(str, " ");
//            list[i][0] = Integer.parseInt(st.nextToken());
//            list[i][1] = Integer.parseInt(st.nextToken());
//        }
//
//        Solution temp = new Solution();
//        System.out.println(temp.solution(list, size));
//
//    }
//}
//
//class Solution {
//
//    public int solution(int[][] list, int size) {
//        int[][] result = new int[size + 1][size + 1];
//
//        for (int[] i : list) {
//            result[i[0]][i[1]] = 1;
//        }
//
//        for (int k = 1; k <= size; k++) {
//            for (int i = 1; i <= size; i++) {
//                for (int j = 1; j <= size; j++) {
//                    if (result[i][k] != 0 && result[k][j] != 0) {
//                        result[i][j] = 1;
//                    }
//                }
//            }
//        }
//
//        for (int i = 1; i <= size; i++) {
//            for (int j = 1; j <= size; j++) {
//                System.out.print(result[i][j] + " ");
//            }
//            System.out.println();
//        }
//
//        int count = 0;
//        for (int i = 1; i <= size; i++) {
//            int num = 0;
//            for (int j = 1; j <= size; j++) {
//                num += result[j][i];
//                num += result[i][j];
//            }
//            if (num == size - 1) count++;
//        }
//        return count;
//    }
//
////    public int[][] solution(int[][] list, int size) {
////        int[][] result = new int[size][size];
////        for (int i = 0; i < size; i++) {
////            for (int j = 0; j < size; j++) {
////                if (i == j) result[i][j] = 0;
////                else result[i][j] = 100000;
////            }
////        }
////
////        for (int[] i : list) {
////            result[i[0] - 1][i[1] - 1] = Math.min(i[2], result[i[0] - 1][i[1] - 1]);
////        }
////
////        for (int k = 0; k < size; k++) {
////            for (int i = 0; i < size; i++) {
////                for (int j = 0; j < size; j++) {
////                    result[i][j] = Math.min(result[i][j], result[i][k] + result[k][j]);
////                }
////            }
////        }
////        return result;
////    }
////    public int solution(int[][] list) {
////        int[] result = new int[list.length + 1];
////
////        for (int i = 0; i < list.length; i++) {
////
////            int next = i + (list[i][0]);
////            if (next <= list.length) {
////                result[next] = Math.max(list[i][1] + result[i], result[next]);
////            }
////
////            result[i+1] = Math.max(result[i+1], result[i]);
////        }
////
////        return result[list.length];
////    }
////    public int solution(int[][] list) {
////        for (int i = 1; i < list.length; i++) {
////            for (int j = 0; j < list[i].length; j++) {
////                int max = 0;
////                if (j < list[i - 1].length) {
////                    max = Math.max(max, list[i - 1][j]);
////                }
////                if (j > 0) {
////                    max = Math.max(max, list[i - 1][j - 1]);
////                }
////
////                list[i][j] += max;
////            }
////        }
////        int max = 0;
////        for (int i = 0; i < list.length; i++) {
////            max = Math.max(max, list[list.length - 1][i]);
////        }
////        return max;
////    }
//
////    public int solution(int[][] list) {
////        for (int i = 1; i < list[0].length; i++) {
////            for (int j = 0; j < list.length; j++) {
////                int max = list[j][i - 1];
////                if (j > 0) {
////                    max = Math.max(max, list[j - 1][i - 1]);
////                }
////                if (j < list.length - 1) {
////                    max = Math.max(max, list[j + 1][i - 1]);
////                }
////
////                list[j][i] += max;
////            }
////        }
////        int max = 0;
////        for (int i = 0; i < list.length; i++) {
////            max = Math.max(max, list[i][list[0].length - 1]);
////        }
////        return max;
////    }
//}
