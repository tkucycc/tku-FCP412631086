package 正課;
import java.util.Scanner;
public class hm_06 {
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("輸入一個整數");  
    int n1 = scn.nextInt();
    System.out.print("輸入第二個整數");
    int n2 = scn.nextInt();
    int a=n1+n2;
    System.out.println(a);
    scn.close();
    }

    
}
