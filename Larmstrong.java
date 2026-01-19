import java.util.Scanner;

public class Larmstrong {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=n;
    int a=0;
    while(n>0){
        int b =n%10;
       a+=b*b*b;
        n/=10;
    }
    if(num==a){
        System.out.println("armstrong");
    }else{
        System.out.println("not");
    }
}
}
