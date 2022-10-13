package Problems.P1427;
import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static int[] A, B, C;
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/Problems/P1427/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(br.readLine());
        A  = new int[N];
        B  = new int[N];
        C  = new int[N];

        int j = 0;
        for (int i = N; i > 0; i--) {
            A[j++] = i;
        }

        //bw.write(sb+"\n");
        bw.close();
    }

    static void hanoi(int from, int to, int tmp){

    }
}
