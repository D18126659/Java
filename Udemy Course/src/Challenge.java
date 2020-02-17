public class Challenge {

    public static void main(String[] args) {
        //Step 1
        double variable_1 = 20.00;
        //step 2
        double variable_2 = 80.00;
        // Step 3
        double final_result = variable_1 + variable_2 * 100;
        System.out.println(final_result);
        //step 4
        double theremainder= final_result%40;
        System.out.println(theremainder);
        //step 5
        boolean ifremainder = (theremainder == 0) ? true : false;
        System.out.println(ifremainder);
    }
}
