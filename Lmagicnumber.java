import java.util.Scanner;

public class Lmagicnumber {
      public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;
    int sum2=0;
    while(n>0){
        int a=n%10;
        sum+=a;
        n/=10;
    }
    if(sum>9){
        while(n>0){
        int a=n%10;
        sum2+=a;
        n/=10;
    }
    }
    if(sum2==1){
        System.out.println("magic number");
    }else{
        System.out.println("not");
    }
}
}
