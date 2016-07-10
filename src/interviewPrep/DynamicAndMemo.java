package interviewPrep;

import java.util.Arrays;

public class DynamicAndMemo {
	
	DynamicAndMemo(){};
	
public	int coins(int coinValue[], int money)
	{
		int [] minCoinCount = new int[money+1];
		Arrays.fill(minCoinCount, Integer.MAX_VALUE);
		minCoinCount[0] = 0;
		int minCoin;
		for(int i = 0; i < money+1; i++)
		{
			minCoin = Integer.MAX_VALUE;
			for(int j =0; j < coinValue.length; j++)
			{
				if(i - coinValue[j] >= 0)
				{
					minCoin = Math.min(minCoin, minCoinCount[i-coinValue[j]] + 1);
					minCoinCount[i] = minCoin;
				}
			}
		}
		return minCoinCount[money];
	}
/*
 * http://www.geeksforgeeks.org/dynamic-programming-set-13-cutting-a-rod/
 * */
public int cutRod(int[] lengthPrice, int length)
{
	int [] bestPrice = new int[length+1];
	bestPrice[0] = 0;
	int mostPrice;
	for(int i = 1; i <= length;i++)
	{
		mostPrice = Integer.MIN_VALUE;
		for(int j = 0; j < i ; j++)
		{
			mostPrice = Math.max(mostPrice, lengthPrice[j] + bestPrice[i-j-1]);
			bestPrice[i] = mostPrice;
		}
	}
	return bestPrice[length];
}


public int oneZeroKnapSack(int [] itemVal, int [] weight, int num)
{
	int [] valueAt = new int[num+1];
		valueAt[0] = 0;
		int mostValue;
		for(int i=1; i < valueAt.length; i++)
		{
			mostValue = Integer.MIN_VALUE;
			for(int j = 0; j < itemVal.length; j++)
			{
				if(weight[j] <= i)
				{
				mostValue  = Math.max(mostValue, valueAt[i-weight[j]] + itemVal[j]);
				valueAt[i] = mostValue;
				}
			}
		}
return valueAt[num];
}


}
