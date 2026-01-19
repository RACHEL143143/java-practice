import java.util.Scanner;

public class alphapattern {
       public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();

    for(int i=1;i<=n;i++){
        char k='a';
        int b=1;
        for(int j=1;j<=n;j++){
            if(i+j>=n+1){
                if(i%2==0){
                System.out.print(k+++" ");
            }else{
                System.out.print("  ");
            }
        }
    }
        for(int j=1;j<=n;j++){
            if(i>j){
               System.out.print()
            }else{
                System.out.print("  ");
            }

        }System.out.println();
    }
}
    }
