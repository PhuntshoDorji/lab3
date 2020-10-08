public class Selection{

	public static void SelectionSort(int[] arr1){
		for(int i = 0; i <= arr1.length - 1; i++){
			int index = i;

			for(int j = i + 1; j < arr1.length; j++){
				if (arr1[j] < arr1[index]){  
                   index = j;//searching for lowest index  
                }  
            }  
            int min = arr1[index];   
            arr1[index] = arr1[i];  
            arr1[i] = min; 
			}
		}
	
	public static void main(String[] args) {
		int[] arr = {7,4,8,2,3,0,9};

		System.out.print("Array Before Sorting:");
		for (int i = 0; i < arr.length; i++ ) {
			System.out.print(arr[i]);
		}

		SelectionSort(arr);
		System.out.println("After Selection Sort");  
        for(int i:arr){  
            System.out.print(i+" ");  
        }
	}
}
