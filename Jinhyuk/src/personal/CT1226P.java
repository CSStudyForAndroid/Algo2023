package personal;

import java.io.*;

public class CT1226P {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size = Integer.parseInt(br.readLine());
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = Integer.parseInt(br.readLine());
        }
        sort(array, 0, size - 1);

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int i = 0; i < size; i++) {
            bw.write(array[i] + "\n");
        }
        bw.flush();
        bw.close();
    }

    // 병합 메소드. 배열 arr[l..m]과 arr[m+1..r]를 병합한다.
    public static void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1; // 첫 번째 부분 배열의 길이를 계산한다.
        int n2 = r - m; // 두 번째 부분 배열의 길이를 계산한다.

        // 두 부분 배열을 임시로 저장할 배열을 생성한다.
        int L[] = new int[n1];
        int R[] = new int[n2];

        // 데이터를 임시 배열에 복사한다.
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // 병합 과정을 시작한다.
        // 투 포인터 알고리즘을 사용하여 두 배열을 병합한다.
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // L[]과 R[]의 나머지 요소를 arr[]에 복사한다.
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // 본 정렬 메소드. 배열 arr[l..r]을 정렬한다.
    public static void sort(int arr[], int l, int r) {
        if (l < r) {
            // 중간점을 찾는다.
            int m = (l + r) / 2;

            // 첫 번째와 두 번째 반쪽을 정렬한다.
            sort(arr, l, m);
            sort(arr, m + 1, r);

            // 두 반쪽을 병합한다.
            merge(arr, l, m, r);
        }
    }

//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int dataSize = Integer.parseInt(st.nextToken());
//        int kNum = Integer.parseInt(st.nextToken());
//        st = new StringTokenizer(br.readLine(), " ");
//        int[] array = new int[dataSize];
//        for (int i = 0; i < dataSize; i++) {
//            array[i] = Integer.parseInt(st.nextToken());
//        }
//        quickSort(array, 0, dataSize - 1, kNum - 1);
//
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        bw.write(array[kNum-1]+"");
//        bw.flush();
//        bw.close();
//    }
//
//    public static void quickSort(int[] array, int S, int E, int K) {
//        if (S < E) {
//            int pivot = partition(array, S, E);
//            if(pivot == K) return;
//            else if(K < pivot) quickSort(array, S, pivot-1,K);
//            else quickSort(array, pivot+1, E, K);
//        }
//    }
//
//    public static int partition(int[] A, int S, int E) {
//        if (S + 1 == E) {
//            if (A[S] > A[E]) swap(A, S, E);
//            return E;
//        }
//        int M = (S+E)/2;
//        swap(A,S,M);
//        int pivot = A[S];
//        int i = S+1;
//        int j = E;
//        while(i <= j){
//            while( j >= S+1 && pivot < A[j]){
//                j--;
//            }
//            while(i <= E && pivot > A[i]){
//                i++;
//            }
//            if(i<=j){
//                swap(A,i++,j--);
//            }
//        }
//        A[S] = A[j];
//        A[j] = pivot;
//        return j;
//    }
//
//    public static void swap(int[] A, int i, int j) {
//        int temp = A[i];
//        A[i] = A[j];
//        A[j] = temp;
//    }
}
