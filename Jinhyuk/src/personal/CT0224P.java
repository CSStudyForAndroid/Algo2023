package personal;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class CT0224P {
    static int people;
    static int party;
    static int[] knowing;
    static int[] parent;
    static ArrayList<Integer>[] partyInfo;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        people = Integer.parseInt(st.nextToken());
        party = Integer.parseInt(st.nextToken());
        parent = new int[people + 1];
        for (int i = 1; i <= people; i++) {
            parent[i] = i;
        }
        st = new StringTokenizer(br.readLine(), " ");
        int knowingSize = Integer.parseInt(st.nextToken());
        knowing = new int[knowingSize];
        for (int i = 0; i < knowingSize; i++) {
            knowing[i] = Integer.parseInt(st.nextToken());
        }
        partyInfo = new ArrayList[party];
        for (int i = 0; i < party; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int partySize = Integer.parseInt(st.nextToken());
            partyInfo[i] = new ArrayList<Integer>();
            for (int j = 0; j < partySize; j++) {
                int num = Integer.parseInt(st.nextToken());
                partyInfo[i].add(num);
            }
        }
        for(int i = 0 ; i < party; i++){
            int firstPeople = partyInfo[i].get(0);
            for(int j = 1; j < partyInfo[i].size();j++){
                union(firstPeople, partyInfo[i].get(j), parent);
            }
        }
        int count = 0;
        for (int i = 0; i < party; i++) {
            int partysParent = parent[partyInfo[i].get(0)];
            boolean check = false;
            for (int j : knowing) {
                if (partysParent == parent[j]) {
                    check = true;
                    break;
                }
            }
            if (!check) {
                count++;
            }
        }
        System.out.println(count);
    }
    static int findParent(int[] parent, int child) {
        if (parent[child] != child) {
            parent[child] = findParent(parent, parent[child]);
        }
        return parent[child];
    }
    static void union(int childA, int childB, int[] parent) {
        childA = findParent(parent, childA);
        childB = findParent(parent, childB);

        if (childA != childB) {
            parent[childB] = childA;
        }
    }
}
