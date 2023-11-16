//package personal;
//
//import java.io.*;
//import java.util.*;
//
//public class CT1116P {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        String equation = br.readLine();
//
//        int sum = 0;
//        int startIdx = 0;
//        Boolean firstNum = true;
//        int firstCursor = 0;
//        int endIdx = 0;
//        LinkedList<Integer> numList = new LinkedList<>();
//        for (int i = 0; i < equation.length(); i++) {
//            if (equation.charAt(i) == '-' || equation.charAt(i) == '+') {
//                numList.add(Integer.parseInt(equation.substring(startIdx, i)));
//                startIdx = i + 1;
//                if (equation.charAt(i) == '-') {
//                    int part = 0;
//                    while (numList.size() > 0) {
//                        part += numList.removeFirst();
//                    }
//                    if(firstCursor > 0){
//                        sum -= part;
//                    }else{
//                        firstCursor++;
//                        sum += part;
//                    }
//
//                }
//            }
//            if (i == equation.length() - 1) {
//                numList.add(Integer.parseInt(equation.substring(startIdx, i + 1)));
//                int part = 0;
//                while (numList.size() > 0) {
//                    part += numList.removeFirst();
//                }
//                if(firstCursor > 0){
//                    sum -= part;
//                }else{
//                    firstCursor++;
//                    sum += part;
//                }
//            }
//        }
//        bw.write(sum + "");
//        bw.flush();
//        bw.close();
//    }
//
////    public static Boolean findNum(int startPos, int endPos, int[] array, int target) {
////        if (startPos > endPos) return false;
////        int mid = (startPos + endPos) / 2;
////
////        if (array[mid] == target) return true;
////        else if (array[mid] < target) return findNum(mid + 1, endPos, array, target);
////        else return findNum(startPos, mid - 1, array, target);
////    }
////
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
////        int dataSize = Integer.parseInt(br.readLine());
////        int[] array1 = new int[dataSize];
////        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
////        for (int i = 0; i < dataSize; i++) {
////            array1[i] = Integer.parseInt(st.nextToken());
////        }
////        Arrays.sort(array1);
////
////        int findDataSize = Integer.parseInt(br.readLine());
////        int[] array2 = new int[findDataSize];
////        st = new StringTokenizer(br.readLine(), " ");
////        for (int i = 0; i < findDataSize; i++) {
////            if (findNum(0, dataSize - 1, array1, Integer.parseInt(st.nextToken()))) array2[i] = 1;
////            else array2[i] = 0;
////        }
////
////        for (int i = 0; i < findDataSize; i++) {
////            bw.write(array2[i] + "");
////            bw.newLine();
////        }
////        bw.flush();
////        bw.close();
////    }
//
////    static LinkedList<Integer> dfsResult;
////    static LinkedList<Integer> bfsResult;
////
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
////        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
////        int nodeSize = Integer.parseInt(st.nextToken());
////        int edgeSize = Integer.parseInt(st.nextToken());
////        int startPoint = Integer.parseInt(st.nextToken());
////
////
////        LinkedList<Integer>[] list = new LinkedList[nodeSize + 1];
////        for (int i = 0; i <= nodeSize; i++) {
////            list[i] = new LinkedList<>();
////        }
////
////        for (int i = 0; i < nodeSize; i++) {
////            st = new StringTokenizer(br.readLine(), " ");
////            int a = Integer.parseInt(st.nextToken());
////            int b = Integer.parseInt(st.nextToken());
////            list[a].add(b);
////            list[b].add(a);
////        }
////
////        for(int i = 0 ; i < nodeSize; i++){
////            Collections.sort(list[i]);
////        }
////        Boolean[] visited = new Boolean[nodeSize + 1];
////        for (int i = 0; i <= nodeSize; i++) {
////            visited[i] = false;
////        }
////
////        dfsResult = new LinkedList<>();
////        dfs(startPoint, visited, list);
////
////        visited = new Boolean[nodeSize + 1];
////        for (int i = 0; i <= nodeSize; i++) {
////            visited[i] = false;
////        }
////        bfsResult = new LinkedList<>();
////        ArrayDeque<Integer> q = new ArrayDeque<>();
////        q.addLast(startPoint);
////        visited[startPoint] = true;
////        while (!q.isEmpty()) {
////            int temp = q.removeFirst();
////            bfsResult.add(temp);
////            for (int i : list[temp]) {
////                if(!visited[i]){
////                    visited[i] = true;
////                    q.addLast(i);
////                }
////            }
////        }
////        for(int i = 0 ; i < dfsResult.size(); i++){
////            bw.write(dfsResult.get(i)+" ");
////        }
////        bw.newLine();
////        for(int i = 0 ; i < bfsResult.size(); i++){
////            bw.write(bfsResult.get(i)+" ");
////        }
////        bw.flush();
////        bw.close();
////    }
////
////    public static void dfs(int startPoint, Boolean[] visited, LinkedList<Integer>[] list) {
////        visited[startPoint] = true;
////        dfsResult.add(startPoint);
////        for (int i : list[startPoint]) {
////            if (!visited[i]) {
////                visited[i] = true;
////                dfs(i, visited, list);
////            }
////        }
////    }
//
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
////        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
////        int nodeSize = Integer.parseInt(st.nextToken());
////        int edgeSize = Integer.parseInt(st.nextToken());
////        LinkedList<Integer>[] list = new LinkedList[nodeSize + 1];
////        for (int i = 0; i < nodeSize + 1; i++) {
////            list[i] = new LinkedList<>();
////        }
////        for (int i = 0; i < edgeSize; i++) {
////            st = new StringTokenizer(br.readLine(), " ");
////            int a = Integer.parseInt(st.nextToken());
////            int b = Integer.parseInt(st.nextToken());
////            list[a].add(b);
////            list[b].add(a);
////        }
////        Boolean[] visited = new Boolean[nodeSize + 1];
////        for (int i = 0; i < nodeSize + 1; i++) {
////            visited[i] = false;
////        }
////
////        int count = 0;
////        for (int i = 1; i < nodeSize + 1; i++) {
////            if (!visited[i]) {
////                count++;
////                ArrayDeque<Integer> q = new ArrayDeque<>();
////                q.addLast(i);
////                visited[i] = true;
////                while (!q.isEmpty()) {
////                    int temp = q.removeFirst();
////                    for (int k : list[temp]) {
////                        if (!visited[k]) {
////                            visited[k] = true;
////                            q.addLast(k);
////                        }
////                    }
////                }
////            }
////        }
////
////        bw.write(count + "");
////        bw.flush();
////        bw.close();
////    }
//
////    public static void main(String[] args) throws IOException {
////        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
////        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
////        int size = Integer.parseInt(br.readLine());
////        int[] list = new int[size];
////        for(int i = 0 ; i < size; i++){
////            list[i] = Integer.parseInt(br.readLine());
////        }
////
////        for(int i = 0 ; i < size-1; i++){
////            for(int j = 0 ; j < size - 1 - i; j++){
////                if(list[j] > list[j+1]){
////                    int temp = list[j];
////                    list[j] = list[j+1];
////                    list[j+1] = temp;
////                }
////            }
////        }
////
////        for(int i = 0 ; i < size; i++){
////            bw.write(list[i]+"");
////            bw.newLine();
////        }
////        bw.flush();
////        bw.close();
////    }
//}
//
