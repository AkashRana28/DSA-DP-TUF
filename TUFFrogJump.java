import java.util.Arrays;

public class TUFFrogJump {
     //recursive solution
  /*  static int solve(int ind,int[] height){
        if(ind==0) return 0;
        
        int right = Integer.MAX_VALUE;
        int left= solve(ind-1, height)+ Math.abs(height[ind]-height[ind-1]);
        if(ind>1)
            right = solve(ind-2, height)+ Math.abs(height[ind]-height[ind-2]);
        
        return Math.min(left, right);
    }
    */ // Memoization approach
    static int solve(int ind,int[] height,int[] dp){
        if(ind==0) return 0;
        if(dp[ind]!=-1) return dp[ind];
        int jumpTwo = Integer.MAX_VALUE;
        int jumpOne= solve(ind-1, height,dp)+ Math.abs(height[ind]-height[ind-1]);
        if(ind>1)
            jumpTwo = solve(ind-2, height,dp)+ Math.abs(height[ind]-height[ind-2]);
        
        return dp[ind]=Math.min(jumpOne, jumpTwo);
    }

    public static void main(String[] args) {
        int height[]={30,10,60 , 10 , 60 , 50};
  int n=height.length;
  int dp[]=new int[n];
  Arrays.fill(dp,-1);
  System.out.println(solve(n-1,height,dp));
    }
          // Tabulation approach
         /*
    public static void main(String[] args) {
        int height[]={30,10,60 , 10 , 60 , 50};
  int n=height.length;
  int dp[]=new int[n];
  Arrays.fill(dp,0);
        for(int i=1;i<n;i++){
            int fs=dp[i-1]+Math.abs(height[i]-height[i-1]);
            int ss = Integer.MAX_VALUE;
            if(i>1) ss = dp[i-2] + Math.abs(height[i]-height[i-2]);

            dp[i] = Math.min(fs,ss);
        }

        System.out.println("Minmum jump= "+dp[n-1]);
    }
    */
    
}
