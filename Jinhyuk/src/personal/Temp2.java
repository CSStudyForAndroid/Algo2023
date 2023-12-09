package personal;

import java.util.Arrays;
import java.util.LinkedList;

import java.util.*;

import java.util.*;

import java.util.*;

import java.util.*;

import java.util.*;

public class Temp2 {
    static int n;
    static int[][] dice;
    static boolean[] visited;
    static int maxWin = 0;
    static int[] answer;

    public static void main(String[] args) {
        int[][] dice = {{1, 2, 3, 4, 5, 6}, {3, 3, 3, 3, 4, 4}, {1, 3, 3, 4, 4, 4}, {1, 1, 4, 4, 5, 5}};
        System.out.println(Arrays.toString(solution(dice)));
    }

    public static int[] solution(int[][] dice) {
        n = dice.length;
        Temp2.dice = dice;
        visited = new boolean[n];
        pickDice(0, new int[n / 2], 0);
        return answer;
    }

    public static void pickDice(int start, int[] a, int index) {
        if (index == n / 2) {
            int[] b = new int[n / 2];
            int idx = 0;
            for (int i = 0; i < n; i++) {
                if (!visited[i]) {
                    b[idx++] = i + 1;
                }
            }
            int winCount = calculateWinCount(a, b);
            if (winCount > maxWin) {
                maxWin = winCount;
                answer = a.clone();
            }
        } else {
            for (int i = start; i < n; i++) {
                if (!visited[i]) {
                    visited[i] = true;
                    a[index] = i + 1;
                    pickDice(i + 1, a, index + 1);
                    visited[i] = false;
                }
            }
        }
    }

    public static int calculateWinCount(int[] a, int[] b) {
        int winCount = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                for (int k = 0; k < n / 2; k++) {
                    for (int l = 0; l < n / 2; l++) {
                        if (dice[a[k] - 1][i] > dice[b[l] - 1][j]) {
                            winCount++;
                        }
                    }
                }
            }
        }
        return winCount;
    }
}
