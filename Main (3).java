import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn =new Scanner(System.in);
        int chi =scn.nextInt();
        int math =scn.nextInt();
        int eng =scn.nextInt();
        System.out.println(chi+math+eng);
        System.out.println((chi+math+eng)/3f);
    }
}
