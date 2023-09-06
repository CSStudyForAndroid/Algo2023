package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CT0906P {

    static int[] nowPosition = {1, 1};
    static int[] dice1 = new int[4];
    static int[] dice2 = new int[4];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer result = new StringTokenizer(str, " ");
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = Integer.valueOf(result.nextToken());
        }

        int[][] map = new int[array[0]][array[1]];
        for (int i = 0; i < array[0]; i++) {
            str = br.readLine();
            result = new StringTokenizer(str, " ");
            for (int j = 0; j < array[1]; j++) {
                map[i][j] = Integer.valueOf(result.nextToken());
            }
        }

        str = br.readLine();
        result = new StringTokenizer(str, " ");
        int[] moveWay = new int[array[4]];
        for (int i = 0; i < array[4]; i++) {
            moveWay[i] = Integer.valueOf(result.nextToken());
        }

        int[][] dice = new int[4][4];
    }

    static void MakeDice(int direc) {
        if (direc == 1) { // 오른쪽
            int yPos = nowPosition[1];
            yPos = (yPos + 1) % 4;
            nowPosition[1] = yPos;
            if()
        } else if (direc == 2) { // 왼쪽
            int yPos = nowPosition[1];
            yPos = (yPos + 3) % 4;
            nowPosition[1] = yPos;
        } else if (direc == 3) { // 위쪽
            int xPos = nowPosition[0];
            xPos = (xPos + 3) % 4;
            nowPosition[0] = xPos;
        } else { // 아래쪽
            int xPos = nowPosition[0];
            xPos = (xPos + 1) % 4;
            nowPosition[0] = xPos;
        }
    }
}


/////////////////////////////////////////////////////////////////
//class Solution {
//    public String solution(int[] numbers) {
//        String answer = "";
//
//        int max = 0;
//        LinkedList<Integer> list = new LinkedList<>();
//        for (int i : numbers) {
//            max = Math.max(i, max);
//            list.add(i);
//        }
//
//        Collections.sort(list, (a, b) -> {
//            int result = makeNumber(b, 4) - makeNumber(a, 4);
//            if (result == 0) {
//                return (String.valueOf(a).length() - String.valueOf(b).length());
//            } else {
//                return result;
//            }
//        });
//
//        for (int i : list) {
//            answer += String.valueOf(i);
//        }
//
//        if (answer.charAt(0) == '0') answer = "0";
//
//        return answer;
//    }
//
//    int makeNumber(int target, int size) {
//        String temp = String.valueOf(target);
//        int targetSize = temp.length();
//        if (targetSize < size) {
//            int diff = size - temp.length();
//            for (int i = 0; i < diff; i++) {
//                int idx = (i % targetSize);
//
//                temp += temp.charAt(idx);
//            }
//            return Integer.valueOf(temp);
//        } else {
//            return target;
//        }
//    }
//}


//class Solution {
//    fun solution(numbers: IntArray): String {
//        var answer = ""
//        val sortedNumbers = numbers.sortedByDescending {
//            var temp = it.toString()
//            while(temp.length < 4){
//                temp = temp.plus(temp)
//            }
//            temp.substring(0 until 4).toInt()
//        }
//        val result = sortedNumbers.joinToString("")
//        if(result[0] == '0'){
//            answer = "0"
//        }else{
//            answer = result
//        }
//        return answer
//    }
//}
