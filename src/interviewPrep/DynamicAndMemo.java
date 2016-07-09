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
			for(int j =0; j < coinValue.length; j++)
			{
				if(!(i - coinValue[j] < 0))
				{
					minCoin = 1+ minCoinCount[i-coinValue[j]];
					if(minCoin < minCoinCount[i])
					{
						minCoinCount[i] = minCoin;
					}
				}

			}
		}
		return minCoinCount[money];
	}

}
