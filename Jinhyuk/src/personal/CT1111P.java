package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CT1111P {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int size = Integer.parseInt(str);
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] list = new int[size];
        for (int i = 0; i < size; i++) {
            list[i] = Integer.parseInt(st.nextToken());
        }

        Solution temp = new Solution();
        System.out.println(temp.solutioin(size, list));

    }
}

class Solution {
    int solutioin(int size, int[] array) {
        int[] list = new int[size];
        for(int i = 0 ; i < size; i++){
            list[i] = array[size-1-i];
        }
        int[] result = new int[size];
        int max = 1;
        result[0] = 1;
        for (int i = 1; i < size; i++) {
            result[i] = 1;
            for (int j = 0; j < i; j++) {
                if (list[j] < list[i]) result[i] = Math.max(result[i], result[j] + 1);
            }
            max = Math.max(max, result[i]);
        }
        return size - max;
    }
}

//class Solution {
//    public int solution(int[][] list) {
//        int[] result = new int[list.length + 1];
//
//        for (int i = 0; i < list.length; i++) {
//
//            int next = i + (list[i][0]); // 종료 날짜
//            if (next <= list.length) { // 기간 내일 경우
//                result[next] = Math.max(list[i][1] + result[i], result[next]); // 종료 날짜에 받게되어 있는 보상과 지금 계산한 보상과 비교 후 저장
//            }
//
//            result[i + 1] = Math.max(result[i + 1], result[i]); // 다음 날 받기로 한 보상이 없다면 오늘 보상 저장
//            // 만약에 있다면 비교 후 저장
//        }
//
//        return result[list.length];
//    }
//
//}

//class Solution {
//
//    int findIdx(String word, int startIdx, int endIdx) {
//        if (startIdx > endIdx) return -1;
//        int mid = (startIdx + endIdx) / 2;
//
//        if (word.charAt(mid) != '?') {
//            if (word.charAt(mid + 1) == '?') return mid;
//            else return findIdx(word, mid + 1, endIdx);
//        } else {
//            return findIdx(word, startIdx, mid - 1);
//        }
//    }
//
//    int findStartPoint(LinkedList<String> list, int startIdx, int endIdx, int cutPoint, String checkPart) {
//        if (startIdx > endIdx) return -1;
//        int mid = (startIdx + endIdx) / 2;
//
//        String testString = list.get(mid).substring(0, cutPoint);
//        Boolean result = testString.equals(checkPart);
//
//        if (result) {
//            if (mid > 0) {
//                if (result == list.get(mid - 1).substring(0, cutPoint).equals(checkPart)) {
//                    return findStartPoint(list, startIdx, mid - 1, cutPoint, checkPart);
//                } else {
//                    return mid;
//                }
//            } else {
//                return mid;
//            }
//        } else {
//            int k = 0;
//            for (int i = 0; i < testString.length(); i++) {
//                if (testString.charAt(i) > checkPart.charAt(i)) {
//                    k = 1;
//                    break;
//                }
//                if (testString.charAt(i) < checkPart.charAt(i)) {
//                    k = -1;
//                    break;
//                }
//            }
//            if (k == 1) return findStartPoint(list, startIdx, mid - 1, cutPoint, checkPart);
//            else return findStartPoint(list, mid + 1, endIdx, cutPoint, checkPart);
//        }
//    }
//
//    int findEndPoint(LinkedList<String> list, int startIdx, int endIdx, int cutPoint, String checkPart) {
//        if (startIdx > endIdx) return -1;
//        int mid = (startIdx + endIdx) / 2;
//
//        String testString = list.get(mid).substring(0, cutPoint);
//        Boolean result = testString.equals(checkPart);
//
//        if (result) {
//            if (mid < list.size() - 1) {
//                if (result == list.get(mid + 1).substring(0, cutPoint).equals(checkPart)) {
//                    return findEndPoint(list, mid + 1, endIdx, cutPoint, checkPart);
//                } else {
//                    return mid;
//                }
//            } else {
//                return mid;
//            }
//        } else {
//            int k = 0;
//            for (int i = 0; i < testString.length(); i++) {
//                if (testString.charAt(i) > checkPart.charAt(i)) {
//                    k = 1;
//                    break;
//                }
//                if (testString.charAt(i) < checkPart.charAt(i)) {
//                    k = -1;
//                    break;
//                }
//            }
//            if (k == 1) return findEndPoint(list, startIdx, mid - 1, cutPoint, checkPart);
//            else return findEndPoint(list, mid + 1, endIdx, cutPoint, checkPart);
//        }
//    }
//
//    int[] solution(String[] words, String[] queries) {
//        HashMap<Integer, LinkedList<String>> hash = new HashMap<>();
//        for (String i : words) {
//            LinkedList<String> temp = hash.getOrDefault(i.length(), new LinkedList<String>());
//            temp.add(i);
//            hash.put(i.length(), temp);
//        }
//
//        int[] result = new int[queries.length];
//
//        for (int i = 0; i < queries.length; i++) {
//            String checkWord = queries[i];
//            int length = checkWord.length();
//
//            LinkedList<String> tempList = hash.get(length);
//            if (tempList == null) {
//                result[i] = 0;
//                continue;
//            }
//            Collections.sort(tempList);
//
//            Boolean flag = false;
//            if (checkWord.charAt(0) == '?') {
//                if (checkWord.charAt(length - 1) == '?') result[i] = tempList.size();
//                else {
//                    flag = true;
//                    char[] temp = new char[length];
//                    for (int j = 0; j < length; j++) {
//                        temp[j] = checkWord.charAt(length - 1 - j);
//                    }
//                    checkWord = String.valueOf(temp);
//                }
//            }
//            int idx = findIdx(checkWord, 0, length - 1);
//            int count = 0;
//            if (flag) {
//                String checkPart = queries[i].substring(length - 1 - idx);
//                for (String j : tempList) {
//                    String part = j.substring(length - 1 - idx);
//                    if (part.equals(checkPart)) count++;
//                }
//            } else {
//                String checkPart = checkWord.substring(0, idx + 1);
//                int startIdx = findStartPoint(tempList, 0, tempList.size() - 1, idx + 1, checkPart);
//                int endIdx= findEndPoint(tempList, 0, tempList.size()-1, idx+1, checkPart);
//                count = endIdx - startIdx + 1;
////                for (String j : tempList) {
////                    String part = j.substring(0, idx + 1);
////                    if (part.equals(checkPart)) count++;
////                    else if (count > 0) break;
////                }
//            }
//            result[i] = count;
//        }
//
//        return result;
//    }
//}

