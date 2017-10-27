
//Shortest path using BFS moving only in right and down

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pair{
    
    int x;
    int y;
    int cell;
    
    Pair(int x,int y,int cell)
    {
        this.x = x;
        this.y = y;
        this.cell = cell;
        
    }
    }

class C
{
    static int dr=3;
    static int dc=3;
    static boolean isSafe(int x,int y){
        return (x < dr && y < dr && x >= 0 && y >= 0);
    }
    
    
    static int shortpath(int maze[][],int r1,int c1){
        
        Queue<Pair> q = new LinkedList<>();
        
        q.add(new Pair(r1,c1,1));
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            
            int x = p.x;
            int y = p.y;
            int cell = p.cell;
            
            if(x==dr-1 && y==dc-1)
                return cell;
       
            if(isSafe(x+1,y)){
                q.add(new Pair(x+1,y,cell+1));
            } 
            if(isSafe(x,y+1)){
                q.add(new Pair(x,y+1,cell+1));
            }
            if(isSafe(x+1,y+1)){
                q.add(new Pair(x+1,y+1,cell+1));
            }
            
            
        }
        return -1;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int M[][] = { { 2, 4, 2 },
                    { 5, 3, 8 },
                    { 1, 1, 1 },
                    { 1, 1, 1}};
                    
        System.out.println(shortpath(M,0,0));            
		
		
	}
}
