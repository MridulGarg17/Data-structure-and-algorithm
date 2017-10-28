//existence of path with given sum in a binary tree
// sum of all nodes in binary tree
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
    Node root;
    
    boolean Haspath(Node root,int sum){
        if(root==null){
            return(sum==0);
        }
        else{
            int remaining = sum - root.data;
            
            if((root.left!=null&&root.right!=null)||(root.left==null&&root.right==null)){
                return (Haspath(root.left,remaining)||Haspath(root.right,remaining));
            }
            else if(root.left!=null){
                return (Haspath(root.left,remaining));
            }
            else{
                return Haspath(root.right,remaining);
            }
        }
    }
    
    int sumofnodes(Node root){
        if(root==null)
        return 0;
        
        return (root.data + sumofnodes(root.left) + sumofnodes(root.right));
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Codechef c = new Codechef();
		c.root = new Node(5);
		c.root.left = new Node(5);
		c.root.right = new Node(5);
		c.root.left.left = new Node(5);
		c.root.left.right = new Node(5);
		c.root.right.left = new Node(5);
		c.root.right.right = new Node(5);
		c.root.right.right.left = new Node(5);
		
		System.out.println(c.Haspath(c.root,90));
		System.out.println(c.sumofnodes(c.root));
	}
}
