package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;

public class GeneralQuestions {
	
	public GeneralQuestions(){};
	
	
/*	Find the most frequent integer in an array */

	public int frequentInt(int [] arr)
	{	
		int freqInt;
		int maxIndex = -1;
		int numIntsInArray = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			freqInt = 0;
			for(int j = i; j < arr.length; j++)
			{
				if(arr[j] == arr[i])
				{
					freqInt++;
				}
			}
			
			if(freqInt > numIntsInArray)
			{
				numIntsInArray = freqInt;
				maxIndex = i;
			}
		}
		return arr[maxIndex];
	}

	public int pairsSorted(int [] arr)
	{
		ArrayList<Integer> numList = new ArrayList<Integer>();
		for(int i = 0; i < arr.length;i++)
		{
			numList.add(arr[i]);
		}
		Collections.sort(numList);
		int pair = 0;
		
		//Minor enhancement can be made by only testing 1/2 the numbers.
		for(int i : numList)
		{
			if(numList.contains(10-i))
			{
				pair++;
			}
		}
		return pair/2;
	}

	/*
	 * Hashing makes this operation O(n). Mind. Blown.
	 * */
	public int pairSortedHash(int [] arr)
	{
		int pair = 0;
		
		Hashtable<Integer, Integer> hashArray = new Hashtable<Integer,Integer>();
		
		for(int i = 0; i < arr.length; i++)
		{
			hashArray.put(arr[i], i);
		}		
		
		for(int i = 0; i < arr.length;i++)
		{
			if(hashArray.containsKey(10 - arr[i]))
			{
				pair++;
			}
		}
		return pair/2;
	}
	
	/*
	 * I can solve this with all unique values... without it is hard.
	 * http://stackoverflow.com/questions/31000591/check-if-a-list-is-a-rotation-of-another-list-that-works-with-duplicates
	 * 
	 * N^2 time complexity, (1) space.
	 * 
	 * Copied code from above. Explanation of algorithm is as follows:
	 * 
	 * 1) set k to 1. 
	 * 2) while numbers in array match increment k (this is done through the mod to get a positive index)
	 * 3) 
	 * 
	 * */
	public boolean twoIntegerArray(int [] arrone, int [] arrtwo)
	{
		int i,j,k;
		int n = arrone.length;
		if(n != arrtwo.length)
			return false;
		
		i = j = -1;
		while(i < n-1 && j < n-1)   
		{
			k = 1;
	        while(k<=n && arrone[(i+k)%n]==arrtwo[(j+k)%n])
	        {
	        	k+=1;
	        }
			if(k > n)
			{
				return true;
			}
			if(arrone[(i+k) % n] > arrtwo[(j+k) % n]) // the % is a slick way to handle negative numbers.
			{
				i+=k;
			}
			else
			{
				j+=k;
			}
		}
		return false;
	}	
	
	/*
	 * solved using dp. better solution is to use temp variables but I wanted to explicity use dp.
	 * */
	public int fibnums(int n)
	{
		int [] arr = new int[n+1];
		
		arr[0] = 0;
		arr[1] = 1;
		
		for(int i = 2; i < n+1; i++)
		{
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[n];
	}

	/*
	 * Memoization solution.
	 * */
	public int fibMemo(int n, int arr [])
	{
		if(n == 0)
		{
			arr[n] =0;
			return 0;
		}
		if(n == 1)
		{
			arr[n] = 1;
			return 1;
		}
		if(arr[n] != 0)
		{
			return arr[n];
		}
		else
		{
			arr[n] = fibMemo(n-2,arr) + fibMemo(n-1,arr);
			return arr[n];					
		}
		

	}
	
}