
public class Quicksort {
	private static void quicksort(int[] vetor, int esq, int dir) 
	{
		if(esq<dir) 
		{
			int j = separar(vetor, esq, dir);
			quicksort(vetor, esq, j-1);
			quicksort(vetor, j+1, dir);
		}
		
	}

	private static int separar(int[] vetor, int esq, int dir) {
		int i = esq+1;
		int j = dir;
		int pivo = vetor[esq];
		while(i <= j) {
			if(vetor[i] <= pivo ) i++;
			else if(vetor[j] > pivo) j--;
			else if(i<=j) 
			{
				trocar(vetor,i,j);
				i++;
				j--;
			}
		}
		trocar(vetor, esq,j);
		return j;
	}

	private static void trocar(int[] vetor, int i, int j) 
	{
		int aux = vetor[i];
		vetor[i] = vetor[j];
		vetor[j] = aux;
	}
	
}