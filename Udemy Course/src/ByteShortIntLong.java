public class ByteShortIntLong {
    public static void main(String[] args) {

        int value = 1000;
        int MinValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value is:" + maxValue);
        System.out.println("Integer minimum value is:" + MinValue);
        System.out.println("\nbusted minimum value is:" + (maxValue - 1));
        System.out.println("busted minimum value is:" + (MinValue + 1));


    }
}
