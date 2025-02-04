//quicksort algorithm 

//O(n) on an average 
// O(n^2) in a worst case

//in this quick sort approach, we will not sort the whole array, we will firstly partition the array and then we will sort it on the basis of pivot index.


public class quickselectapproach {
    public static int findSmallEle(int[] arr, int k){
        // return quickselect(arr,left:0,arr.length-1,k-1);
        return quickselect(arr,0, arr.length-1, k-1);

    }
    private static int quickselect(int[] arr, int left, int right,int k){
        int pivotIndex=partition(arr,left,right);
        if(pivotIndex==k){
            return arr[k];
        }else if(pivotIndex>k){
            return quickselect(arr,left,pivotIndex-1,k);
        }else{
            return quickselect(arr,pivotIndex+1,right,k);
        }
    }
    private static int partition(int[]arr,int left, int right){
        int pivot=arr[right];
        int i=left;
        for(int j=left;j<right;j++){
            if(arr[j]<=pivot){
                swap(arr,i,j);
                i++;
            }
        }
        swap(arr,i,right);
        return i;
    }
    private static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int []arr={10,9,4,6,11,13,2,7};
        int k=3;
        System.out.println("#rd smallest element is: "+findSmallEle(arr,k));
    }

}