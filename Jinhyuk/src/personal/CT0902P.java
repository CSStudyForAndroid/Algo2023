package personal;

import java.util.*;

//import java.util.LinkedList;
//import java.util.Stack;
//
//public class CT0902P {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        System.out.println(temp.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
//    }
//}

//class Solution {
//    public int[] solution(int[] prices) {
//        int[] answer = {};
//        LinkedList<Integer> result = new LinkedList<>();
//        for (int i = 0; i < prices.length; i++) {
//            int count = 0;
//            for (int j = i + 1; j < prices.length; j++) {
//                count++;
//                if (prices[i] > prices[j]) {
//                    break;
//                }
//            }
//            result.add(count);
//        }
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//}
//class Solution {
//    public int[] solution(int[] prices) {
//        int[] answer = {};
//        ArrayList<Integer> temp = new ArrayList<>();
//        for(int i = 0  ; i < prices.length - 1; i++){
//            int count = 0;
//            for(int j = i+1; j < prices.length; j++){
//                count++;
//                if(prices[i] > prices[j]){
//                    break;
//                }
//            }
//            temp.add(count);
//        }
//        temp.add(0);
//
//        return temp.stream().mapToInt(Integer::intValue).toArray();
//    }
//}
///////////////////////////////////////////////////////////////
//class Solution {
//    public int solution(int bridge_length, int weight, int[] truck_weights) {
//        int answer = 0;
//
//        LinkedList<Integer> truckOnBridgeWeight = new LinkedList<>();
//        LinkedList<Integer> truckOnBridgeEndTime = new LinkedList<>();
//
//        int nowWeight = 0;
//
//        // 트럭들을 순서대로 모두 조회
//        for (int i : truck_weights) {
//            // 다리 위 트럭들 중 가장 앞에 있는 트럭의 종료 시간이 현재 시간과 같을 때
//            if (truckOnBridgeEndTime.size() > 0 && answer == truckOnBridgeEndTime.getFirst()) {
//                truckOnBridgeEndTime.removeFirst(); // 종료 시간 큐에서 그 트럭 종료 시간을 제거
//                nowWeight -= truckOnBridgeWeight.removeFirst(); // 다리 위 트럭 무게 큐에서 그 트럭 무게 제거
//            }
//
//            nowWeight += i; // 다리 위에 트럭을 보냄
//            truckOnBridgeWeight.addLast(i); // 다리 위에 트럭 무게 정보에 추가
//
//            while (nowWeight > weight) { // 트럭을 보냈을 때 다리 위의 무게가 제한을 넘었을 때
//                answer = truckOnBridgeEndTime.removeFirst() - 1; // 현재 시간을 가장 앞에 있는 트럭의 종료 시간으로 수정
//                nowWeight -= truckOnBridgeWeight.removeFirst(); // 가장 앞에 있는 트럭 제거
//            }
//
//            answer++; // 한 트럭 조회할 때마다 1초씩 증가
//            truckOnBridgeEndTime.addLast(answer + bridge_length); // 다리 위에 올라갈 트럭의 종료 시간 정보 저장
//        }
//
//        answer = truckOnBridgeEndTime.getLast(); // 가장 마지막 트럭의 종료 시간 정보
//        return answer;
//    }
//}
//class Solution {
//    public static int solution(int bridge_length, int weight, int[] truck_weights) {
//        int answer = 0;
//        ArrayDeque<Integer> qq = new ArrayDeque<>();
//        ArrayList<int[]> q = new ArrayList<>();
//
//        for (int i : truck_weights) {
//            qq.add(i);
//        }
//
//        int count = 0;
//        ArrayList<Integer> truck = new ArrayList<>();
//
//        while (truck.size() != truck_weights.length) {
////            System.out.println(count + " "+truck +" "+ q.size()+" "+qq);
//            int sum = 0;
//
//            int idx = -1;
//            for (int i = 0; i < q.size(); i++) {
//                q.get(i)[1]--;
//                if (q.get(i)[1] > 0) {
//                    sum += q.get(i)[0];
//                } else {
//                    truck.add(q.get(i)[0]);
//                    idx = i;
//                }
//            }
//            if (idx > -1) q.remove(idx);
//            if(qq.size() > 0){
//                int next = qq.peek();
//                if (sum + next <= weight && q.size() + 1 <= bridge_length) {
//                    q.add(new int[]{qq.poll(), bridge_length});
//                }
//            }
//            count++;
//        }
//
//
//        return count;
//    }
//}

/////////////////////////////////////////////////////////////
//class Solution {
//    public int solution(int[] priorities, int location) {
//        int answer = 0;
//        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
//        for (int i : priorities) {
//            pq.add(i);
//        }
//
//        int i = 0;
//        while (!pq.isEmpty()) {
//            if (i >= priorities.length) i %= priorities.length;
//
//            int top = pq.peek();
//            if (priorities[i] == top) {
//                answer++;
//                if (i == location) break;
//                pq.poll();
//            }
//            i++;
//        }
//
//        return answer;
//    }
//}
//class Solution {
//    public int solution(int[] priorities, int location) {
//        int answer = 0;
//        ArrayDeque<int[]> q = new ArrayDeque<>();
//
//        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
//
//        for (int i = 0; i < priorities.length; i++) {
//            q.addLast(new int[]{i, priorities[i]});
//            pq.add(priorities[i]);
//        }
//
//        int target = pq.peek();
//
//        while (pq.size() > 0) {
//            if (q.getFirst()[1] == target) {
//                pq.poll();
//                if(pq.size()>0) {
//                    target = pq.peek();
//                }
//                answer++;
//                if (q.getFirst()[0] == location) break;
//                q.poll();
//            } else {
//                int[] back = q.poll();
//                q.add(back);
//            }
//        }
//
//        return answer;
//    }
//}

//////////////////////////////////////////////////////////////
//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//        Stack<Character> stack = new Stack<>();
//        for (char i : s.toCharArray()) {
//            if (i == '(') {
//                stack.add(i);
//            } else {
//                if (stack.size() > 0) {
//                    stack.pop();
//                } else {
//                    answer = false;
//                    break;
//                }
//            }
//        }
//
//        if (stack.size() > 0) answer = false;
//
//        return answer;
//    }
//}
//class Solution {
//    boolean solution(String s) {
//        boolean answer = true;
//
//        Stack<Character> stack = new Stack<>();
//        for(char i : s.toCharArray()){
//            if(i=='('){
//                stack.push(i);
//            }else{
//                if(stack.size() == 0){
//                    answer = false;
//                    break;
//                }
//                stack.pop();
//            }
//        }
//
//        if(stack.size()>0) answer = false;
//
//        return answer;
//    }
//}