public class SecondLargest{
    public static void main(String[] args){
        int[] arr=new int[]{1,2,3,4,5};
        int firstmax;
        int secondmax;
        if(arr[0]>arr[1]){
            firstmax=arr[0];
            secondmax=arr[1];
        }
        else{
            firstmax=arr[1];
            secondmax=arr[0];
        }
        for(int i=2;i<arr.length;i++){
            if(arr[i]>firstmax){
                secondmax=firstmax;
                firstmax=arr[i];
            }
            else if(arr[i]>secondmax){
                secondmax=arr[i];
            }
        }
        System.out.println("second largest Element in the array" + secondmax);
      
    }
}