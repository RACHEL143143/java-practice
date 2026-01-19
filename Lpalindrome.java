import java.util.Scanner;

public class Lpalindrome {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=n;
    int a=0;
    while(n>0){
        int b =n%10;
       a=a*10+b;
       n/=10;

    }
    if(num==a){
        System.out.println("palindrome");
    }else{
        System.out.println("not");
    }
}
}
