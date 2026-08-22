public class IsSorted{
    public static void main(String[] args){
        int[] arr=new int[]{2,5,10,1,4};
        boolean issorted=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                issorted=false;
            }
        }
        System.out.println("is sorted =" + issorted);
    }
}