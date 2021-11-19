package Assignment1_CoreJava;

public class PrintTwoDimensionalArray {
	
	public static void main(String[] args) 
	{
		char [][] arr= new char [11][10];

		for (char k = 0; k < 11; k++)
		{
			for (int l = 0; l < 10; l++) 
			{
				arr[k][l]='O';
			}

		}
		for (int m =1; m < 11; m++)
		{
			for (int i = 11; i >=m ; i--) 
			{
				System.out.print(" "); 
			}
			for (int p = 0; p < m; p++) 
			{

				System.out.print(arr[m][p]+" ");

			}
			System.out.println(" ");

		}

	}

}