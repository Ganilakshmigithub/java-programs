import java.util.*;
class binary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter array size: ");
        int size=sc.nextInt();
        System.out.println("enter elements: ");
        int[] numbers=new int[size];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
    Arrays.sort(numbers);   //binary search only works on sorted array
    for(int i=0;i<numbers.length;i++){
        System.out.print(numbers[i]+" ");
    }
    System.out.println();
    System.out.println("element found at index of "+binarysearch(numbers,4));
     System.out.println("element found at index of "+binarysearch(numbers,21));
      System.out.println("element found at index of "+binarysearch(numbers,8));
       System.out.println("element found at index of "+binarysearch(numbers,6));
    }
    public static int binarysearch(int nums[],int n){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==n){
                return mid;
            }
            else if(nums[mid]<n){
                low=mid+1;
            }
            else{
               high=mid-1; 
            }
        }
        return -1;
    }
}

