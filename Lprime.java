import java.util.Scanner;

public class Lprime {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean prime=true;
    if(n<=1){
        prime=false;
    }
    for(int i=3;i<n/2;i++){
        if(n%i==0){
            prime=false;
        }
    }
    if(prime){
        System.out.println("prime");
    }else{
        System.out.println("not");
    }
    }
}
