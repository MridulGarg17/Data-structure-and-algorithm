
//check if 2 tree are simillar

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Node{
    int data;
    Node left,right;
    Node(int data){
        this.data = data;
        left = right = null;
    }
    
}

class Codechef
{
    Node root;
    
   static boolean similar(Node n1,Node n2){
        
        if(n1==null && n2==null){
            return true;
        }
        if(n1==null || n2==null){
            return false;
        }
        
        return(n1.data==n2.data && similar(n1.left,n2.left) && similar(n1.right,n2.right));
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Codechef c = new Codechef();
		c.root = new Node(45);
		c.root.left = new Node(56);
		c.root.right = new Node(55);
		c.root.left.left = new Node(456);
		c.root.left.right = new Node(453);
		c.root.right.right = new Node(345);
		c.root.right.left = new Node(89);
		
		Codechef a = new Codechef();
		a.root = new Node(45);
		a.root.left = new Node(56);
		a.root.right = new Node(55);
		a.root.left.left = new Node(456);
		a.root.left.right = new Node(453);
		a.root.right.right = new Node(345);
		
		System.out.println(similar(c.root,a.root));
	}
}