//import java.util.*;
//
//class Solution {
//
//    public int findWord(int start, int end, ArrayList<String> checkList, int rangeStart, int rangeEnd, String target) {
//        int count = 0;
//
//        for (String i : checkList) {
//            if (i.substring(rangeStart, rangeEnd).equals(target)) {
//                count++;
//            }
//        }
//
//        return count;
//    }
//
//    public int[] solution(String[] words, String[] queries) {
//        int[] answer = new int[queries.length];
//
//        HashMap<Integer, ArrayList<String>> hash = new HashMap<>();
//
//        for (String i : words) {
//            ArrayList<String> temp = hash.getOrDefault(i.length(), new ArrayList<String>());
//            temp.add(i);
//            hash.put(i.length(), temp);
//        }
//
//        for (int i = 0; i < queries.length; i++) {
//            char[] temp = queries[i].toCharArray();
//            int rangeStart = 0;
//            int rangeEnd = temp.length;
//            if (temp[0] != '?') {
//                for (int j = 0; j < temp.length; j++) {
//                    if (temp[j] == '?') {
//                        rangeEnd = j;
//                        break;
//                    }
//                }
//            } else {
//                for (int j = 0; j < temp.length; j++) {
//                    if (temp[j] != '?') {
//                        rangeStart = j;
//                        break;
//                    }
//                }
//            }
//
//            ArrayList checkList = hash.get(queries[i].length());
//            if (checkList != null)
//                answer[i] = findWord(0, checkList.size() - 1, checkList, rangeStart, rangeEnd, queries[i].substring(rangeStart, rangeEnd));
//        }
//
////        for(int i : answer){
////            System.out.print(i+" ");
////        }
////        System.out.println();
//
//        return answer;
//    }
//}