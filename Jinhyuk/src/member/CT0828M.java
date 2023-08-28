//package member;
//
//import java.lang.reflect.Array;
//
//public class CT0828M {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        System.out.println(temp.solution("abacde"));
//    }
//}
//
//class Solution {
//    public int solution(String s) {
//        int answer = 0;
//        char[] temp = s.toCharArray();
//
//        for (int i = 0; i < s.length() - 1; i++) {
//            int count = 0;
//            for (int j = 0; j <= s.length(); j++) {
//                if (i - j < 0 || i + 1 + j > s.length() - 1) break;
//                if (temp[i - j] != temp[i + 1 + j]) {
//                    break;
//                } else {
//                    count++;
//                }
//            }
//            answer = Math.max(answer, count * 2);
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            int count = 0;
//            for (int j = 0; j <= s.length(); j++) {
//                if (i - j < 0 || i + j > s.length() - 1) break;
//                if (temp[i - j] != temp[i + j]) {
//                    break;
//                } else {
//                    count++;
//                }
//            }
//            answer = Math.max(answer, count * 2 - 1);
//        }
//
//        return answer;
//    }
//}