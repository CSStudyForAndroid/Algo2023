package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CT1012P {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        Solution temp = new Solution();
//        System.out.println(temp.solution(str));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        Solution temp = new Solution();
//        System.out.println(temp.solution(str));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine();
//        Solution temp = new Solution();
//        System.out.println(temp.solution(str));
    }
}

//class Solution {
//    public int[][] rotate(int[][] a) {
//        int n = a.length;
//        int m = a[0].length;
//        int[][] result = new int[n][m];
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                result[j][n - i - 1] = a[i][j];
//            }
//        }
//        return result;
//    }
//
//    public Boolean check(int[][] new_lock) {
//        int lock_length = new_lock.length / 3;
//        for (int i = lock_length; i < lock_length * 2; i++) {
//            for (int j = lock_length; j < lock_length * 2; j++) {
//                if (new_lock[i][j] != 1) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//
//    public boolean solution(int[][] key, int[][] lock) {
//        int n = lock.length;
//        int m = key.length;
//        int[][] new_lock = new int[n * 3][n * 3];
//        for (int i = 0; i < n * 3; i++) {
//            for (int j = 0; j < n * 3; j++) {
//                new_lock[i][j] = 0;
//            }
//        }
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                new_lock[i + n][j + n] = lock[i][j];
//            }
//        }
//        for (int i = 0; i < 4; i++) {
//            key = rotate(key);
//            for (int i = 0; i < n * 2; i++) {
//                for (int j = 0; j < n * 2; j++) {
//                    for (int a = 0; a < m; a++) {
//                        for (int b = 0; b < m; b++) {
//                            new_lock[i + a][j + b] += key[a][b];
//                        }
//                    }
//                    if (check(new_lock)) return true;
//                    for (int a = 0; a < m; a++) {
//                        for (int b = 0; b < m; b++) {
//                            new_lock[i + a][i + b] -= key[a][b];
//                        }
//                    }
//                }
//            }
//        }
//
//        return false;
//    }
//}

class Solution {

//    public int solution(String str) {
//        int shortestStr = str.length();
//        for (int i = 1; i <= str.length() / 2; i++) {
//            int result = calLength(i, str);
//            shortestStr = Math.min(shortestStr, result);
//        }
//
//        return shortestStr;
//    }
//
//    public int calLength(int i, String str) {
//        String temp = "";
//        StringBuilder result = new StringBuilder();
//        int count = 1;
//        for (int j = 0; j < str.length(); j += i) {
//            if (j + i <= str.length()) {
//                String check = str.substring(j, j + i);
//                if (temp.equals(check)) {
//                    count++;
//                } else {
//                    if (count > 1) result.append(String.valueOf(count));
//                    result.append(temp);
//
//                    count = 1;
//                    temp = check;
//                }
//            } else {
//                if (count > 1) result.append(String.valueOf(count));
//                result.append(temp);
//
//                count = 1;
//                temp = str.substring(j);
//            }
//        }
//
//        if (count > 1) result.append(String.valueOf(count));
//        result.append(temp);
//        return result.length();
//    }


//    public String solution(String str) {
//        char[] temp = str.toCharArray();
//        Arrays.sort(temp);
//        StringBuilder result = new StringBuilder();
//        int sum = 0;
//        for (char i : temp) {
//            if (i >= '0' && i <= '9') {
//                sum += i - '0';
//            } else {
//                result.append(i);
//            }
//        }
//        return result + String.valueOf(sum);
//    }

//    public String solution(String num) {
//        int leftSum = 0;
//        int rightSum = 0;
//        int half = num.length() / 2;
//        for (int i = 0; i < half; i++) {
//            leftSum += num.charAt(i) - '0';
//            rightSum += num.charAt(i + half) - '0';
//        }
//        if (leftSum == rightSum) {
//            return "LUCKY";
//        } else {
//            return "READY";
//        }
//    }
}
