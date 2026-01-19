import java.util.Scanner;

public class Lproduct {
      public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int pro=1;
    while(n>0){
        int a=n%10;
        pro*=a;
        n/=10;
    }
    System.out.println(pro);
}
}
