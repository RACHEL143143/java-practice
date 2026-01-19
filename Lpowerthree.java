import java.util.Scanner;

public class Lpowerthree {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n%3==0){
        n/=3;
    }

    if(n==1){
        System.out.println("power");
    }else{
        System.out.println("no");
    }
}
}
