//all path in a matrix

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    void allpath(int[][] mat,int i,int j,int m,int n,int[] path,int p){
        
        if(i==m-1 && j==n-1){
            path[p]=mat[i][j];
            for(int a=0;a<path.length;a++){
                System.out.print(path[a]+" ");
            }
            System.out.println();
            return;
        }
        
        path[p] = mat[i][j];
        if(i+1<m)
        allpath(mat,i+1,j,m,n,path,p+1);
        if(j+1<n)
        allpath(mat,i,j+1,m,n,path,p+1);
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef c = new Codechef();
		int mat[][] = { {1, 2, 3}, {4, 5, 6} };
		int []path = new int[6];
		c.allpath(mat,0,0,2,3,path,0);
	}
}
