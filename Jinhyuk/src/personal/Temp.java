package personal;

import java.util.*;

import java.util.*;

import java.util.*;

public class Temp {

    public static void main(String[] args) {
        // 예시 1
        int[][] edges1 = {{2, 3}, {4, 3}, {1, 1}, {2, 1}};
        int[] result1 = Solutions.solution(edges1);
        System.out.println(Arrays.toString(result1));  // [2, 1, 1, 0]

        // 예시 2
        int[][] edges2 = {{4, 11}, {1, 12}, {8, 3}, {12, 7}, {4, 2}, {7, 11}, {4, 8}, {9, 6}, {10, 11}, {6, 10}, {3, 5}, {11, 1}, {5, 3}, {11, 9}, {3, 8}};
        int[] result2 = Solutions.solution(edges2);
        System.out.println(Arrays.toString(result2));  // [4, 0, 1, 2]
    }
}


class Solutions {
    public static int[] solution(int[][] edges) {
        // 정점의 개수를 구합니다. 간선의 양 끝점 중 가장 큰 값이 정점의 개수입니다.
        int n = 0;
        for (int[] edge : edges) {
            n = Math.max(n, Math.max(edge[0], edge[1]));
        }

        // 각 정점의 진입차수와 진출차수를 저장할 배열을 생성합니다. 진입차수는 정점으로 들어오는 간선의 수이고, 진출차수는 정점에서 나가는 간선의 수입니다.
        int[] inDegree = new int[n + 1];
        int[] outDegree = new int[n + 1];

        // 각 정점의 인접리스트를 저장할 배열을 생성합니다. 인접리스트는 정점에서 나가는 간선의 목적지를 저장한 리스트입니다.
        List<Integer>[] adjList = new List[n + 1];
        for (int i = 1; i <= n; i++) {
            adjList[i] = new ArrayList<>();
        }

        // 간선 정보를 이용하여 진입차수, 진출차수, 인접리스트를 갱신합니다.
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            inDegree[to]++;
            outDegree[from]++;
            adjList[from].add(to);
        }

        // 생성한 정점의 번호를 찾습니다. 생성한 정점은 다른 정점과 연결되지 않으므로, 진입차수와 진출차수가 모두 1인 정점입니다.
        int createdVertex = -1;
        for (int i = 1; i <= n; i++) {
            if (inDegree[i] == 1 && outDegree[i] == 1) {
                createdVertex = i;
                break;
            }
        }

        if(createdVertex!=-1){
            // 생성한 정점과 연결된 간선들을 제거합니다. 이때, 연결된 정점들의 진입차수와 진출차수도 갱신합니다.
            for (int next : adjList[createdVertex]) {
                inDegree[next]--;
                outDegree[createdVertex]--;
            }
        }

        // 각 그래프의 수를 저장할 변수를 선언합니다.
        int donutCount = 0;
        int barCount = 0;
        int eightCount = 0;

        // 방문 여부를 저장할 배열을 생성합니다.
        boolean[] visited = new boolean[n + 1];

        // 생성한 정점을 제외한 모든 정점에 대해 깊이 우선 탐색(DFS)을 수행합니다.
        for (int i = 1; i <= n; i++) {
            // 이미 방문했거나, 생성한 정점이면 건너뜁니다.
            if (visited[i] || i == createdVertex) continue;

            // 현재 정점에서 시작하는 경로의 길이를 저장할 변수를 선언합니다.
            int pathLength = 0;

            // 현재 정점에서 DFS를 시작합니다.
            int curr = i;
            while (true) {
                // 현재 정점을 방문했다고 표시합니다.
                visited[curr] = true;

                // 경로의 길이를 증가시킵니다.
                pathLength++;

                // 현재 정점에서 나가는 간선이 없으면, DFS를 종료합니다.
                if (adjList[curr].isEmpty()) break;

                // 현재 정점에서 나가는 간선의 목적지를 다음 정점으로 설정합니다.
                int next = adjList[curr].get(0);

                // 다음 정점이 이미 방문한 정점이면, DFS를 종료합니다.
                if (visited[next]) break;

                // 다음 정점으로 이동합니다.
                curr = next;
            }

            // 경로의 길이에 따라 그래프의 형태를 판별합니다.
            // 경로의 길이가 1이면, 도넛 모양 그래프입니다.
            if (pathLength == 1) {
                donutCount++;
            }
            // 경로의 길이가 2이면, 막대 모양 그래프입니다.
            else if (pathLength == 2) {
                barCount++;
            }
            // 경로의 길이가 4이면, 8자 모양 그래프입니다.
            else if (pathLength == 4) {
                eightCount++;
            }
        }

        // 결과를 담은 배열을 생성하고 반환합니다.
        int[] answer = new int[4];
        answer[0] = createdVertex;
        answer[1] = donutCount;
        answer[2] = barCount;
        answer[3] = eightCount;
        return answer;
    }
}
