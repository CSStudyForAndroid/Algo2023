package personal;

//public class CT0901P {
//}

//
//class Solution {
//    public int[] solution(int[] progresses, int[] speeds) {
//        int[] answer = {};
//        Stack<Integer> stack = new Stack();
//        int count = 0;
//        LinkedList<Integer> result = new LinkedList<>();
//        for (int i = 0; i < progresses.length; i++) {
//            int state = 100 - progresses[i];
//            int necessaryDay = state / speeds[i];
//            if (state % speeds[i] > 0) necessaryDay++;
//            if (stack.size() > 0) {
//                if (stack.peek() < necessaryDay) {
//                    stack.push(necessaryDay);
//                    result.add(count);
//                    count = 1;
//                } else {
//                    count++;
//                }
//            } else {
//                stack.push(necessaryDay);
//                count = 1;
//            }
//        }
//        result.add(count);
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//}
//class Solution {
//    public int[] solution(int[] progresses, int[] speeds) {
//        int[] answer = {};
//        ArrayList<Integer> left = new ArrayList<>();
//        for(int i =0; i <  progresses.length; i++){
//            int temp = 100-progresses[i];
//            int count = temp / speeds[i];
//            if(temp % speeds[i] > 0) count++;
//            left.add(count);
//        }
//
//        System.out.println(left);
//
//        Stack<Integer> stack = new Stack<>();
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for(int i : left){
//            if(stack.size() > 0){
//                if(stack.firstElement() < i){
//                    result.add(stack.size());
//                    stack.clear();
//                    stack.push(i);
//                }else{
//                    stack.push(i);
//                }
//            }else{
//                stack.push(i);
//            }
//        }
//
//        if(stack.size()>0){
//            result.add(stack.size());
//        }
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//}

//class Solution {
//    public Integer[] solution(int[] arr) {
//        LinkedList<Integer> stack = new LinkedList<>();
//        stack.add(arr[0]);
//        for (int i : arr) {
//            if (stack.getLast() != i) {
//                stack.add(i);
//            }
//        }
//
////        int[] answer = new int[stack.size()];
////        for (int i = 0; i < stack.size(); i++) {
////            answer[i] = stack.get(i);
////        }
//
//        return stack.toArray(Integer[]::new);
//    }
//}
//class Solution {
//    public int[] solution(int[] arr) {
//        int[] answer = {};
//
//        Stack<Integer> result = new Stack<>();
//        for(int i =0; i < arr.length; i++){
//            if(result.size() > 0){
//                if(result.lastElement() != arr[i]){
//                    result.push(arr[i]);
//                }
//            }else{
//                result.push(arr[i]);
//            }
//        }
//
//        return result.stream().mapToInt(Integer::intValue).toArray();
//    }
//}