//Print all the ancestors of tree node
//height of tree 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
    int data;
    Node left,right;
    Node(int d){
        this.data = d;
        left=right=null;
    }
}

class Codechef
{
    Node root;
    
   static int find(Node node){
        int l=0,r=0;
        if(node==null){
            return 0;
        }
        l=find(node.left);
        r=find(node.right);
        
        if(l>r){
            return l+1;
        }else
        return r+1;
    }
    
 
    boolean print(Node root,int data){
        if(root == null){
            return false;
        }
        if((root.left!=null && root.left.data==data) || (root.right!=null && root.right.data==data) || print(root.left,data) || print(root.right,data)){
            System.out.println("ancestor-->"+root.data);
            return true;
        }
        return false;
    }   
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Codechef c = new Codechef();
		c.root = new Node(45);
		c.root.left = new Node(434);
		c.root.right = new Node(34);
		c.root.left.left = new Node(56);
		c.root.left.right = new Node(23);
		c.root.right.left = new Node(12);
		c.root.left.left.left = new Node(346);
		
		System.out.println("height of tree is : "+find(c.root));
		
		System.out.println(c.print(c.root,346));
	}
}
