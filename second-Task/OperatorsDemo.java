public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;
        
        // Arithmetic Operators (ගණිතමය)
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus (Remainder): " + (a % b));
        
        // Comparison Operators (සංසන්දනාත්මක)
        System.out.println("Is a equal to b? " + (a == b));
        System.out.println("Is a greater than b? " + (a > b));
        System.out.println("Is a less than b? " + (a < b));
        
        // Logical Operators (තාර්කික)
        boolean x = true;
        boolean y = false;
        System.out.println("AND: " + (x && y));  // true && false = false
        System.out.println("OR: " + (x || y));   // true || false = true
        System.out.println("NOT: " + (!x));      // !true = false
    }
}