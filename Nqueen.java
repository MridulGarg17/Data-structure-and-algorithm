
// Nqueen problem Backtracking

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Nqueen
{
    
   static class Position{
        int row;
        int col;
        Position(int r,int c){
            this.row = r;
            this.col = c;
        }
    }
    
    public static boolean solve(int n,int r,Position[] p){
        
        if(n==r){
            return true;
        }
        
        int col=0;
        for(col=0;col<n;col++){
            
            boolean safe = true;
            
            for(int q=0;q<r;q++){
                if(isnotSafe(q,col,r,p)){
                    safe=false;
                    break;
                }
            }
            
            if(safe){
                p[r] = new Position(r,col);
                if(solve(n,r+1,p)){
                    return true;
                }
            }
            
            
        }
        
        return false;
    }
    
   public static boolean isnotSafe(int q,int c,int r,Position[] p){
        if(c==p[q].col || r+c== p[q].row + p[q].col || r-c == p[q].row-p[q].col ){
            return true;
        }else return false;
    }
    
    public static Position[] solveNqueen(int n){
        Position[] pos = new Position[n];
        boolean sol= solve(n,0,pos);
        
        if(sol){
            return pos;
        }else
        return (new Position[0]);
    } 
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Nqueen n = new Nqueen();
		
		Position[] p = n.solveNqueen(6);
		
		for(int i=0;i<=5;i++){
		    
		    System.out.println("positions-->"+ p[i].row+" "+p[i].col);
		    
		}
		
		
	}
}
