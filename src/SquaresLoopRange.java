public class SquaresLoopRange {
    public static void main(String[] args) {
        int EndNumber = Integer.parseInt(args[1]);
        for (int StartNumber = Integer.parseInt(args[0]); StartNumber <= EndNumber; StartNumber++) {
            if (StartNumber > EndNumber) {
                System.out.println("Start-limit greater than stop-limit!");
            } else {
                System.out.print((int) Math.pow(StartNumber, 2) + " ");
            }
        }
        System.out.println();
    }
}
