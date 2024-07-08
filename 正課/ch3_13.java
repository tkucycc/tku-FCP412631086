package 正課;
import java.util.Scanner;
public class ch3_13 {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("What's your name?");
        String name =scn.next();
        System.out.println("How old are you?");
        int age =scn.nextInt();
        System.out.println(name+", "+age+" Years old.");
        scn.close();

    }
}
