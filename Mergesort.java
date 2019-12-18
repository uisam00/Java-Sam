
public class Mergesort {
	//=============mergeSort1=============//
	public static void mergeSort(int[] vetor, int[]w, int ini, int fim) {
		if(ini < fim) {
			int meio = (ini + fim)/2;
			mergeSort(vetor, w, ini, meio);
			mergeSort(vetor, w, meio+1,fim);
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
	//=============mergeSort2=============//
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




