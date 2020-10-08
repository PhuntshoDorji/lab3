public class Insertion {  

    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int i = 0; i < n-1; i++) {  
            int k = array[i];  
            for (int j = i + 1; j>0 && Compare(j-1, j, array) ;j-- ) {
                int temp = array[j-1];
                array[j-1] = array[j];
                array[j] = temp;
            }       
            }
        } 
        public static boolean Compare(int i, int j, int[] array){
            if (array[i] > array[j]) {
                return true;  
            }
            return false;   
        }   
    public static void main(String a[]){    
        int[] arr = {7,4,8,2,3,0,9};    
        Insertion obj = new Insertion();
        System.out.println("Before Insertion Sort");    
        for(int i = 0; i < arr.length; i++){    
            System.out.print(arr[i]);    
        }    
        System.out.println("");
        obj.insertionSort(arr);
        System.out.println("After Insertion Sort"); 
          for(int i = 0; i < arr.length; i++){    
            System.out.print(arr[i]);    
        }   
    }
}
