public class QuadraticSolver {
    public static void main(String[] args) {
        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        double C = Double.parseDouble(args[2]);
        System.out.println((-B + Math.sqrt(Math.pow(B, 2) - 4*A*C))/(2*A));
        System.out.println((-B - Math.sqrt(Math.pow(B, 2) - 4*A*C))/(2*A));
    }
}
