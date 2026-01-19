import java.util.Scanner;

public class Lcheck {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=2;
    while(n>0){
        int a=n%10;
        if(num==a){
            System.out.println("yes");
        }
        n/=10;
    }
}
}
