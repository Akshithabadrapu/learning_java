public class Method2{
    public void printstars(int rows){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String a[]){
        Method2 obj = new Method2();
        obj.printstars(5);
    }
}