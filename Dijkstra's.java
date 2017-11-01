//Dijkstra's algo for weighted graph

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    int min(int[] dis,boolean[] v){
        
        int min = Integer.MAX_VALUE;
        int l = dis.length;
        int mini=-1;
        for(int i=0;i<l;i++){
            if(!v[i] && dis[i]<=min){
                min = dis[i];
                mini = i;
            }
        }
        return mini;
    }

    void print(int[] dis){
        System.out.println("source 2 to vertex 4 is :"+dis[4]);
    }

    void path(int[][] mat,int src){
        int V = mat.length;
        int[] dis =  new int[mat.length];
        boolean[] v = new boolean[mat.length];
        
        for(int i=0;i<V;i++){
            dis[i] = Integer.MAX_VALUE;
            v[i] = false;
        }
        
        dis[src]=0;
        
        for(int count = 0;count<V-1;count++){
            
            int u = min(dis,v);
            
            v[u]=true;
            
            for(int i=0;i<V;i++){
                if(!v[i] && mat[u][i]!=0 && dis[u]!=Integer.MAX_VALUE && (dis[u]+mat[u][i]<dis[i])){
                    dis[i] = dis[u]+mat[u][i];
                }
            }
            
        }
        
        print(dis);
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int graph[][] = new int[][]{{0, 4, 0, 0, 0, 0, 0, 8, 0},
                                  {4, 0, 8, 0, 0, 0, 0, 11, 0},
                                  {0, 8, 0, 7, 0, 4, 0, 0, 2},
                                  {0, 0, 7, 0, 9, 14, 0, 0, 0},
                                  {0, 0, 0, 9, 0, 10, 0, 0, 0},
                                  {0, 0, 4, 14, 10, 0, 2, 0, 0},
                                  {0, 0, 0, 0, 0, 2, 0, 1, 6},
                                  {8, 11, 0, 0, 0, 0, 1, 0, 7},
                                  {0, 0, 2, 0, 0, 0, 6, 7, 0}
                                 };
                                 
        Codechef c = new Codechef();
        c.path(graph,2);
	}
}
