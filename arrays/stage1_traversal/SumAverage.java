public class SumAverage{
    public static void main(String[] args){
        int[] arr=new int []{10,30,40,46,20};
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("sum of the array:" + sum);
        double average=(double)sum/arr.length;
        System.out.println("average of the array:" + average);
    }
}