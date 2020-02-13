import java.util.Scanner;

public class PoundsToKg {
    public static void main(String[] args) {
        float pounds;

        Scanner input = new Scanner(System.in);
        System.out.println("1 pound is 0.45359237kg");
        System.out.println("Please input a weight: ");
        pounds = input.nextFloat();

        float result = (float) (pounds *0.45359237);
        System.out.println("Your weight in Kg is: " + result);

    }
}

