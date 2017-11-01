/* package codechef; // don't place package name! */
//shoertest path bfs in all direction 
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Pair{
    int x;
    int y;
    int cell;
    Pair(int x,int y, int d){
        this.x =x;
        this.y=y;
        this.cell = d;
    }
}

class C
{
    static int dr=9;
    static int dc=2;
    static boolean isSafe(int x,int y){
        return (x < 9 && y < 10 && x >= 0 && y >= 0);
    }


    static int shortpath(int maze[][],int r1,int c1){
        
        Queue<Pair> q = new LinkedList<>();
        
         boolean v[][] = new boolean[9][10];
            
            for(int i=0;i<9;i++){
                for(int j=0;j<10;j++){
                    v[i][j]=false;
                }
            }
        
        q.add(new Pair(r1,c1,0));
        
        v[r1][c1]=true;
        
        while(!q.isEmpty()){
            Pair p = q.poll();
            
            int x = p.x;
            int y = p.y;
            int cell = p.cell;
            
            if(x==dr-1 && y==dc-1)
                return cell;
      
            v[x][y] = true;
            
            if(isSafe(x+1,y)&&v[x+1][y]==false&&maze[x+1][y]==1){
                q.add(new Pair(x+1,y,cell+1));
              //  System.out.println(x+1 +","+y);
            } 
            if(isSafe(x,y+1)&&v[x][y+1]==false&&maze[x][y+1]==1){
                q.add(new Pair(x,y+1,cell+1));
               // System.out.println(cell+1);
            }
            if(isSafe(x-1,y)&&v[x-1][y]==false&&maze[x-1][y]==1){
                q.add(new Pair(x-1,y,cell+1));
               // System.out.println(cell+1);
            }
            if(isSafe(x,y-1)&&v[x][y-1]==false&&maze[x][y-1]==1){
                q.add(new Pair(x,y-1,cell+1));
               // System.out.println(cell+1);
            }
            
        }
        return -1;
    
}
}

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int mat[][] =
    {
        { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
        { 1, 0, 1, 0, 1, 1, 1, 0, 1, 1 },
        { 1, 1, 1, 0, 1, 1, 0, 1, 0, 1 },
        { 0, 0, 0, 0, 1, 0, 0, 0, 0, 1 },
        { 1, 1, 1, 0, 1, 1, 1, 0, 1, 0 },
        { 1, 0, 1, 1, 1, 1, 0, 1, 0, 0 },
        { 1, 0, 0, 0, 0, 0, 0, 0, 0, 1 },
        { 1, 0, 1, 1, 1, 1, 0, 1, 1, 1 },
        { 1, 1, 0, 0, 0, 0, 1, 0, 0, 1 }
    };
    C c = new C();
		System.out.println(c.shortpath(mat,0,0));    
	}
}
