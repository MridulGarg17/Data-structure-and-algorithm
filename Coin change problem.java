// coin change problem 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    void coin(int []c,int s){
        
        int l = c.length;
        int [][] t = new int[l+1][s+1];
        for(int i=0;i<=l;i++){
            t[i][0]=1;
        }
        for(int i=0;i<=s;i++){
            t[0][i]=0;
        }
        t[0][0]=1;
        for(int i=1;i<=l;i++){
            for(int j=1;j<=s;j++){
                
             if(c[i-1]>j){
                    t[i][j] = t[i-1][j];
                    //System.out.print(t[i][j]+" ");
                }else{
                    t[i][j] = t[i-1][j] + t[i][j-c[i-1]];
                    //System.out.print(t[i][j]+" ");
                }
            }
           // System.out.println();
        }
        
       // System.out.println(t[l][s]);
        for(int i=0;i<=l;i++){
            for(int j=0;j<=s;j++){
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int arr[] = {1, 3, 2};
        //int m = arr.length;
        int n = 4;
        Codechef c = new Codechef();
        c.coin(arr, n);
	}
}
