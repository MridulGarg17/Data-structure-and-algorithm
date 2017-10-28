
//making BST-inorder-delete element 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
    int data;
    Node left,right;
    Node(int d){
        this.data = d;
        left = right = null;
    }
}

class Codechef
{
   static Node root;
    
    /// code for insertion of node in tree --->
    
    void insert(int data){
        root = ins(root,data);
    }
    
    Node ins(Node node,int data){
        if(node==null){
            node  = new Node(data);
        }
        
        if(data<node.data){
            node.left = ins(node.left,data);
        }else if(data>node.data){
            node.right = ins(node.right,data);
        }
        
        return node;
    }
    
    /// code for inorder traversal --->
    
    void inorder(Node node){
        if(node!=null){
            inorder(node.left);
            System.out.print(""+node.data+" ");
            inorder(node.right);
        }
    }
    
    /// code for delete the node
    
    Node del(Node node,int data){
        if(node==null){
            return node;
        }
        
        if(data<node.data){
            node.left = del(node.left,data);
        }
        else if(data>node.data){
            node.right = del(node.right,data);
        }else{
            
            if(node.left==null){
                return node.right;
            }else if(node.right==null){
                return node.left;
            }
            
            node.data = min(node.right);
            
            node.right = del(node.right,node.data);
            
        }
        return node;
    }
    
    int min(Node node){
        int mini = node.data;
        while(node.left!=null){
            mini = node.left.data;
            node = node.left;
        }
        return mini;
    }
    
    //count full node
    
    int getfullcount(Node node){
        if(node == null){
            return 0;
        }
        int res =0;
        if(node.left!=null && node.right!=null)
        res++;
        
        res = res + getfullcount(node.left)+ getfullcount(node.right);
        
        return res;
    }
    
    // count half node with 1 child only
    int gethalfcount(Node node){
        if(node == null){
            return 0;
        }
        int res =0;
        if((node.left!=null && node.right==null)||(node.right!=null && node.left==null))
        res++;
        
        res = res + gethalfcount(node.left)+ gethalfcount(node.right);
        
        return res;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Codechef c = new Codechef();
		c.insert(40);
		c.insert(50);
		c.insert(30);
		c.insert(20);
		c.insert(10);
		c.insert(45);
		c.insert(55);
		c.insert(54);
		c.insert(70);
		
		c.inorder(root);
		System.out.println("\n"+"count of full node-->"+c.getfullcount(root));
		System.out.println("\n"+"count of half node-->"+c.gethalfcount(root));

		c.del(root,55);
		System.out.println("after deletion fuck --->");
		c.inorder(root);
		System.out.println("\n"+"count of full node-->"+c.getfullcount(root));
		System.out.println("\n"+"count of half node-->"+c.gethalfcount(root));

	    
	    
	}
}
