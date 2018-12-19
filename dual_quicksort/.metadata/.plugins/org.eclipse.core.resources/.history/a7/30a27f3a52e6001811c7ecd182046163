import java.util.Random;

public class MergeSort {
	static void mergeSort(int[] array, int low, int high){
		if(low < high){
			int middle = (low + high) / 2;
			mergeSort(array, low, middle);
			mergeSort(array, middle+1, high);
			merge(array, low, middle, high);
		}
	}

	static void merge(int[] array, int low, int middle, int high){
		int i = low;
		int j = middle + 1;
		int k = low;
		int temp[] = new int[array.length];
		while(i<=middle && j<=high){
			if(array[i] < array[j]){
				temp[k++] = array[i++];
			}else{
				temp[k++] = array[j++];
			}
		}
		while(i<=middle){
			temp[k++] = array[i++];
		}
		while(j<=high){
			temp[k++] = array[j++];
		}
		for(int m=low; m<high; m++){
			array[m] = temp[m];
		}
	}
	public static void main(String[] args) {
		Random random = new Random();
		int[] arr = new int[3200000];
		for (int i = 0; i < arr.length; i++ )
			arr[i] = random.nextInt(3200000);
		long start_time = System.currentTimeMillis();
		mergeSort(arr, 0, arr.length-1);
		long end_time = System.currentTimeMillis();

		System.out.println("computation time = " + (end_time - start_time) + "ms");



	}
}


