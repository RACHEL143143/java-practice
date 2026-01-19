import java.util.Scanner;

public class Lautomorphic {
      public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=n;
    int pow=1;
    int sq=n*n;
    while(n>0){
        pow*=10;
        n/=10;
    }
    if(sq%pow==num){
        System.out.println("auto");
    }
}
}
