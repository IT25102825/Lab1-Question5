public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int m1 = calc.multiply(3, 4);
        int m2 = calc.multiply(5, 7);
        int sum1 = calc.add(m1, m2);
        int result1 = calc.square(sum1);
        
        System.out.println("Result of (3 * 4 + 5 * 7)^2 = " + result1);

        int sum2 = calc.add(4, 7);
        int sq1 = calc.square(sum2);
        
        int sum3 = calc.add(8, 3);
        int sq2 = calc.square(sum3);
        
        int result2 = calc.add(sq1, sq2);
        
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 = " + result2);
    }
}
