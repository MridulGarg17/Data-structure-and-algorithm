
//find max in tree recursion 

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Node{
    int data;
    Node l,r;
    
    Node(int d){
        this.data = d;
        l = r = null;
    }
}

class Codechef
{
    Node root;
    
    int find(Node node){
        if(node==null){
            return Integer.MIN_VALUE;
        }
        
        int res = node.data;
        int lres = find(node.l);
        int rres = find(node.r);
        
        if(lres>res)
        res = lres;
        if(rres>res)
        rres=res;
        
        return res;
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Codechef c = new Codechef();
		c.root = new Node(45);
		c.root.l = new Node(50);
		c.root.r = new Node(34);
		c.root.l.l = new Node(56);
		
		System.out.println(c.find(c.root));
	}
}
