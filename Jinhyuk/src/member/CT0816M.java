package member;


import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class CT0816M {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{5, 1, 3, 7}, new int[]{2, 2, 6, 8}));
    }
}

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        PriorityQueue q1 = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i : A) {
            q1.add(i);
        }
        PriorityQueue q2 = new PriorityQueue<Integer>(Collections.reverseOrder());
        for (int i : B) {
            q2.add(i);
        }

        while (!q1.isEmpty() || !q2.isEmpty()) {
            int a = (int) q1.poll();
            int b = (int) q2.peek();
            if (a < b) {
                answer++;
                q2.poll();
            }
        }
        return answer;
    }
}
