//Length of Longest comman subsequence

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef

{
    void lcs(char []x,char []y){
        int m=x.length;
        int n=y.length;
        int [][]l = new int[m+1][n+1];
        
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0){
                    l[i][j] = 0;
                }
                else if(x[i-1]==y[j-1]){
                    l[i][j] = l[i-1][j-1] + 1;
                }else{
                    l[i][j] = Math.max(l[i-1][j],l[i][j-1]);
                }
            }
        }
        
        System.out.println(l[m][n]);
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef c = new Codechef();
		String s1 = "geeksforgeeks";
		char x[] = s1.toCharArray();
		String s2 = "acgkmeeko";
		char y[]=s2.toCharArray();
		c.lcs(x,y);
		
	}
}
