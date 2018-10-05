/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BracketEqualPoint
{
    public static int solution(String a)
    {
        int len = a.length();
        int [] open = new int[len+1];
        int [] closed = new int[len+1];
        int openCount = 0, closedCount = 0;
        open[0] = 0;
        closed[len] = 0;
        
        if(a.charAt(0)=='(')
        {
            open[1] = openCount++;
        }
        if(a.charAt(len-1)==')')
        {
            closed[len-1] = closedCount++;
        }
        for(int i=1; i<len;i++)
        {
            if(a.charAt(i)=='(')
            {
                openCount++;
                open[i+1] = openCount;
            }
            else
            {
                open[i+1] = openCount;
            }
        }
        
        for(int i=len-2; i>=0;i--)
        {
            if(a.charAt(i)==')')
            {
                closedCount++;
                closed[i] = closedCount;
            }
            else
            {
                closed[i] = closedCount;
            }
        }
        
        for(int i=0; i<=len; i++)
        {
           if(open[i]==closed[i])
            {
                return i;
            }
        }
        
        return -1;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		    System.out.println(solution("(())))("));	
	}
}
