package Problems.P1427;
import java.io.*;
import java.util.*;

public class Main {

    static int N;
    static List<Integer> A = new ArrayList<>();
    static List<Integer> B = new ArrayList<>();
    static List<Integer> C = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/Problems/P1427/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) { //List의 0가 젤 위
            A.add(i);
        }

        hanoi(A, C, B);
        //bw.write(sb+"\n");
        bw.close();
    }

    static void hanoi(List<Integer> from, List<Integer> to, List<Integer> tmp){
        if(from.size()==1){
            //옮기기
        } else{

        }
    }


}
