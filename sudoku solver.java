
// SUDOKU Backtracking

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    
    boolean isSafe(int[][] s,int x,int y,int n){
         if(col(s,y,n) || row(s,x,n) || box(s,x,y,n)){
             return false; 
         }else 
         return true;
    }
    
    boolean col(int[][] s,int y,int n){
        for(int i=0;i<n;i++){
            if(s[y][i]==n)
            return true;
        }
        return false;
    }
    
    boolean row(int[][] s,int x,int n){
        for(int i=0;i<n;i++){
            if(s[i][x]==n)
            return true;
        }
        return false;
    }
    
    boolean box(int[][] s,int x,int y,int n){
      x= (x/3)*3;
      y = (y/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++)
            if(s[i+x][y+j]==n)
            return true;
        }
        return false;
    }
    
    
    boolean sudoku(int s[][]){
        int r = s.length;
        int l = r;
        for(int i=0;i<l;i++){
            for(int j=0;j<l;j++){
                if(s[i][j]!=0){
                    continue;
                }
                
                for(int n=1;n<=l;n++){
                    if(isSafe(s,i,j,n)){
                        s[i][j]=n;
                        
                        if(sudoku(s)){
                            
                            return true;
                            
                        }
                        
                        s[i][j] = 0;
                    }
                }
                return false;
            }
        }
        return true;
        
    }
    
    void print(int s[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(s[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		int s[][] = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                      {5, 2, 0, 0, 0, 0, 0, 0, 0},
                      {0, 8, 7, 0, 0, 0, 0, 3, 1},
                      {0, 0, 3, 0, 1, 0, 0, 8, 0},
                      {9, 0, 0, 8, 6, 3, 0, 0, 5},
                      {0, 5, 0, 0, 9, 0, 6, 0, 0},
                      {1, 3, 0, 0, 0, 0, 2, 5, 0},
                      {0, 0, 0, 0, 0, 0, 0, 7, 4},
                      {0, 0, 5, 2, 0, 6, 3, 0, 0}};
                      
            Codechef c = new Codechef();
           
           if( c.sudoku(s));
            c.print(s);
	}
}
