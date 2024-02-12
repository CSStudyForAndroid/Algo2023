package personal;

import java.io.*;
import java.util.*;

public class CT0213P {


    public static int findParent(int a, int[] parent) {
        if (a != parent[a]) {
            parent[a] = findParent(parent[a], parent);
        }
        return parent[a];
    }

    public static void union(int a, int b, int[] parent) {
        int pa = findParent(a, parent);
        int pb = findParent(b, parent);
        if (pa < pb) parent[pb] = pa;
        else parent[pa] = pb;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int city = Integer.parseInt(br.readLine());
        int route = Integer.parseInt(br.readLine());

        int[] parent = new int[city+1];
        for(int i = 0 ; i < city+1;i++){
            parent[i] = i;
        }

        for (int i = 0; i < city; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0 ; j < city; j++){
                int state = Integer.parseInt(st.nextToken());
                if(state == 1){
                    union(i+1, j+1, parent);
                }
            }
        }

        int[] test = new int[route];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0 ; i < route; i++){
            test[i] = Integer.parseInt(st.nextToken());
        }

        int result = findParent(test[0], parent);
        for(int i : test){
            if(result != findParent(i, parent)) {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
