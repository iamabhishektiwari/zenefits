/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void print(str)
    {
       if(str.charAt(1)=='{')// cheak for the first position 
        {
            
          
        }
        else// if brackets not available cheak for two
        {
                 if(str.charAt(2)=='{')
            {
                String temp = "{";
                int score =0;
                for(int j=3;j<n;j++)
                {
                    temp = temp+str.charAt(j);
                    if(str.charAt(j)=='}')
                    score = score -1;
                    if(str.charAt(j)=='{')
                    score = score+1;
                    if(score==-1)
                    print(temp);
                    break;
                    
                }
            }
            else
            System.out.print(ctr.charAt(2);
        }
        
        
        
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    print(str);
		// your code goes here
	}
}
