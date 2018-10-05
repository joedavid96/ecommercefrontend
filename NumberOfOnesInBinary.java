import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Arrays;
import java.util.stream.*;

/* Name of the class has to be "Main" only if the class is public. */
class NumberOfOnesInBinary
{
    public static int solution(int a, int b)
    {
	int number = 0;
        String [] arr = Integer.toBinaryString(a*b).split("0");
        //return Arrays.stream(arr).collect(Collectors.joining("")).length();
	for(String temp : arr)
        {
            number += temp.length();
        }
        return number;
	    
        
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	
	    System.out.println(solution(7,3));
	
	}
}
