package personal;


import java.io.*;
import java.util.*;

public class CT0212P {

    public static int find(int a, int[] parent) {
        if (a != parent[a]) {
            parent[a] = find(parent[a], parent);
        }
        return parent[a];
    }

    public static void union(int a, int b, int[] parent) {
        int pa = find(a, parent);
        int pb = find(b, parent);
        if (pa < pb) {
            parent[pb] = pa;
        } else {
            parent[pa] = pb;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int size = Integer.parseInt(st.nextToken());
        int quest = Integer.parseInt(st.nextToken());
        int[] nums = new int[size + 1];
        for (int i = 0; i < size + 1; i++) {
            nums[i] = i;
        }
        for (int i = 0; i < quest; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int q = Integer.parseInt(st.nextToken());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (q == 0) {
                union(a, b, nums);
            } else {
                if (find(a, nums) == find(b, nums)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
