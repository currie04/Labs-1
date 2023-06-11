public class Distance2 {
    public static void main(String[] args) {
        int myNum1 = Integer.parseInt(args[0]);
        int myNum2 = Integer.parseInt(args[1]);
        int subtraction = myNum1 - myNum2;
        System.out.println(Math.abs(subtraction));
    }
}
