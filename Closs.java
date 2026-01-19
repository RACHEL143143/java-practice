import java.util.Scanner;

public class Closs {
     public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int cost=sc.nextInt();
    int sell=sc.nextInt();
    int a=sell-cost;
    if(a<0){
        System.out.println("loss");
    }else{
        System.out.println("profit");
    }
}
}
