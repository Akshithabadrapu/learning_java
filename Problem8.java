public class Problem8 {
    //sum of even numbers from 1 to 50
    public static void main(String a[]){
        int i=1;
        int sum=0;
        while(i<=50){
            if(i%2==0){
                System.out.println(i);
                sum=sum+i;
            }
            i++;
        }
         System.out.println(sum);
 }
    
}
