/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.HashSet;

/* Name of the class has to be "Main" only if the class is public. */
class ShippingPackages
{
    public static int solution(int items, int large, int small)
    {
      if(items<0 | large<0 | small<0)
      {
          return -1;
      }
      else if(items==0)
      {
          return 0;
      }
      else if(items>0 && large==0)
      {
          if(small>items)
          {
              return items;
          }
          else
          {
              return -1;
          }
      }
      else if(items>0 && small==0)
      {
          if(items%5==0 && items/5>0)
          {
              return items/5;
          }
          else
          {
              return -1;
          }
      }
      else if(items>(large*5+small))
      {
          return -1;
      }
      else if(items<(large*5+small))
      {
          if(items/5>large)
          {
              
          }
      }
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	  System.out.println(solution(16,2,10));
	}
}
