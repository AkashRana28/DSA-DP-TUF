

/*   Problem statement

You have been given a number of stairs. Initially, you are at the 0th stair, and you need to reach the Nth stair.


Each time, you can climb either one step or two steps.


You are supposed to return the number of distinct ways you can climb from the 0th step to the Nth step.
Example :

N=3

We can climb one step at a time i.e. {(0, 1) ,(1, 2),(2,3)} or we can climb the first two-step and then one step i.e. {(0,2),(1, 3)} or we can climb first one step and then two step i.e. {(0,1), (1,3)}.

Detailed explanation ( Input/output format, Notes, Images )
Constraints :

1 <= 'T' <= 10
0 <= 'N' <= 10^5

Where 'T' is the number of test cases, and 'N' is the number of stairs. */

public class TUFClimb {
   //  All possible ways or count all ways use rcursion 
   // try to represent in problem in term of index , even is its not array
   // do all possible stuff on the index accordin to the problem statement 
   // if question says count alll ways , sum up all stuffs
   //   if queation find minimum , take minum of all stuffs
   // if question says find max , take max of all stuff 
/*
   public static void main(String...  gs) {
       int n=3;
       int dp[] = new int[n+1];
       Arrays.fill(dp, -1);
       dp[0] = 1;
       dp[1] = 1;

       for(int i=2;i<=n;i++){
        dp[i] = dp[i-1]+ dp[i-2];
       }
       System.out.println("total Number of distinct ways "+ dp[n]);

   } */
   
    public static void main(String... s){

        int n=3;

        int prev2 =1;
        int prev =1;

        for(int i=2; i<=n ;i++){
            int curr_i = prev2+prev ;
            prev2 = prev;
            prev= curr_i;
        }

        System.out.println("total Number of distinct ways "+ prev);

    }
}