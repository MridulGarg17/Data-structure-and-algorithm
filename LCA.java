
//Least Comman Ancesstor in BST


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
    int data;
    Node left,right;
    
    Node(int i){
        this.data = i;
        left = right = null;
    }
}


class Bt
{
    Node root;
    
    static Node lca(Node root,int n1,int n2){
        
        if(root==null){
            return null;
            
        }
        
        if(root.data>n1 && root.data>n2){
            return lca(root.left,n1,n2);
        }
        if(root.data<n1 && root.data<n2){
            return lca(root.right,n1,n2);
        }
        
        return root;
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Bt b = new Bt();
		b.root = new Node(20);
		b.root.left = new Node(10);
		b.root.right = new Node(30);
		b.root.left.right = new Node(15);
		b.root.left.left = new Node(9);
		b.root.right.right = new Node(40);
		b.root.right.left = new Node(24);
		
		Node t = lca(b.root,9,15);
		System.out.println(t.data);
		
		
	}
}
