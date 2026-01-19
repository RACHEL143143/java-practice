import java.util.Scanner;

public class Levenodd {
    
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int sum1=0,sum2=0;
    while(n>0){
        int a=n%10;
        if(a%2==0){
           sum1+=a;
        }else{
            sum2+=a;
        }n/=10;
    }
    System.out.println(sum1-sum2);
    }
}
