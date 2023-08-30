//package personal;
//
//import java.net.Inet4Address;
//import java.util.*;
//
//public class CT0830P {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println(s.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500}));
//    }
//}
//
//class Solution {
//    public int[] solution(String[] genres, int[] plays) {
//        HashMap<String, Integer> hash = new HashMap<>();
//        HashMap<Integer, Integer> hash2 = new HashMap<>();
//        for (int i = 0; i < genres.length; i++) {
//            int num = hash.getOrDefault(genres[i], 0);
//            num += plays[i];
//            hash.put(genres[i], num);
//            hash2.put(i, plays[i]);
//        }
//
//        LinkedList<String> list = new LinkedList();
//        list.addAll(hash.keySet());
//        Collections.sort(list, (a, b) -> hash.get(b) - hash.get(a));
//
//
//        LinkedList<Integer> list2 = new LinkedList<>();
//        list2.addAll(hash2.keySet());
//        Collections.sort(list2, (a, b) -> hash2.get(b) - hash2.get(a));
//
//        LinkedList<Integer> resultIdx = new LinkedList<>();
//        for (String i : list) {
//            int count = 0;
//            for (int j : list2) {
//                if (genres[j].equals(i) && count < 2) {
//                    resultIdx.add(j);
//                    count++;
//                }
//            }
//        }
//
//        int[] answer = new int[resultIdx.size()];
//        for (int i = 0; i < resultIdx.size(); i++) {
//            answer[i] = resultIdx.get(i);
//        }
//        return answer;
//    }
//}
//
////class Solution {
////    fun solution(genres:Array<String>, plays:IntArray):
////
////    IntArray {
////        var answer = intArrayOf()
////        val hash1 = HashMap < String, HashMap<Int, Int >> ()
////        for (i in genres.indices) {
////            val temp = hash1.getOrDefault(genres[i], HashMap())
////            temp.put(i, plays[i])
////            hash1.put(genres[i], temp)
////        }
////
////        val temp = hash1.toSortedMap(compareByDescending < String > {it -> hash1[it] ?.values ?.sum()})
////
////        for (i in temp) {
////            var temp2 = i.value.toSortedMap(compareByDescending < Int > {i.value[it]}.thenBy {
////                it
////            })
////            var count = 0
////            for (j in temp2) {
////                if (count == 2) break answer +=j.key
////                count++
////            }
////        }
////
////        return answer
////    }
////}