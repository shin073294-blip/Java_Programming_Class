import java.util.Arrays;
import java.util.Scanner;

public class My_Name {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please Enter Your Name");
        String name = sc.next();

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
        }
    }
}
