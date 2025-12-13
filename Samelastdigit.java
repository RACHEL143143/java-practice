import java.util.Scanner;

public class Samelastdigit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c=a%10;
       int d=b%10;
       if(c==d){
        System.out.println("last digit are equal");
       }else{
        System.out.println("last digit not equal");
       }

       }
}
