package member;

import java.util.HashSet;
import java.util.LinkedList;

public class CT0817M {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int start = 1;
        int end = 1;
        int size = ((2 * w) + 1);

        for (int i : stations) {
            if (i - w <= 1) {
                start = i + w + 1;
            } else {
                end = i - w - 1;
            }

            if (start <= end) {
                int term = end - start + 1;
                int a = term / size;
                int b = term % size;
                if (b > 0) {
                    answer += a + 1;
                } else {
                    answer += a;
                }


            }
            start = i + w + 1;
            if (start > n) break;
        }

        if (start <= n && end <= n) {
            int term = n - start + 1;
            int a = term / size;
            int b = term % size;
            if (b > 0) {
                answer += a + 1;
            } else {
                answer += a;
            }
        }

        return answer;
    }
}