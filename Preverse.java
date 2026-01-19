import java.util.Scanner;

public class Preverse {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1,k=n;i<=n;i++,k--){
       int p=k;
        for(int j=1;j<=n;j++){
            if(i+j>=n+1){
                System.out.print(p--+" ");
            }else{
                System.out.print(" ");
            }
        }System.out.println();;
    }
}
}
