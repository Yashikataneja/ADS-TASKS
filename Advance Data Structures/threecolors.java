//three color technique in sorting 

public class threecolors {
    public static  void sortColo(int [] arr){
        int count0=0,count1=0,count2=0;
        for(int num:arr){
            if(num==0)count0++;
            else if(num==1)count1++;
            else count2++;
        }
        int i=0;
        while(count0-->0)arr[i++]=0;
        while(count1-->0)arr[i++]=1;
        while(count2-->0)arr[i++]=2;
    }

    public static void main(String[] args) {
        int[]arr={2,0,2,1,1,0};
        sortColo(arr);
        System.out.println("sorted array : "+java.util.Arrays.toString(arr));
    }
}



