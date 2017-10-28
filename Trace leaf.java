
//print path root to leaf

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

class Codechef
{
    Node root;
    
    void path(Node root,int []p,int plen){
        if(root==null){
            return;
        }
        
        p[plen] = root.data;
        
        plen++;
        
        if(root.left==null&&root.right==null){
            printpath(p,plen);
            
        }else{
            path(root.left,p,plen);
            path(root.right,p,plen);
        }
    }
    
    void printpath(int []p,int plen){
        for(int i=0;i<plen;i++){
            System.out.print("--->"+p[i]);
        }
        System.out.println();
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef c = new Codechef();
		c.root = new Node(45);
		c.root.left = new Node(10);
		c.root.right = new Node(15);
		c.root.left.left = new Node(9);
		c.root.left.right = new Node(12);
		c.root.right.left = new Node(5);
		c.root.right.right = new Node(4);
		c.root.right.right.left = new Node(0);
		int [] p = new int[50];
		c.path(c.root,p,0);
		
		
	}
}
