import java.util.Scanner;
class complex1{
    Scanner sc=new Scanner(System.in);
    double real1,real2,sum1,sum2,sum3,diff1,diff2,prod1,prod2;
    int img1,img2;
    public void getNumber()
    {
        System.out.println("Enter the 1st number:");
        System.out.println("Enter the real number:");
        real1=sc.nextInt();
        System.out.println("Enter the imaginary number:");
        img1=sc.nextInt();
        System.out.println("Enter the 2nd number:");
        System.out.println("Enter the real number:");
        real2=sc.nextInt();
        System.out.println("Enter the imaginary number:");
        img2=sc.nextInt();


    }
    public void diff(){
        diff1=real2-real1;
        diff2=img2-img1;
        System.out.println("the difference of numbers is:"+proud1+ "+"
        +prod2+"i");
    }
}
public class complex
{
    public static void main(String[] args){
        complex1 c1=new complex1();
        c1.getNumber();
        c1.sum();
        c1.diff();
        c1.mul();

    }
}