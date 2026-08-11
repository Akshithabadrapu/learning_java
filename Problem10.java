public class Problem10 {
    //to check palindrome,keep the original number
    public static void main(String a[]){
        int i=121;
        int original=i;
        int rev=0;
        while(i!=0){
            int digit=i%10;
            rev=rev*10+digit;
            i=i/10;
        }
        if(original==rev){
            System.out.println("it is a palindrome");
        }
        else 
            System.out.println("it is not a palindrome");
    }
    }
