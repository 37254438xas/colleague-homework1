import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        int x =scn.nextInt();
        int y =scn.nextInt();
        int z =scn.nextInt();
        if (x>y||y>z){
            System.out.println("False");
        }else {
            if (x+y<z||x+z<y||y+z<x){
                System.out.println("False");
            }else {
                System.out.println("True");
            }
        }
    }
}
