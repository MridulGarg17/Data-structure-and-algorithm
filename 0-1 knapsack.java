
//0-1 Knapsack problem 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    void Knapsack(int W,int[] wt,int[] val,int n){
    
        int[][] k = new int[n+1][W+1];
       // int w = W;
        for(int i=0;i<=n;i++){
            for(int j=0;j<=W;j++){
                if(i==0 || j==0){
                    k[i][j]=0;
                }else if(wt[i-1]<=j){
                    k[i][j] = Math.max(k[i-1][j],val[i-1]+k[i-1][j-wt[i-1]]);
                }else{
                    k[i][j] = k[i-1][j];
                }
            }
        }
        
     
        System.out.println(k[n][W]);
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int val[] = new int[]{60, 100, 120};
        int wt[] = new int[]{10, 20, 30};
        int  W = 50;
        int l = wt.length;
        Codechef c = new Codechef();
        c.Knapsack(W,wt,val,l);	
	
	    
	}
}
