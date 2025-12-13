import java.util.Scanner;

public class Clastoddeven {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;    
        System.out.println((b%2==0)?"even":"odd");
}}