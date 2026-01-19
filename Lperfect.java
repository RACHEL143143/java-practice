import java.util.Scanner;

public class Lperfect {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int num=n;
    int sum=0;
    for(int i=1;i<n;i++){
        if(n%i==0){
           sum+=i;
        }
    }
    if(num==sum){
        System.out.println("perfect");
    }else{
        System.out.println("not");
    }
}
}
