import java.util.Scanner;
class num{
    Scanner sc=new Scanner(System.in);
    int temp,num,sum,rem,number;
    public void getNumber(){
        System.out.println("Enter the number:");
        temp=sc.nextInt();
        num=temp;
    }
    public int checknum(){
        if(num!0){
            rem=num%10;
            sum=(sum*10)+ rem;
            num=num/10;
            return checknum();
        }
        if(temp==sum){
            Sysyem.out.println("number is palindrome:");
        }else{
            System.out.println(" number is not palindrome:");

        }
        return 1;
    }
}
public class Palindrome{
    public static void main(String[] args)
    {
        num pl=new new num();
        pl.getNumber();
        pl.checknum();
    }
}