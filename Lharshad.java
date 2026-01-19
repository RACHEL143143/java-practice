import java.util.Scanner;

public class Lharshad {
      public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    while(n>0){
        int a=n%10;
        sum+=a;
        n/=10;
    }
    if(n%sum==0){
        System.out.println("harshad");
    }else{
        System.out.println("not");
    }

}
}
