public class Operators {

    public static void main(String[] args) {

        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("Previous Result = " +previousResult);
        result = result - 1;    // 3 - 1 = 2
        System.out.println("3 - 1 = "+ result);
        System.out.println("Previous Result = " +previousResult);

        result = result * 10;  // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;  // 2 / 10 = 20
        System.out.println("2 / 10 = " + result);

        result++;
        System.out.println(result);
        result--;
        System.out.println(result);
        result += 2;
        System.out.println(result);
        result*=10;
        System.out.println(result);
        result%=2;
        System.out.println(result);

    }
}
