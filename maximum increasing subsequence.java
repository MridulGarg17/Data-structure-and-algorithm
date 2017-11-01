
// sum of maximum increasing subsequence


import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Codechef c = new Codechef();
		int []a = new int[]{1, 101, 2, 3, 100, 4, 5};
		int l = a.length;
		int []sum = new int[l];
		
		for(int i=0;i<l;i++){
		    sum[i] = a[i];
		}
		int max=0;
		for(int i=1;i<l;i++){
		    for(int j=0;j<i;j++){
		        if(a[i]>a[j]&& sum[i]<sum[j]+a[i]){
		            sum[i] = sum[j] + a[i];
		            max = Math.max(max,sum[i]);
		        }
		    }
		}
		System.out.println(max);
		
	}
}
