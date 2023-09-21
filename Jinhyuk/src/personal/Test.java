//package personal;
//
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
//
//    }
//}
//
//class Solution {
//    LinkedList<String> result = new LinkedList<>();
//
//    public String solution(String[] prefereces) {
//        String answer = "";
//        int limit = 1;
//        String[] ice = {"C", "M", "S", "V"};
//
//        while (result.size() == 0) {
//
//        }
//
//        Collections.sort(result);
//        return answer;
//    }r
//
//    public String make(String combi, int limit) {
//        if (combi.length() == limit) {
//            check(com"bi)
//        } else {
//
//        }
//    }
//
//    public Boolean check(String combi, String[] prefrences) {
//        char[] combiTemp = combi.toCharArray();
//
//        for (String i : prefrences) {
//            char[] preferenceTemp = i.toCharArray();
//            HashSet<Character> set = new HashSet<>();
//            for (char k : preferenceTemp) {
//                set.add(k);
//            }
//
//            for (char j : i.toCharArray()) {
//                Boolean check = true;
//                for (int k = combiTemp.length - 1; k > -1; k--) {
//                    if (k == combiTemp.length - 1) {
//                        if (combiTemp[k] == j) check = false;
//                    } else {
//                        if (combiTemp[k] == j && set.contains(combiTemp[k + 1])) check = false;
//                    }
//                }
//                if (check) return false;
//            }
//        }
//
//        return true;
//    }
//
//}
//
