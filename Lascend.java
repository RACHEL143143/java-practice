import java.util.Scanner;

public class Lascend {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    boolean a=true;
    while(n>0){
        int last=n%10;
        int prev=(n/10)%10;
        if(prev>last){
            a=false;
        }n/=10;
    }
    if(a){
        System.out.println("ascending");
    }else{
        System.out.println("no");
    }
}
}
