package SWEA.P1859;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {
        System.setIn(new FileInputStream("src/SWEA/P1859/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();

        for (int test_case = 1; test_case <= T; test_case++) {
            int[] result;
            String num = sc.next();
            int change = sc.nextInt();
            result = getMaxMoney(num,change);

            System.out.print("#"+test_case+" ");
            for (int i = 0; i < num.length(); i++) {
                System.out.print(result[i]);
            }
            System.out.println();
        }
    }

    static int[] getMaxMoney(String num, int change){
        int[] nums = new int[num.length()];
        boolean[] check = new boolean[num.length()];
        for (int j = 0; j < num.length(); j++) {
            nums[j] = num.charAt(j)-'0';
        }

        while(change!=0){
            int max=-1, maxIdx=-1;
            for (int i = 0; i < num.length(); i++) {
                if(check[i] == true) continue;
                if(max< nums[i]){
                    max = nums[i];
                    maxIdx = i;
                }
            }
            int changeIdx = 7;
            for (int i = 0; i < num.length(); i++) {
                if(check[i] == false) {
                    changeIdx = i;
                    break;
                }
            }

            if(changeIdx<maxIdx){
                change(maxIdx,changeIdx, nums);
                check[changeIdx] = true;
            } else if(maxIdx == nums.length-1){
                //같은 수 두개 찾아보기
                int[] same = findSame(nums);
                if(same[0]==-1){
                    change(maxIdx, maxIdx-1, nums);
                    check[maxIdx-1] = false;
                }
                else{
                    change(same[0],same[1], nums);
                }

            } else{
                check[maxIdx] = true;
                change++;
            }
            change--;
        }
        return nums;
    }

    static void change(int i,int j, int[] nums){
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    static int[] findSame(int[] nums){
        int[] same = {-1,-1};
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]==nums[j]){
                    same[0] = i;
                    same[1] = j;
                }
            }
        }

        return same;
    }
}
