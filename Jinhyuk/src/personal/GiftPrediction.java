package personal;

import java.util.*;

import java.util.HashMap;
import java.util.HashSet;

public class GiftPrediction {

    public static void main(String[] args) {
        // Test Case 1
        Solution temp = new Solution();
        String[] friends1 = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts1 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(temp.solution(friends1, gifts1)); // Output: 2

        // Test Case 2
        String[] friends2 = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts2 = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        System.out.println(temp.solution(friends2, gifts2)); // Output: 4

        // Test Case 3
        String[] friends3 = {"a", "b", "c"};
        String[] gifts3 = {"a b", "b a", "c a", "a c", "a c", "c a"};
        System.out.println(temp.solution(friends3, gifts3)); // Output: 0
    }

}

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        HashMap<String, Integer> naming = new HashMap<>();
        for (int i = 0; i < friends.length; i++) {
            naming.put(friends[i], i);
        }

        int[][] giftTrans = new int[friends.length][friends.length];
        for (int i = 0; i < gifts.length; i++) {
            String[] temp = gifts[i].split(" ");
            String giver = (temp[0]);
            String taker = (temp[1]);
            int giverIdx = naming.get(giver);
            int takerIdx = naming.get(taker);
            giftTrans[giverIdx][takerIdx]++;
        }

        int[] giftIdx = new int[friends.length];
        for (int i = 0; i < giftTrans.length; i++) {
            int givingCountOfI = 0;
            for (int j = 0; j < giftTrans.length; j++) {
                givingCountOfI += giftTrans[i][j];
            }
            int takingCountOfI = 0;
            for (int j = 0; j < giftTrans.length; j++) {
                takingCountOfI += giftTrans[j][i];
            }
            giftIdx[i] = givingCountOfI - takingCountOfI;
        }

        int[] thisMonth = new int[friends.length];
        for (int i = 0; i < giftTrans.length; i++) {
            for (int j = 0; j < giftTrans.length; j++) {
                if (i == j) continue;
                int giverISI = giftTrans[i][j];
                int giverIsJ = giftTrans[j][i];
                if (giverISI > giverIsJ) {
                    thisMonth[i]++;
                } else if (giverISI < giverIsJ) {
//                        thisMonth[j]++;
                } else {
                    // i와 j의 선물지수 비교
                    if (giftIdx[i] > giftIdx[j]) thisMonth[i]++;
//                        else if (giftIdx[j] > giftIdx[i]) thisMonth[j]++;
                }
            }
        }
        System.out.println(Arrays.toString(thisMonth));

        for (int i = 0; i < thisMonth.length; i++) {
            answer = Math.max(answer, thisMonth[i]);
        }

        return answer;
    }
}
