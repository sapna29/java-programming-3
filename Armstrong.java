import java.util.Scanner;
public class Armstrong
{
    Scanner sc=new Scanner(system.in);
    int num, temp, rem, result=0;

    public int getData() {
        System.out.print("Enter any number:");
        num=sc.nextInt();
        System.out.print("number of digit you entered:");
        n=sc.nextInt();
        temp=num;
    }

   public void checkData(){
        while(temp!=0)
        {
            rem=temp%10;
            result +=Math.pow(rem,n);
            temp/=10;
        }
        if(result==num)
        {
            System.out.println(num +"number is an armstrong:");
        }
        else {
            System.out.println(num+"number is not an armstrong");
        }
    }
    public static void main(String[] args){
        Armstrong am=new Armstrong();
        am.getData();
        am.checkData();
    }
}