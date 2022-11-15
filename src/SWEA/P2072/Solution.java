package SWEA.P2072;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/SWEA/P2072/input.txt"));

        Scanner sc = new Scanner(System.in);
        int T;
        T=10;//sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int result = 0;
            int buildingCnt = sc.nextInt();
            int[] buildings = new int[buildingCnt];
            for (int i = 0; i < buildingCnt; i++) {
                buildings[i] = sc.nextInt();
            }

            for (int i = 2; i < buildingCnt-2; i++) {
                int front1 = buildings[i-1], front2 = buildings[i-2], back1 = buildings[i+1], back2 = buildings[i+2];;

                for (int j = buildings[i]; j >= 1 ; j--) {
                    if(front1>=j||front2>=j||back1>=j||back2>=j){
                        break;
                    }
                    result++;
                }
            }
            System.out.println("#"+test_case+" "+result);
        }
    }
}
