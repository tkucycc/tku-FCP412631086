package 正課;

import java.util.Scanner;

public class hm_08 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("姓名");
        String n1 = scn.next();
        System.out.print("年齡");
        String n2= scn.next();
        System.out.print("城市");
        String n3= scn.next();

        System.out.println(n1+","+n2+","+n3);
        scn.close();

        
    }
}
