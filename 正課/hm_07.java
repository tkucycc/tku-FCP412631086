package 正課;
import java.util.Scanner;
public class hm_07 {
public static void main(String[] args) {
    Scanner scn= new Scanner(System.in);
    System.out.print("輸入圓半徑");
    int n1 = scn.nextInt();
    
    System.out.printf("面積:%.2f",n1*n1*Math.PI);
    scn.close();
}    
}
