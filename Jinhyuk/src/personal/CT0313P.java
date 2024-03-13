package personal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CT0313P {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int size = Integer.parseInt(st.nextToken());
        int question = Integer.parseInt(st.nextToken());


        int[][] map = new int[size + 1][size + 1];

        for (int i = 1; i < size + 1; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 1; j < size + 1; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < size + 1; j++) {
                map[i][j] += map[i][j - 1];
            }
        }

        for (int i = 1; i < size + 1; i++) {
            for (int j = 1; j < size + 1; j++) {
                map[j][i] += map[j - 1][i];
            }
        }

        int[] result = new int[question];
        for (int i = 0; i < question; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int startX = Integer.parseInt(st.nextToken());
            int startY = Integer.parseInt(st.nextToken());
            int endX = Integer.parseInt(st.nextToken());
            int endY = Integer.parseInt(st.nextToken());

            result[i] = map[endX][endY] - (map[startX - 1][endY] + map[endX][startY - 1]) + map[startX - 1][startY - 1];
        }
        for (int i = 0; i < question; i++) {
            System.out.println(result[i]);
        }
    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int people = Integer.parseInt(st.nextToken());
//        int friendship = Integer.parseInt(st.nextToken());
//
//        int[][] relation = new int[people + 1][people + 1];
//        for (int i = 1; i < people + 1; i++) {
//            for (int j = 1; j < people + 1; j++) {
//                if (i == j) {
//                    relation[i][j] = 0;
//                    continue;
//                }
//                relation[i][j] = Integer.MAX_VALUE;
//            }
//        }
//
//        for (int i = 0; i < friendship; i++) {
//            st = new StringTokenizer(br.readLine(), " ");
//            int p1 = Integer.parseInt(st.nextToken());
//            int p2 = Integer.parseInt(st.nextToken());
//            relation[p1][p2] = 1;
//            relation[p2][p1] = 1;
//        }
//
//        for (int k = 1; k < people + 1; k++) {
//            for (int i = 1; i < people + 1; i++) {
//                for (int j = 1; j < people + 1; j++) {
//                    if (relation[i][k] == Integer.MAX_VALUE || relation[k][j] == Integer.MAX_VALUE) continue;
//                    relation[i][j] = Math.min(relation[i][j], relation[i][k] + relation[k][j]);
//                }
//            }
//        }
//
//        int sum = Integer.MAX_VALUE;
//        int result = 0;
//        for (int i = 1; i < people; i++) {
//            int temp = 0;
//            for (int j = 1; j < people; j++) {
//                if (relation[i][j] == Integer.MAX_VALUE) continue;
//                temp += relation[i][j];
//            }
//            if (sum > temp) {
//                result = i;
//                sum = temp;
//            }
//        }
//
//        System.out.println(result);
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int node = Integer.parseInt(br.readLine());
//        int[][] edge = new int[node][node];
//
//        for (int i = 0; i < node; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            for (int j = 0; j < node; j++) {
//                edge[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        for (int k = 0; k < node; k++) {
//            for (int i = 0; i < node; i++) {
//                for (int j = 0; j < node; j++) {
//                    if (edge[i][k] == 1 && edge[k][j] == 1) edge[i][j] = 1;
//                }
//            }
//        }
//
//        for(int i = 0 ; i < node; i++){
//            for(int j = 0 ; j < node; j++){
//                System.out.print(edge[i][j]+ " ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int city = Integer.parseInt(br.readLine());
//        int road = Integer.parseInt(br.readLine());
//
//        int[][] shortestWay = new int[city + 1][city + 1];
//        for (int i = 1; i < city + 1; i++) {
//            for (int j = 1; j < city + 1; j++) {
//                if (i == j) {
//                    shortestWay[i][j] = 0;
//                    continue;
//                }
//                shortestWay[i][j] = Integer.MAX_VALUE;
//            }
//        }
//
//        for (int i = 0; i < road; i++) {
//            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//            int startNode = Integer.parseInt(st.nextToken());
//            int endNode = Integer.parseInt(st.nextToken());
//            int price = Integer.parseInt(st.nextToken());
//            shortestWay[startNode][endNode] = Math.min(price, shortestWay[startNode][endNode]);
//        }
//
//        for (int k = 1; k <= city; k++) {
//            for (int i = 1; i <= city; i++) {
//                for (int j = 1; j <= city; j++) {
//                    if (shortestWay[i][k] != Integer.MAX_VALUE && shortestWay[k][j] != Integer.MAX_VALUE)
//                        shortestWay[i][j] = Math.min(shortestWay[i][j], shortestWay[i][k] + shortestWay[k][j]);
//                }
//            }
//        }
//
//        for (int i = 1; i < city + 1; i++) {
//            for (int j = 1; j < city + 1; j++) {
//                System.out.print(shortestWay[i][j]+" ");
//            }
//            System.out.println("");
//        }
//    }
}
