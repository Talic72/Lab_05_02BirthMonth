import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your birth month between 1-12:");
        int inputZ = in.nextInt();

        if(inputZ > 12 || inputZ < 1) {
            System.out.println("You entered an incorrect month value: " + inputZ);
        }
        else {
            System.out.println("Your birth month is " + inputZ);
        }
    }
}