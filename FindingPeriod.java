/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class FindingPeriod
{
    public static int solution(int a)
    {
        String temp = Integer.toBinaryString(a);
        System.out.println(temp);
        int q = temp.length()-1;
        int p;
        int k=0, j=0;
        boolean flag = false;
        for (p=(q/2);p>=0;p--)
        {
            //if((temp.charAt(0)==temp.charAt(i)) && ((temp.substring(0,i-1).equals(temp.substring(i,2*i-1)))))
            //{
                //System.out.println(temp.substring(0,i-1));
            //}
            while(k<q-p-1)
            {
                 j = p;
                if(    temp.charAt(k) == temp.charAt(k+j)    )
                {
                    flag = true;
                    k++;
                    j++;
                }
                else
                {
                    k++;
                    j++;
                    flag = false;
                    continue;
                }
            }
            if(flag)
            {
                return j-1;
            }
        }
        return -1;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		    System.out.println(solution(955));	
	}
}
