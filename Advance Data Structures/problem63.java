public class problem63 {

    public static int uPWO(int[][] Og){
        int m=Og.length;
        int n=Og[0].length;
        if(Og[0][0]==1||Og[m-1][n-1]==1){
            return 0;
        }

        int[][]dp=new int[m][n];
        dp[0][0]=1;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(Og[i][j]==1){
                    dp[i][j]=0;
                }else{
                    if(i>0)dp[i][j]+=dp[i-1][j];
                    if(j>0)dp[i][j]+=dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];

    }
    public static void main(String[] args) {
        int[][]Og={
            {0,0,0},
            {0,1,0},
            {0,0,0}
        };
        System.out.println("the number of unique paths: "+uPWO(Og));
        
    }
    
}
