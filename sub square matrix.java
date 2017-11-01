
//size of sub square matrix with all 1 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef b = new Codechef();
	    int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	    
	    int M[][] =  {{0, 1, 1, 0, 1}, 
                      {1, 1, 0, 1, 0}, 
                      {0, 1, 1, 1, 0},
                      {1, 1, 1, 1, 0},
                      {1, 1, 1, 1, 1},
                      {0, 0, 0, 0, 0}};
                      
        int max=0;
        int x=0;
        int y=0;
        
        int r = M.length;
        int c = M[0].length;
        int [][]s  = new int [r][c];
        
        for(int i=0;i<r;i++){
            s[i][0]=M[i][0];
        }
        for(int i=0;i<c;i++){
            s[0][i] = M[0][i];
        }
        
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(M[i][j]==1){
                    s[i][j] = Math.min(s[i-1][j-1],Math.min(s[i-1][j],s[i][j-1]))+1;
                   // System.out.println(s[i][j]);
                    if(max<s[i][j]){
                        max = s[i][j];
                        x=i;
                        y=j;
                    }
                }else{
                    s[i][j]=0;
                }
            }
        }
        
        
        
	    
	    System.out.println(max);
	    
	}
}
