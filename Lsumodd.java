import java.util.Scanner;

public class Lsumodd {
   
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sums=0,sumq=0;
    while(n>0){
        int a=n%10;
        sums+=a*a;
        sumq+=a*a*a;
        n/=10;
    }
    
    System.out.println("square:"+sums);
    System.out.println("CUBE:"+sumq);
}
}
