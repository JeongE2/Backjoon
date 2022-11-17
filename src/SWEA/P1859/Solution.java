package SWEA.P1859;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    static boolean[][] board;
    static int N, result;
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/SWEA/P1859/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            N = sc.nextInt();
            board = new boolean[N][N];
            queen(0,0,N);
            System.out.println("#"+test_case+" "+result);
        }
    }

    static void queen(int x, int y,int N){ //N개의 queen을 인덱스[x][y] 부터 가능한 부분에 배치한다.
        //배치 가능 확인
            //가능 배치, N--, 다음 자리로 queen 호출
                //원상 복구 하고 다음 인덱스로
            //불가능 다음 인덱스
        for (int i = x; i < N; i++) {
            for (int j = y; j < N; j++) {
                if(check(i,j)){

                }
            }
        }
    }

    static boolean check(int i, int j){
        //가로
        for (int k = 0; k < N; k++) {
            if(board[i][k] == true) return false;
        }
        //세로
        for (int k = 0; k < N; k++) {
            if(board[k][j] == true) return false;
        }
        //대각선
            //왼쪽 위부터??
        for (int k = -(N-1); k < N; k++) {
            if(k)
        }
            //오른쪽 위부터
        for (int k = 0; k < N; k++) {

        }
        return true;
    }
}
