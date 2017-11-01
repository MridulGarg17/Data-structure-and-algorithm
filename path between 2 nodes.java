
 
//print path between 2 nodes of tree

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
   static Node root;
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
    
    static boolean path(Node root,int []p,int plen,int data){
        if(root==null){
            return false;
        }
        
       // p[plen] = root.data;
        
       // plen++;
       // System.out.print(root.data+" ");
        if((root.data==data)){
            System.out.print(root.data+" ");
          //  printpath(p,plen);
            
            return true;
        }else if(path(root.left,p,plen,data)||path(root.right,p,plen,data)){
            //path(root.left,p,plen,data);
            //path(root.right,p,plen,data);
           System.out.print(root.data+" ");
            return true;
        }
       // plen--;
        return false;
    }
    
    static void printpath(int []p,int plen){
        for(int i=0;i<plen;i++){
            System.out.print("--->"+p[i]);
        }
        System.out.println();
    }
    
    static boolean getPath(Node rootNode, ArrayList<Integer> path,int key ){
    //return true if the node is found
    if( rootNode==null)
        return false;
    if (rootNode.data==key){
        path.add(rootNode.data);
        return true;
    }
    boolean left_check = getPath( rootNode.left,path,key);
    boolean right_check = getPath( rootNode.right,path,key);
    if ( left_check || right_check){
        path.add(rootNode.data);
        return true;
    }
    return false;

}
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef c = new Codechef();
		c.root = new Node(13);
		c.root.left = new Node(10);
		c.root.right = new Node(15);
		c.root.left.left = new Node(9);
		c.root.left.right = new Node(12);
		c.root.right.left = new Node(14);
		c.root.right.right = new Node(16);
		//c.root.right.right.left = new Node(0);
		int [] p = new int[50];
		Node t = lca(c.root,9,15);
		System.out.println("LCA is : "+ t.data);
	//	ArrayList<Integer> l = new ArrayList<>();
	//	c.getPath(t,l,9);
	//	System.out.println(l);
		c.path(t,p,0,9);
	//	l = new ArrayList<>();
	//	c.getPath(t,l,15);
	//	System.out.println(l);
		int []p2 = new int[50];
        c.path(t,p2,0,15);		
		
	}
}
