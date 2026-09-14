import java.util.Random;

public class MathClass {
    public static void main(String[] args) {
        // ===== Basic Math Operations =====
        System.out.println("=== Basic Math Operations ===");
        System.out.println("PI: " + Math.PI);
        System.out.println("E: " + Math.E);
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));
        System.out.println("Min of 10 and 20: " + Math.min(10, 20));
        System.out.println("Absolute of -5: " + Math.abs(-5));
        System.out.println("Square root of 25: " + Math.sqrt(25));
        System.out.println("2^3 = " + Math.pow(2, 3));
        System.out.println("Cube root of 27: " + Math.cbrt(27));
        
        // ===== Rounding =====
        System.out.println("\n=== Rounding ===");
        double num = 4.7;
        System.out.println("ceil(4.7) = " + Math.ceil(num));  // 5.0 (ඉහළට)
        System.out.println("floor(4.7) = " + Math.floor(num)); // 4.0 (පහළට)
        System.out.println("round(4.7) = " + Math.round(num)); // 5 (ළඟම)
        System.out.println("round(4.4) = " + Math.round(4.4)); // 4
        
        // ===== Trigonometry =====
        System.out.println("\n=== Trigonometry ===");
        double angleDegrees = 45;
        double angleRadians = Math.toRadians(angleDegrees);
        System.out.println("sin(45°) = " + Math.sin(angleRadians));
        System.out.println("cos(45°) = " + Math.cos(angleRadians));
        System.out.println("tan(45°) = " + Math.tan(angleRadians));
        
        // ===== Random Numbers =====
        System.out.println("\n=== Random Numbers ===");
        // ක්‍රමය 1: Math.random() - 0.0 සිට 1.0 අතර
        System.out.println("Math.random(): " + Math.random());
        System.out.println("Random between 0-9: " + (int)(Math.random() * 10));
        System.out.println("Random between 1-10: " + (int)(Math.random() * 10 + 1));
        
        // ක්‍රමය 2: Random class
        Random random = new Random();
        System.out.println("Random int: " + random.nextInt());
        System.out.println("Random int (0-99): " + random.nextInt(100));
        System.out.println("Random double: " + random.nextDouble());
        System.out.println("Random boolean: " + random.nextBoolean());
    }
}