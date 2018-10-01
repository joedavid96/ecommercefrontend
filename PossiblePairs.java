/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;

/* Name of the class has to be "Main" only if the class is public. */
class PossiblePairs
{
    public static int solution(int a[])
    {
        int count=1, result = 0;
        int i,j;
        ArrayList<Integer> given = new ArrayList<Integer>();
        for(int t: a)
        {
            given.add(t);
        }
        ArrayList<Integer> temp = new ArrayList<Integer>();
        HashMap<Integer,Integer> keys = new HashMap<Integer,Integer>();
        System.out.println(given.size()+" - given size");
        Collections.sort(given);
        for(i=0;i<given.size()-1;i++)
        {
            if(given.get(i)==given.get(i+1))
            {
                count++;
            }
            else
            {
                temp.add(count);
                count=1;
                continue;
            }
        }
        Collections.sort(temp);
        System.out.println(temp.size()+" - temp size");
        keys.put(1,0);
        keys.put(2,1);
        int sum = 3;
        for(j=3;j<=temp.get(temp.size()-1);j++)
        {
            keys.put(j,sum);
            sum = sum + j;
        }
        for(int x : keys.values())
        {
            System.out.println(x+" - keyset");
        }
        for(int c : temp)
        {
            result = result + keys.get(c);
        }
        return result;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int [] a = {3,5,6,3,3,5};
		System.out.println(solution(a)+" - output");
	}
}
