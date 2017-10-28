
//Diametere of tree

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
    
    int data;
    Node left,right;
    
    Node(int data){
        this.data = data;
        left=right=null;
    }
}

class Codechef
{
    static Node root;
    
     int Diametere(Node root){
        
        if(root==null){
            return 0;
        }
        
        int lh = Height(root.left);
        int rh = Height(root.right);
        
        int ld = Diametere(root.left);
        int rd = Diametere(root.right);
        
        return (Math.max(lh+rh+1,Math.max(ld,rd)));
        
    } 
    
    static int Height(Node root){
        if(root==null){
            return 0;
        }
        
        return (1+Math.max(Height(root.left),Height(root.right)));
    } 
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef c = new Codechef();
		
		c.root = new Node(45);
		c.root.left = new Node(56);
		c.root.right = new Node(45);
		c.root.left.left = new Node(45);
		c.root.left.right = new Node(45);
		c.root.left.left.left = new Node(45);
		c.root.left.left.right = new Node(45);
		c.root.left.left.left.left = new Node(45);
		c.root.left.right.right = new Node(45);
		c.root.left.right.right.right = new Node(45);
		
		System.out.println(c.Diametere(root));
	}
}
