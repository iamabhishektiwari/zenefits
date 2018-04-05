/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int fact(int n) for calculating factorial
    {
        if(n==0)
        return 1;
        if(n==1 || n==2)
        return n;
        else
        return fact n*fact(n-1);
    }
    public static int find(char c, char[]ch) // for finding the rank of an alphabet from given set of alphabets
    {
        for(int i=0;i<ch.length;i++)
        {
            if(c==ch[i])
            return i;
        }
        return -1;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int n = Integer.parseInt(br.readLine());
	    char[] ch = new char[n];
	    for(int i=0;i<n;i++)
	    ch[i] = (char)br.read();
	    String str = br.readLine();
	    
	    for(int i=0;i<n;i++)
	    {
	        for(int j=0;j<n;j++)
	        {
	            if(ch[i]>ch[j])
	            {
	                char temp = ch[i];
	                ch[i] = ch[j];
	                ch[j] = temp;
	            }
	        }
	    }
	    int sum = 0;
	    for(int i=0;i<str.length();i++)
	    {
	        char c = str.charAt(i);
	        int ind = find(c,ch);
	        if(ind==i)
	        continue;
	        else
	        {
	            sum = sum+(ind-i)*fact(str.length()-1-i);
	        }
	    }
	    // sum is the number of words before our word, therefore sum+1 will be answer.
	    System.out.println(sum+1);

		// your code goes here
	}
}
