package member;

import java.util.*;

//public class CT0821M {
//    public static void main(String[] args) {
//        Solution s = new Solution();
//        System.out.println(s.solution(new String[]{"frodo", "fradi", "crodo", "abc123", "frodoc"}, new String[]{"fr*d*", "*rodo", "******", "******"}));
//    }
//}
//
//class Solution {
//    HashSet<List<String>> hashsets;
//
//    public int solution(String[] user_id, String[] banned_id) {
//        int answer = 0;
//
//        LinkedList<String> list = new LinkedList<>();
//
//        for (String i : user_id) {
//            list.add(i);
//        }
//
//        Boolean[] visited = new Boolean[banned_id.length];
//        for (int i = 0; i < visited.length; i++) {
//            visited[i] = false;
//        }
//
//        hashsets = new HashSet<>();
//        findCase(new LinkedList<String>(), banned_id, 0, list, banned_id.length, visited);
//        answer = hashsets.size();
//
//        return answer;
//    }
//
//    public void findCase(LinkedList<String> combi, String[] banned_id, int start, LinkedList<String> list, int limit, Boolean[] visited) {
//        if (combi.size() == limit) {
//            Collections.sort(combi);
//            hashsets.add(combi);
//        } else {
//            for (int i = start; i < banned_id.length; i++) {
//                if (!visited[i]) {
//                    for (int j = 0; j < list.size(); j++) {
//                        if (banned_id[i].length() == list.get(j).length()) {
//                            Boolean isItDiff = false;
//                            String standard = banned_id[i];
//                            String check = list.get(j);
//                            for (int k = 0; k < banned_id[i].length(); k++) {
//                                if (standard.charAt(k) == '*') continue;
//                                if (standard.charAt(k) != check.charAt(k)) {
//                                    isItDiff = true;
//                                    break;
//                                }
//                            }
//                            if (!isItDiff) {
//                                String target = list.get(j);
//
//                                combi.add(target);
//                                list.remove(j);
//                                visited[i] = true;
//
//                                findCase(combi, banned_id, i, list, limit, visited);
//                                combi.remove(target);
//                                list.add(j, target);
//                                visited[i] = false;
//                            }
//                        }
//                    }
//                }
//            }
//        }
//    }
//}