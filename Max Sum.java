
// max sum at any level of tree

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
    int data;
    Node left,right;
    
    Node(int data){
        this.data = data;
        left = right =null;
    }
}


class Codechef
{
    Node root;
    
    int levelmax(Node root){
        if(root==null){
            return 0;
        }
        int level =0;
        int max =0;
        Queue<Node> q = new LinkedList<>(); 
        q.add(root);
        max = max+ root.data;
        q.add(null);
        int sum =0;
        while(!q.isEmpty()){
            //System.out.println("this is queue-->"+q);
            root = q.poll();
            if(root==null){
                if(!q.isEmpty()){
                    q.add(null);
                    
                }
                max = Math.max(max,sum);
                sum =0 ;
                level++;
            }
            else{
                    if(root.left!=null){
                        q.add(root.left);
                        sum  = sum + root.left.data;
                       
                    }
                    if(root.right!=null){
                        q.add(root.right);
                        sum = sum + root.right.data;
                        
                    }
                   
            }
            
        }
        
        return max;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef c = new Codechef();
		
		c.root = new Node(45);
		c.root.left = new Node(10);
		c.root.right = new Node(25);
		c.root.left.left = new Node(35);
		c.root.left.right = new Node(-5);
		c.root.right.left = new Node(15);
		c.root.right.right = new Node(45);
		c.root.left.left.left = new Node(50);
		c.root.left.left.right = new Node(55);
		
		System.out.println(c.levelmax(c.root));
	}
}
