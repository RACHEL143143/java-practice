import java.util.Scanner;

public class Ldescen {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean a=false;
    while(n>0){
        int last=n%10;
        int prev=(n/10)%10;
        if(prev>last){
         a=true;
        }n/=10;
    }
    if(a){
        System.out.println("descending");
    }else{
        System.out.println("not");
    }
}
}
