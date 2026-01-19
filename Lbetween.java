import java.util.Scanner;

public class Lbetween {
      public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    char d=sc.next().charAt(0);
    char b=sc.next().charAt(0);
    for(char i=(char)(d+1);i<b;i++){
          System.out.println(i);

    }
}
}
