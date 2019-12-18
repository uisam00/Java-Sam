
public class Quick {

	public static void main(String[] args) {
		int []v = {6,5,1,9,2,3,4};
		int[] w = new int[v.length];
		//selectionSort(v);
	//	quicksort(v,0,v.length-1);
		margeSort(v,w, 0, v.length-1);
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
		
	}

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
	
	public static void selectionSort(int [] v) {
		int min,aux;
		for (int i = 0; i < v.length; i++) {
			min = i;
			for (int j = i; j < v.length; j++) 
			{
				if(v[min] > v[j]) 
					min = j;
			}
			if(min != i) {
				aux = v[min];
				v[min] = v[i];
				v[i] = aux;
			}
		}
		for(int i = 0; i < v.length; i++)
			System.out.print(v[i] + " ");
	}
	
	public static void margeSort(int[] vetor, int[]w, int ini, int fim) {
		if(ini < fim) {
			int meio = (ini + fim)/2;
			margeSort(vetor, w, ini, meio);
			margeSort(vetor, w, meio+1,fim);
			intercala(vetor, w, ini, meio, fim);
		}
	}

	private static void intercala(int[] vetor, int[] w, int ini, int meio, int fim) {
		for (int k = ini; k <= fim; k++) 
			w[k] = vetor[k];
		
		int i = ini;
		int j = meio + 1;
		
		for (int k = ini; k <= fim; k++) {
			if( i > meio) 
				vetor[k] = w[j++];
			else if(j > fim)
				vetor[k] = w[i++];
			else if(w[i] < w[j])
				vetor[k] = w[i++];
			else
				vetor[k] = w[j++];
		}
	}
	public static void mergesort(int[] a, int start, int end ){
        if (start<end) {
            int middle =    (start+end)/2;
            mergesort (a, start, middle);
            mergesort(a, middle+1, end);
            
            merge(a, start, middle, end);
        }
    }
    public static void merge (int[] a,int start,int middle,int end){
        int b[] = new int [a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        int i = start;
        int j = middle+1;
        int k = start;
        
        while(i<=middle && j<=end){
            if (b[i] <= b[j]) {
                a[k++]  = b[i++];            
            }else{
                a[k++] = b[j++];
            }
        }
        while(i<=middle){
            a[k++] = b[i++];
        }
    }
}




