import java.util.Scanner;
public class patter{
    int no, num;
    void printpattern(int n,int k){
        if (Math.abs(n)<=num){
            if(n>0){
                System.out.print(" "+n);
                printpattern(n-k, k);
            }
            if(n<=0){
                no=n;
                System.out.print(" "+no);
                no=Math.abs(no);
                while (Math.abs(no)<num){
                    no= no-k;
                    System.out.print(" "+Math.abs(no));
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of n:");
        int n=sc.nextInt();
        System.out.println("enter the value of k:");
        int k=sc.nextInt();
        Pattern p=new Pattern();
        p.num=n;
        p.printpattern(n ,k);
    }
}