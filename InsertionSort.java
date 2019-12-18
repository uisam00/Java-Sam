
public class InsertionSort {

	
//---------------------------------------------------//------------------------------------------------------//
	public static void insertionSort(int[]v) 
	{
		int aux;
		for (int i = 0; i < v.length; i++)
		{
			for (int j = i; j > 0 && v[j] < v[j-1]; j--)
			{
				 aux = v[j];
				 v[j] = v[j-1];
				 v[j-1] = aux;
			}
		}
		for(int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
	}
	
}




