//package personal;
//
//import java.util.*;
//
//public class CT0822P {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println(s.solution(new String[][]{{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}));
//    }
//}
//
//class Solution {
//    public int solution(String[][] clothes) {
//        int answer = 1;
//
//        HashMap<String, Integer> hash = new HashMap<>();
//        for (String[] i : clothes) {
//            int count = hash.getOrDefault(i[1], 1);
//            hash.put(i[1], count + 1);
//        }
//
//        for (int i : hash.values()) {
//            answer *= i;
//        }
//        answer -= 1;
//
//        return answer;
//    }
//}
////class Solution {
////    public int solution(String[][] clothes){
////        int answer = 0;
////        HashMap<String, Integer> hash = new HashMap<String, Integer>();
////        for(String[] i : clothes){
////            hash.put(i[1], hash.getOrDefault(i[1],1)+1);
////        }
////
////        var combi = 1;
////        for(int i : hash.values()){
////            combi *= i;
////        }
////
////        answer = combi-1;
////        return answer;
////    }
////}
