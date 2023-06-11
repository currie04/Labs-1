public class SaferQuadraticSolver {
    public static void main(String[] args) {
        double A = Double.parseDouble(args[0]);
        double B = Double.parseDouble(args[1]);
        double C = Double.parseDouble(args[2]);
        if (Math.pow(B, 2) - 4 * A * C < 0) {
            System.out.println("Equation is not solvable for real x.");
        } else if (A == 0) {
            System.out.println("A = 0. Cannot solve equation.");
        } else {
            System.out.println((-B + Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A));
            System.out.println((-B - Math.sqrt(Math.pow(B, 2) - 4 * A * C)) / (2 * A));
        }
    }
}
