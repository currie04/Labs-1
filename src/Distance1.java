public class Distance1 {
    public static void main( String[] args) {
            int myNum1 = Integer.parseInt(args[0]);
            int myNum2 = Integer.parseInt(args[1]);
            int Bigger = Math.max(myNum1, myNum2);
            int Smaller = Math.min(myNum1, myNum2);
            System.out.println(Bigger - Smaller);
        }
    }

