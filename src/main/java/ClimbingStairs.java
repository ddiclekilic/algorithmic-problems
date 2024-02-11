/*
You are climbing a staircase. It takes n steps to reach the top.
Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 */
public class ClimbingStairs {

    public static void main(String[] args) {
        System.out.println(climbStairs(5));
    }

    public static int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int a = 1;
        int b = 2;
        for (int i = 3; i <= n; i++) {
            int temp = b;
            b = b + a;
            a = temp;
        }
        return b;

        //In the solution below, an extra array is used
        /*
        if(n == 1)
            return 1;
        int[] array = new int[n + 1];
        array[1] = 1;
        array[2] = 2;
        for(int i = 3;i <= n; i++){
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
        */
    }
}