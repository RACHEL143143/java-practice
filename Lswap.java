import java.util.Scanner;

public class Lswap {
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=n%10;
    int c=n%100;
    int d=c/10;
    int b=n/100;
    System.out.println(a +""+d+""+ b);
    }
}
