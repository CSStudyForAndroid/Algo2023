package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class CT0229P {

    static int[] answer;
    static LinkedList<Integer>[] entryArray;
    static int[] entryCount;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        answer = new int[size + 1];
        entryArray = new LinkedList[size + 1];
        entryCount = new int[size + 1];


        for(int i = 1; i <= size; i++) {
            entryArray[i] = new LinkedList<>();
        }

        for (int i = 1; i <= size; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            answer[i] = Integer.parseInt(st.nextToken());
            entryCount[i] = 0;
            while (true) {
                int num2 = Integer.parseInt(st.nextToken());
                if (num2 == -1) break;
                entryArray[num2].addLast(i);
                entryCount[i]++;
            }
        }

        LinkedList<Integer> q = new LinkedList<>();
        for (int i = 1; i <= size; i++) {
            if (entryCount[i] == 0) {
                q.addLast(i);
            }
        }

        int[] result = new int[size + 1];
        while (!q.isEmpty()) {
            int temp = q.removeFirst();
            for (int i : entryArray[temp]) {
                // A 노드에 진입하는 노드들이 여러 개라고 할 때, 그 노드들 전부 끝나야 A노드를 실행할 수 있으므로, max를 사용한다.
                result[i] = Math.max(result[i],answer[temp] + result[temp]);
                entryCount[i]--;
                if (entryCount[i] == 0) q.addLast(i);
            }
        }

        for (int i = 1; i < size + 1; i++) {
            System.out.println(result[i] + answer[i]);
        }
    }
}
