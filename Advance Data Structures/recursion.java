//RECURSION : It is a method that calls itself..

// normal method calling in java :

// class ABC {
//     static void student(){

//     }
// }

// //method calling

// ABC a= new ABC (),
// a.student(),

// ABC.student();

// }




//RECURSION :

//4 types of recursion are :

// 1. Direct recursion : A function that calls itself.
// 2. Indirect recursion : A function that calls another fucntion which in turn calling
// 3. Tail Recursion :
// 4. Head recursion : 


//WE HAVE TO FIND THE POSITION OF A TARGET ELEMENT IN A SORTED ARRAY WITH THE HELP OF RECURSION :

//best case : O(1)
//worst case : log(n)


public class recursion{
    public static int binarySearch(int[]arr,int target,int left, int right){
        if(left>right){
            //when the left portion of array will be greter than right,
            //then the ele will not found..
            return -1;
        }
        int mid=left+(right-left)/2;
        if(arr[mid]==target){
            return mid;
        }else if(arr[mid]>target){
            return binarySearch(arr, target, left, mid-1);
        }else{
            return binarySearch(arr, target, mid+1, right);
        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7};
        int target=9;
        int index=binarySearch(arr,target,0,arr.length-1);
        System.out.println(index);
    }

}