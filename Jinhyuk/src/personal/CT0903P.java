package personal;

import java.util.*;

public class CT0903P {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{0, 1}, {2, 2}, {2, 3}}));
    }
}

class Solution {
    public int solution(int[][] jobs) {
        LinkedList<int[]> q = new LinkedList<>();
        for (int[] i : jobs) {
            q.add(i);
        }

        Collections.sort(q, (a, b) -> (a[1] - b[1]));
        Collections.sort(q, (a, b) -> (a[0] - b[0]));

        int totalProcessTime = 0;
        int nowTime = 0;

        while (q.size() > 0) {
            PriorityQueue<int[]> temp = new PriorityQueue<>((a, b) -> (a[1] - b[1]));
            for (int[] i : q) {
                if (i[0] < nowTime) {
                    temp.add(i);
                }
            }
            if (temp.size() > 0) {
                int[] job = temp.poll();
                q.remove(job);
                int startTime = job[0];
                int processTime = job[1];

                int waitingTime = nowTime - startTime;
                totalProcessTime += (waitingTime + processTime);

                nowTime += processTime;
            } else {
                int[] job = q.poll();

                int startTime = job[0];
                int processTime = job[1];

                totalProcessTime += processTime;

                nowTime = (startTime + processTime);
            }
        }

        return totalProcessTime / jobs.length;
    }
}
//class Solution {
//    fun solution(jobs: Array<IntArray>): Int {
//        var answer = 0
//
//        var nowTime = 0
//        var totalTime = 0
//
//        val temp = jobs.toMutableList()
//
//        temp.sortWith(compareBy<IntArray> { it[0] }.thenBy { it[1] })
//
//
//        nowTime = temp.first()[0]
//        while (temp.size > 0) {
//            val nextCheckArray = PriorityQueue<Pair<Int, Int>>() { a, b -> a.first - b.first }
//            for ((i, valu) in temp.withIndex()) {
//                val nextTermCheck = nowTime - valu[0]
//                if (nextTermCheck > 0) { // 현재 작업이 끝나고 다음 작업까지 시간이 남아 있을 경우
//                    nextCheckArray.add(Pair(valu[1], i))
//                }
//            }
//            if (nextCheckArray.size > 0) {
//                val pop = nextCheckArray.poll()
//                totalTime += (nowTime - temp[pop.second][0]) + pop.first
//                nowTime += pop.first
//                temp.removeAt(pop.second)
//            } else {
//                val pop = temp.removeFirst()
//                totalTime += (pop[1])
//                nowTime += pop[1]
//            }
//        }
//
//        answer = totalTime / jobs.size
//        return answer
//    }
//}