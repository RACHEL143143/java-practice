import java.util.Scanner;

public class Lneon {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=n*n;
    if(n==9 ||a%10==9){
        System.out.println("neon number");
    }else{
        System.out.println("not neon");
    }
    }
}
