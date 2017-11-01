
//coloring the graph Backtracking

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    boolean isSafe(int [][]g,int[] col,int v,int c){
        for(int i=0;i<g.length;i++){
            if(g[v][i]==1 && c == col[i]){
                return false;
            }
        }
        return true;
    }
    
    boolean backtrack(int [][]g,int[] col,int n,int v){
        if(v==g.length){
            return true;
        }
        for(int c=1;c<=n;c++){        
            if(isSafe(g,col,v,c)){
                col[v] = c;
                
                if(backtrack(g,col,n,v+1))
                return true;
                
                col[v] = 0;
            
            }
            
        }
        return false;
    
    }
    
    void color(int[][] g,int n){
        int[] col = new int[g.length];
        for(int i=0;i<g.length;i++){
            col[i]=0;
        }
        
        if(backtrack(g,col,n,0)){
            for(int i=0;i<g.length;i++)
            System.out.print(col[i]+" ");
        }else{
            System.out.println("not exist");
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		 int graph[][] = {{0, 1, 1, 1},
            {1, 0, 1, 0},
            {1, 1, 0, 1},
            {1, 0, 1, 0},
        };
        int m = 3;
        
        Codechef c = new Codechef();
        c.color(graph,m);
        
	}
}
