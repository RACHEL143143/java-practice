import java.util.Scanner;

public class Cprofit {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int cost=sc.nextInt(); 
    int sell=sc.nextInt();
    int a=sell-cost;
    if(a>0){
       System.out.println("profit");
    }else{
        System.out.println("loss");
    }
}
}
