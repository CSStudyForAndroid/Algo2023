//package personal;
//
//import java.util.*;
//
//public class CT0816P {
//    public static void main(String[] args) {
//        Solution temp = new Solution();
//        System.out.println(temp.solution(new String[]{"119", "97674223", "1195524421"}));
//    }
//}
//
//class Solution {
//    public boolean solution(String[] phone_book) {
//        boolean answer = true;
//        Arrays.sort(phone_book, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                if (o1.length() == o2.length()) {
//                    return o1.compareTo(o2);
//                } else {
//                    return o1.length() - o2.length();
//                }
//            }
//        });
//        System.out.println(Arrays.toString(phone_book));
//        HashSet<Integer> set1 = new HashSet<Integer>();
//        HashSet<String> set2 = new HashSet<String>();
//
//        for (String i : phone_book) {
//            for (int j : set1) {
//                if (i.length() >= j) {
//                    String test = i.substring(0, j);
//                    if (set2.contains(test)) {
//                        return true;
//                    }
//                }
//            }
//            set1.add(i.length());
//            set2.add(i);
//        }
//
//        return false;
//    }
//}
//
////class Solution {
////    public boolean solution(String[] phone_book) {
////        boolean answer = true;
////        HashMap<String, Integer> temp = new HashMap<>();
////        Arrays.sort(phone_book);
////
////        for(String i : phone_book){
//////            ArrayList<Character> temp2 = new ArrayList<>();
//////            for(char j : i.toCharArray()){
//////                temp2.add(j);
//////                // create object of StringBuilder class
//////                StringBuilder sb = new StringBuilder();
//////
//////                // Appends characters one by one
//////                for (char ch : temp2) {
//////                    sb.append(ch);
//////                }
//////
//////                if(temp.get(sb.toString()) != null){
//////                    return false;
//////                }
//////            }
////            for(int j = 0; j < i.length(); j++){
////                String temp2 = i.substring(0, j+1);
////                if(temp.get(temp2) != null ){
////                    return false;
////                }
////            }
////            temp.put(i,temp.getOrDefault(i,i.length()));
////        }
////
////        return true;
////    }
////}