
public class ThreeDimensionArray
{
	public static void main(String[] args) {
		int arr [][][] = new int[4][3][6];
		
		

		//for assigning values
		for(int i = 0; i<arr.length ; i++)
		{
			for(int j= 0 ; j<arr[i].length ; j++)
			{
				for(int k = 0; k< arr[i][j].length;k++)
				{
			
				
			    	arr [i][j][k] = (int)(Math.random()*32);
				    
				}
			}
		}

		for(int i = 0; i<arr.length ; i++)
		{
		    
			for(int j= 0 ; j<arr[i].length ; j++)
			{   
			        for(int k = 0; k< arr[i][j].length;k++)
		        	{
			        
			        	System.out.print(arr [i][j][k] + " ");
			    
		        	}
			}
		
			System.out.println();
		}
	}
}
