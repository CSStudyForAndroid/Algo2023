//package personal;
//
//import java.util.Arrays;
//import java.util.HashSet;
//
//public class CT0910P {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println(s.solution(4, new int[][]{{1, 2}, {2, 3}, {3, 4}}));
//    }
//}
//
//class Solution {
//
//    public int findParent(int x, int[] parentInfo) {
//        if (x != parentInfo[x]) {
//            parentInfo[x] = findParent(parentInfo[x], parentInfo);
//        }
//        return parentInfo[x];
//    }
//
//    public void unionNode(int a, int b, int[] parentInfo) {
//        int aParent = findParent(a, parentInfo);
//        int bParent = findParent(b, parentInfo);
//        if (aParent < bParent) {
//            parentInfo[bParent] = aParent;
//        } else {
//            parentInfo[aParent] = bParent;
//        }
//    }
//
//    int[] parentInfo;
//
//    public int solution(int n, int[][] wires) {
//        parentInfo = new int[n + 1];
//        int minAbs = n;
//        for (int i = 0; i < wires.length; i++) {
//            for (int k = 0; k < parentInfo.length; k++) {
//                parentInfo[k] = k;
//            }
//            for (int j = 0; j < wires.length; j++) {
//                if (i == j) continue;
//                unionNode(wires[j][0], wires[j][1], parentInfo);
//            }
//            for (int j = 0; j < parentInfo.length; j++) {
//                findParent(j, parentInfo);
//            }
//            minAbs = Math.min(minAbs, calculateAbs(n, parentInfo));
//        }
//
//        return minAbs;
//    }
//
//    public int calculateAbs(int n, int[] parentInfo) {
//        int count = 1;
//        for (int i = 2; i < parentInfo.length; i++) {
//            if (parentInfo[1] == parentInfo[i]) count++;
//        }
//
//        return Math.abs((n - count) - count);
//    }
//}
////class Solution {
////    fun findParent(x: Int, parent: MutableList<Int>): Int {
////        if (x != parent[x]) {
////            parent[x] = findParent(parent[x], parent)
////        }
////        return parent[x]
////    }
////
////    fun unionParent(a: Int, b: Int, parent: MutableList<Int>) {
////        var aParent = findParent(a, parent)
////        var bParent = findParent(b, parent)
////        if (aParent < bParent) {
////            parent[bParent] = aParent
////        } else {
////            parent[aParent] = bParent
////        }
////    }
////
////    fun solution(n: Int, wires: Array<IntArray>): Int {
////        var answer: Int = wires.size
////        var result = mutableListOf<Int>()
////        for (i in 0 until wires.size) {
////            val parent = MutableList(n + 1) { it }
////
////            for (j in 0 until wires.size) {
////                if (j == i) {
////                    continue
////                }
////                unionParent(wires[j][0], wires[j][1], parent)
////            }
////
////            for(j in 1 .. n){
////                findParent(j, parent)
////            }
////
////            var parentnode = findParent(1, parent)
////            var aNodeCount = parent.count { it == parentnode }
////            var bNodeCount = n - aNodeCount
////            var differ = Math.abs(aNodeCount - bNodeCount)
////            result.add(differ)
////            println(parent)
////        }
////        answer = result.minOf{it}
////        return answer
////    }
////}
//
//////////////////////////////////////////////////////////////////
////class Solution {
////
////    HashSet combiSet = new HashSet();
////
////    public int solution(String numbers) {
////        int answer = 0;
////        Boolean[] visited = new Boolean[numbers.length()];
////        for (int i = 0; i < numbers.length(); i++) {
////            visited[i] = false;
////        }
////        findCombination(numbers, 0, visited, "");
////        answer = combiSet.size();
////        System.out.println(combiSet);
////        return answer;
////    }
////
////    public void findCombination(String numbers, int count, Boolean[] visited, String combi) {
////        if (count == numbers.length()) {
////            if (combi.length() > 0) {
////                int numCombi = Integer.parseInt(combi);
////                if (numCombi > 0 && isItPrime(numCombi)) {
////                    combiSet.add(numCombi);
////                }
////            }
////        } else {
////            for (int i = 0; i < numbers.length(); i++) {
////                if (!visited[i]) {
////                    visited[i] = true;
////                    findCombination(numbers, count + 1, visited, combi + numbers.charAt(i));
////                    findCombination(numbers, count + 1, visited, combi);
////                    visited[i] = false;
////                }
////            }
////        }
////    }
////
////    public Boolean isItPrime(int num) {
////        if (num < 2) return false;
////        for (int i = 2; i * i <= num; i++) { // 루트(num) 까지만 확인한다.
////            if (num % i == 0) return false;
////        }
////        return true;
////    }
////}
//
///////////////////////////////////////////////////////////////////
////class Solution {
////    public int[] solution(int brown, int yellow) {
////        int[] answer = {};
////        int total = brown + yellow;
////        int limit = (total / 3);
////        for(int i = 3; i <= limit; i++){
////            if(total % i == 0){
////                int row = total / i;
////                if((row-2)*(i-2) == yellow){
////                    answer = new int[]{row, i};
////                    break;
////                }
////            }
////        }
////
////        return answer;
////    }
////}
//
//
////class Solution {
////    fun solution(brown: Int, yellow: Int): IntArray {
////        var answer = intArrayOf()
////
////        val case = findarticle(brown + yellow)
////
////        for (i in case) {
////            var row = 0
////            var col = 0
////            if (i.first >= i.second) {
////                row = i.first
////                col = i.second
////            } else {
////                row = i.second
////                col = i.first
////            }
////
////            val browncount = 2 * row + 2 * col - 4
////            if (browncount == brown) {
////                answer = intArrayOf(row, col)
////                break
////            }
////        }
////
////        return answer
////    }
////
////    fun findarticle(target: Int): MutableList<Pair<Int, Int>> {
////        val temp = mutableListOf<Pair<Int, Int>>()
////        for (i in 3..Math.sqrt(target.toDouble()).toInt()) {
////            if (target % i == 0) {
////                temp.add(Pair(i, target / i))
////            }
////        }
////        return temp
////    }
////}