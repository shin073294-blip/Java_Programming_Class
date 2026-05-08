import java.util.Scanner;


public class MySquareBlock {

public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    System.out.println("Please Enter The Character");
    char character = sc.next() .charAt(0);

    System.out.println("Please Enter Numbers Of Lines");
    int lines = sc.nextInt();

    for (int i = 1; i <= lines; i++) {

        for (int j = 1; j <= lines; j++) {
            System.out.print(character);
        }

        System.out.println();
    }
}

}
