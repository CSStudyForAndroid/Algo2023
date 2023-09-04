package personal;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;

//public class CT0904P {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println(s.solution(new int[]{100, 100, 100}));
//    }
//}

//class Solution {
//    public int solution(int[] citations) {
//        int answer = 0;
//
//        Arrays.sort(citations);
//        a:
//        for (int i = citations.length; i > 0; i--) {
//            int count = 0;
//            for (int j = citations.length - 1; j > -1; j--) {
//                if (citations[j] <= i) {
//                    if (count >= i) {
//                        answer = count;
//                        break a;
//                    }
//                    break;
//                } else {
//                    count++;
//                }
//            }
//            if (count >= i) {
//                answer = count;
//                break;
//            }
//        }
//        return answer;
//    }
//}

///////////////////////////////////////////////////////////////////////////
//class Solution {
//    public int[] solution(int[] array, int[][] commands) {
//        int[] answer = {};
//        LinkedList<Integer> result = new LinkedList<>();
//
//        for (int[] i : commands) {
//            LinkedList<Integer> list = new LinkedList<>();
//            for (int j = i[0] - 1; j < i[1]; j++) {
//                list.add(array[j]);
//            }
//            Collections.sort(list);
//
//            result.add(list.get(i[2] - 1));
//        }
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//}

//////////////////////////////////////////////////////////////////////////////////
//class Solution {
//    public int[] solution(String[] operations) {
//        int[] answer = {};
//
//        LinkedList<Integer> list = new LinkedList<>();
//
//        for (String i : operations) {
//            if (i.charAt(0) == 'I') {
//                int num = Integer.parseInt(i.substring(2));
//                list.add(num);
//                Collections.sort(list);
//            } else {
//                if (i.length() == 3) { // 추가
//                    if (list.size() > 0) list.removeLast();
//                } else { // 삭제
//                    if (list.size() > 0) list.removeFirst();
//                }
//            }
//        }
//
//        if (list.size() > 0) {
//            answer = new int[]{list.getLast(), list.getFirst()};
//        } else {
//            answer = new int[]{0, 0};
//        }
//
//        return answer;
//    }
//}

//class Solution {
//    fun solution(operations: Array<String>): IntArray {
//        var answer = intArrayOf()
//        var resultMin = PriorityQueue<Int>() { a, b -> a - b }
//        var resultMax = PriorityQueue<Int>() { a, b -> b - a }
//        for (i in operations) {
//            if (i[0] == 'I') {
//                val num = i.substring(2, i.length).toInt()
//                resultMin.add(num)
//                resultMax.add(num)
//            } else {
//                val num = i.substring(2, i.length).toInt()
//                if (num == 1) {
//                    resultMin.remove(resultMax.poll())
//                } else {
//                    resultMax.remove(resultMin.poll())
//                }
//            }
//        }
//        val max = resultMax.peek()
//        val min = resultMin.peek()
//        if(max == null && min == null) answer = intArrayOf(0,0)
//        else answer = intArrayOf(max, min)
//        return answer
//    }
//}
////////////////////////////////////////////////////////////////////////////////
//class Solution {
//    public int solution(int[] scoville, int K) {
//        int answer = 0;
//
//        PriorityQueue<Integer> q = new PriorityQueue<>();
//
//        for (int i : scoville) {
//            q.add(i);
//        }
//
//        int count = 0;
//        while (!q.isEmpty()) {
//            int num = q.poll();
//            if (num >= K) {
//                answer = count;
//                break;
//            }
//            count++;
//            if (!q.isEmpty()) {
//                int second = q.poll();
//                int newNum = num + second * 2;
//                q.add(newNum);
//            } else {
//                answer = -1;
//            }
//        }
//
//        return answer;
//    }
//}
