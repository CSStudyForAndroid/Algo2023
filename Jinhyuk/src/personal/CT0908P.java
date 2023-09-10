package personal;

import java.util.PriorityQueue;

//public class CT0908P {
//    public static void main(String[] args) {
//
//    }
//}


//class Solution {
//    fun solution(brown: Int, yellow: Int): IntArray {
//        var answer = intArrayOf()
//
//        val case = findarticle(brown + yellow)
//
//        for (i in case) {
//            var row = 0
//            var col = 0
//            if (i.first >= i.second) {
//                row = i.first
//                col = i.second
//            } else {
//                row = i.second
//                col = i.first
//            }
//
//            val browncount = 2 * row + 2 * col - 4
//            if (browncount == brown) {
//                answer = intArrayOf(row, col)
//                break
//            }
//        }
//
//        return answer
//    }
//
//    fun findarticle(target: Int): MutableList<Pair<Int, Int>> {
//        val temp = mutableListOf<Pair<Int, Int>>()
//        for (i in 3..Math.sqrt(target.toDouble()).toInt()) {
//            if (target % i == 0) {
//                temp.add(Pair(i, target / i))
//            }
//        }
//        return temp
//    }
//}

/////////////////////////////////////////////////////////////////////////////
//class Solution {
//    public int solution(int[][] sizes) {
//        PriorityQueue<Integer> dx = new PriorityQueue<>((a, b) -> b - a);
//        PriorityQueue<Integer> dy = new PriorityQueue<>((a, b) -> b - a);
//        for (int[] i : sizes) {
//            int dX = Math.max(i[0], i[1]);
//            int dY = Math.min(i[0], i[1]);
//            dx.add(dX);
//            dy.add(dY);
//        }
//        return dx.peek() * dy.peek();
//    }
//}
//class Solution {
//    fun solution(sizes: Array<IntArray>): Int {
//        var answer: Int = 0
//        var widthmax = 0
//        var heightmax = 0
//        for(i in sizes.indices){
//            widthmax = Math.max(widthmax, Math.max(sizes[i][0], sizes[i][1]))
//            heightmax = Math.max(heightmax, Math.min(sizes[i][0], sizes[i][1]))
//        }
//        answer = widthmax * heightmax
//        return answer
//    }
//}
