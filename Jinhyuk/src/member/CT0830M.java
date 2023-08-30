//package member;
//
//public class CT0830M {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println(s.solution(new int[][]{{0, 0, 0}, {1, 0, 0}, {0, 1, 1}}, new int[][]{{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}));
//    }
//}
//
//class Solution {
//    public boolean solution(int[][] key, int[][] lock) {
//        boolean answer = true;
//        for (int i = 0; i < key.length; i++) {
//            for (int j = 0; j < key.length; j++) {
//                System.out.print(key[i][j]);
//            }
//            System.out.println();
//        }
//        System.out.println();
//        rotateKey(key);
//        for (int i = 0; i < key.length; i++) {
//            for (int j = 0; j < key.length; j++) {
//                System.out.print(key[i][j]);
//            }
//            System.out.println();
//        }
//
//        return answer;
//    }
//
//    public void rotateKey(int[][] key) {
//        int size = key.length;
//        int[][] temp = new int[size][size];
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                temp[i][j] = key[size - 1 - j][size - 1 - i];
//            }
//        }
//
//        for (int i = 0; i < size; i++) {
//            for (int j = 0; j < size; j++) {
//                key[i][j] = temp[i][j];
//            }
//        }
//    }
//}
