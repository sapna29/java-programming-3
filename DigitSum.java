import java.util.Scanner;
public class DigitSum{
    int n,sum=0;
    public static void main(String[] args)
    {
        Scanner.sc=new Scanner(System.in);
        n=sc.nextInt();
        DigitSum ds=new DigitSum();
       System.out.println("sum:"+ds.add(n));
    }
int add(int n){
        sum=n%10;
        if(n==0){
            return 0;
        }else{
            return sum + add(n/10)
        }
}
}