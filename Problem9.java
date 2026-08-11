public class Problem9 {
    //reverse a number
    public static void main(String a[]){
    int i=1234;
    int rev=0;
    while(i!=0){
        int digit =i%10;
        rev=rev*10+digit;
        i=i/10;
    }
    System.out.print(rev);
}
}
