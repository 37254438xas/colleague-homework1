import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn =new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z=scn.nextInt();
        if (x%4!=0){
            System.out.println("false");
        }else if (x%100==0&&x%400!=0){
            System.out.println("false");
        }else {
            System.out.println("true");
        }

        if (y%4!=0){
            System.out.println("false");
        }else if (y%100==0&&y%400!=0){
            System.out.println("false");
        }else {
            System.out.println("true");
        }

        if (z%4!=0){
            System.out.println("false");
        }else if (z%100==0&&z%400!=0){
            System.out.println("false");
        }else {
            System.out.println("true");
        }
//        if ((x%4==0 && x%100!=0 ) || (x%400 ==0)){
//            System.out.println("閏年");
//        } else{
//     System.out.println("平年");
//        }

    }
}
