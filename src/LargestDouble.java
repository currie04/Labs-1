public class LargestDouble {
    public static void main(String[] args) {
        double myNum1 = Double.parseDouble(args[0]);
        double myNum2 = Double.parseDouble(args[1]);
        double bigger = Math.max(myNum1, myNum2);
        System.out.println(bigger);
    }
}
