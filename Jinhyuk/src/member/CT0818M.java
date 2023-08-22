package member;

import java.net.Inet4Address;
import java.util.*;

//public class CT0818M {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        System.out.println(temp.solution(new int[]{5, 1, 16, 2}));
//    }
//}
//
//class Solution {
//    int max = 0;
//
//    public int solution(int sticker[]) {
//        int answer = 0;
//
//        if (sticker.length == 1) return sticker[0];
//        for (int start = 0; start < 2; start++) {
//            int[] maxNum = new int[sticker.length];
//
//            maxNum[0] = sticker[start];
//
//            int rightIdx = start + 1;
//            rightIdx %= sticker.length;
//            maxNum[1] = Math.max(maxNum[start], sticker[rightIdx]);
//
//            for (int j = 2; j < start + sticker.length - 1; j++) {
//                int nextIdx = start + j;
//                nextIdx %= sticker.length;
//                maxNum[j] = Math.max(maxNum[j - 1], maxNum[j - 2] + sticker[nextIdx]);
//            }
//            answer = Math.max(answer, maxNum[sticker.length - 2]);
//        }
//
//        return answer;
//    }
//}