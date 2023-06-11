public class PolarCoordinates {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        double R = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
        double theta = Math.atan2 (y, x);
        System.out.println(R);
        System.out.println(theta);
    }
}
