
//Rat Maze problem (Backtracking with hurdels)

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Rat
{
    public static int N = 1; 
    boolean solvemaze(int maze[][],int r,int c){
        int [][] sol = new int [r][c];
        
        if(solvemaxeutil(maze,0,0,sol)==false){
            System.out.println("sorry not possible");
            return false;
        }
        
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(" "+sol[i][j]+" ");
            }
            System.out.println("");
        }
        
        return true;
        
    }
    
    boolean solvemaxeutil(int maze[][],int x,int y,int sol[][]){
        
        if(x==N-1 && y ==N-1){
            
            sol[x][y]=1;
            return true;
        }
        
        if(issafe(maze,x,y)==true){
            sol[x][y]=1;
            
            if(solvemaxeutil(maze,x+1,y,sol)==true)
                return true;
                
            if(solvemaxeutil(maze,x,y+1,sol)==true)
                return true;
            
            sol[x][y]=0;
            return false;
            
        }
        return false;
        
    }
    
    boolean issafe(int maze[][],int x,int y){
        if(x<maze.length && y<maze[0].length && x>=0 && y>=0 && maze[x][y]==1){
            return true;
        }else
        return false;
    }
    
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Rat r = new Rat();
		
		int [][] maze =  {{1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1}
        };
        
      //  Scanner sc = new Scanner(System.in);
     //   N = sc.nextInt();
        
        r.solvemaze(maze,4,4);
		
	}
}
