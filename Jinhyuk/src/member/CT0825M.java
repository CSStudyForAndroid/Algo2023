package member;

import javax.crypto.spec.PSource;
import java.util.Arrays;

public class CT0825M {
    static Solution temp = new Solution();

    public static void main(String[] args) {
        System.out.println(temp.solution(7, 3, 4, 1, new int[][]{{5, 7, 9}, {4, 6, 4}, {3, 6, 1}, {3, 2, 3}, {2, 1, 6}}));
    }
}

class Solution {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 100_000_000;

        int[][] shortesetWay = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) shortesetWay[i][j] = 0;
                else shortesetWay[i][j] = answer;
            }
        }

        for (int i = 0; i < fares.length; i++) {
            shortesetWay[fares[i][0] - 1][fares[i][1] - 1] = fares[i][2];
            shortesetWay[fares[i][1] - 1][fares[i][0] - 1] = fares[i][2];
        }

        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    shortesetWay[i][j] = Math.min(shortesetWay[i][j], shortesetWay[i][k] + shortesetWay[k][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            answer = Math.min(answer, shortesetWay[s - 1][i] + shortesetWay[i][a - 1] + shortesetWay[i][b - 1]);
        }

        return answer;
    }
}