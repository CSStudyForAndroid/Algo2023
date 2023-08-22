//package member;
//
//import javax.sound.midi.Soundbank;
//import java.util.*;
//
//public class CT0822M {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        int[] arr = temp.solution(new String[]{"DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"});
//        System.out.println(Arrays.toString(arr));
//    }
//}
//
//class Solution {
//    public int[] solution(String[] gems) {
//        int[] answer = {};
//        HashSet<String> set = new HashSet<>();
//        for (int i = 0; i < gems.length; i++) {
//            set.add(gems[i]);
//        }
//
//        HashMap<String, Integer> combi2 = new HashMap<>();
//
//        int beforeLength = gems.length;
//        for (int i = 0; i < gems.length; i++) {
//            combi2.put(gems[i], i);
//
//            if (combi2.size() == set.size()) {
//                int min = Collections.min(combi2.values());
//                int max = Collections.max(combi2.values());
//                int length = max - min;
//                if (beforeLength > length) {
//                    answer = new int[]{min + 1, max + 1};
//                    beforeLength = length;
//                }
//                combi2.remove(gems[min]);
//            }
//        }
//        return answer;
//    }
//}
