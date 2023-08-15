public class Member {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

// 야근 지수
//class Solution {
//    public long solution(int n, int[] works) {
//        if (Arrays.stream(works).sum() < n) return 0;
//
//        long answer = 0;
//
//        PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
//        for (int i : works) {
//            q.add(i);
//        }
//
//        for (int i = 0; i < n; i++) {
//            int max = (int) q.poll();
//            max -= 1;
//            if (max > 0) q.add(max);
//        }
//
//        for (int i : q) {
//            answer += Math.pow(i, 2);
//        }
//        return answer;
//    }
//}
