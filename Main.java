package codes;
import java.util.Scanner;

public class Main extends incryp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter your choice \n 1.Encrypt code \n2.Decode a code\n ");
       int c = in.nextInt();

        switch (c) {
            case 1: coder();
                      break;

            case 2:decoer();
                    break;
            default:
                System.out.println("enter valid choice");
        }

    }
    public static void decoer(){
        Scanner in = new Scanner(System.in);
        Main ob1 = new Main();
        System.out.println("Enter the code u wanna decode");
        String s1 = in.nextLine();
        System.out.println("Enter key for decoding");
        int r1 = in.nextInt();
        ob1.decry(s1, r1);
    }
    public static void coder()
    {    Main ob1 = new Main();
        Scanner in = new Scanner(System.in);
        ob1.setRn();
        System.out.println("enter msg u wanna encrypt");
        String msg = in.nextLine();
        ob1.setMsg(msg);

        int r = ob1.getRn();
        String s = ob1.getMsg();
        System.out.println("your msg is encrypted to='" + s + "'");
        System.out.println("your key for decoding is " + r);

    }
}






