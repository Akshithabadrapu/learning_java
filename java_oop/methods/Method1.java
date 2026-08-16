public class Method1 {
    public void printtable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+"*i"+"="+(n*i));
        }
    }
    public static void main(String a[]){
        Method1 obj = new Method1();
        obj.printtable(3);
    }
    
}
