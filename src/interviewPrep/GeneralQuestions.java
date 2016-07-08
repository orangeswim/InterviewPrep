package interviewPrep;



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

}
