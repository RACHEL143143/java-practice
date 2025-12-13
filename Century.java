import java.util.Scanner;

public class Century {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
       int y=sc.nextInt();
      if(y%100==0){
        System.out.println("century");
      }else{
        System.out.println("not a century");
      }
    }
}
