import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter an Integer: ");
        int num = scanner.nextInt();


        do {
            System.out.println(num);
            num--;

        } while (num >= 0);

        
    }
}