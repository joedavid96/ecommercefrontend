/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.HashSet;

/* Name of the class has to be "Main" only if the class is public. */
class ElevatorStops
{
    public static int solution(int[] A, int[] B, int M, int X, int Y)
    {
        int trip = 0, i = 0, weightlimit = 0, personlimit = 0;
        Set<Integer> floor = new HashSet<Integer>();
        
        while(i<A.length)
        {
            while(personlimit<X && i<A.length)
            {
                if(personlimit>=X)
                {
                    floor.add(B[i]);
                    trip = trip + (floor.size()+1);
                    //i++;
                    personlimit=0;
                    weightlimit=0;
                    floor.clear();
                }
                else
                {
                  floor.add(B[i]);
                  
                  if(A[i]<Y)
                   {
                       weightlimit = weightlimit+A[i];
                       if(weightlimit>=Y)
                       {
                            trip = trip + (floor.size()+1);
                            //i++;
                            personlimit=0;
                            weightlimit=0;
                            floor.clear();
                       }
                       else
                       {
                           i++;
                           personlimit++;
                           continue;
                       }
                   }
                   else if(A[i]>Y)
                   {
                       System.out.println("Please use the Stairs!");
                       System.exit(0);
                   }
                }
              
            }
            trip = trip + (floor.size()+1);
            //i++;
            personlimit=0;
            weightlimit=0;
            floor.clear();
        }
        return trip;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	    int [] A = {40,100,80,20};
	    int [] B = {3,2,2,3};
		System.out.println(solution(A,B,5,2,200));
	}
}
