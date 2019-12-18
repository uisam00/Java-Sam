
public class Bubblesort {

//----------------------------------------------//--------------------------------------------------------//
	private static void bubblesort(int[] v)
	{
		int aux;
		for (int i = 0; i < v.length; i++) 
		{
			for (int j = 0; j < v.length - 1; j++)
			{
				if(v[j]>v[j+1]) 
				{
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
		for(int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
	}
	//Otimização 1,  v.length - i - 1
	private static void bubblesortOt1(int[] v)
	{
		int aux;
		for (int i = 0; i < v.length; i++) 
		{
			for (int j = 0; j < v.length - i - 1; j++)
			{
				if(v[j]>v[j+1]) 
				{
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}		
		}
		for(int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
	}
	//Otimização 2, !ordenado
	private static void bubblesortOt2(int[] v)
	{
		int aux;
		boolean ordenado = false;
		for (int i = 0; i < v.length && !ordenado; i++) 
		{
			ordenado = true;
			for (int j = 0; j < v.length - 1; j++)
			{
				if(v[j]>v[j+1]) 
				{
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
					ordenado = false;
				}
			}		
		}
		for(int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
	}
	//Otimização 3, j < ultimaTroca1
	private static void bubblesortOt3(int[] v)
	{
		int aux, ultimaTroca1 = 0, ultimaTroca2 = v.length - 1;
		for (int i = 0; i < v.length; i++) 
		{
			for (int j = 0; j < v.length - 1 && j < ultimaTroca1; j++)
			{
				if(v[j]>v[j+1]) 
				{
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
					ultimaTroca2 = j;
				}
			}
			ultimaTroca1 = ultimaTroca2;
		}
		for(int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
	}
//---------------------------------------------------//------------------------------------------------------//

}




