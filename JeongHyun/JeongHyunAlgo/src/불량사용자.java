import java.util.*;

class 불량사용자 {
    static boolean[] visited;
    HashSet<HashSet<String>> hashset = new HashSet<>();

    public int solution(String[] user_id, String[] banned_id) {
        int answer = 0;
        visited = new boolean[user_id.length];

        dfs(user_id, banned_id, new HashSet<>(), 0);

        return hashset.size();
    }

    public void dfs(String[] user_id, String[] banned_id, HashSet<String> set, int depth){
        if(depth == banned_id.length){ // 다 탐색한 경우 추가하기
            hashset.add(set);
            return;
        }

        for(int i = 0; i < user_id.length; i++){
            if(set.contains(user_id[i])) continue; // 이미 찾음

            if(check(user_id[i], banned_id[depth])){
                set.add(user_id[i]);
                dfs(user_id, banned_id, new HashSet<>(set), depth + 1);
                set.remove(user_id[i]);
            }
        }
    }

    public boolean check(String userId, String bannedId){
        if(userId.length() != bannedId.length()) return false; // 길이 체크

        boolean match = true;
        for(int i = 0; i < userId.length(); i++){
            if(bannedId.charAt(i) != '*' && userId.charAt(i) != bannedId.charAt(i)){
                // 해당되지 않으면
                match = false;
                break;
            }
        }


        return match;
    }
}