public class sample {
    public static void main(String[] args) {
        // ===== Implicit Casting (පුළුල් කිරීම - Widening) =====
        // කුඩා වර්ගයක් විශාල වර්ගයකට පරිවර්තනය කිරීම (Auto)
        int intValue = 100;
        long longValue = intValue;      // int -> long (Auto)
        float floatValue = longValue;    // long -> float (Auto)
        double doubleValue = floatValue; // float -> double (Auto)
        
        System.out.println("Implicit Casting (Widening):");
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);
        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);
        
        // ===== Explicit Casting (පටු කිරීම - Narrowing) =====
        // විශාල වර්ගයක් කුඩා වර්ගයකට පරිවර්තනය කිරීම (Manual)
        double doubleNum = 99.99;
        int intNum = (int) doubleNum;    // double -> int (Data loss!)
        byte byteNum = (byte) intNum;    // int -> byte (Data loss!)
        
        System.out.println("\nExplicit Casting (Narrowing):");
        System.out.println("double: " + doubleNum);
        System.out.println("int (after casting): " + intNum);
        System.out.println("byte (after casting): " + byteNum);
        
        // ===== String to Number (String එක Number එකකට) =====
        System.out.println("\n=== String to Number ===");
        String strNumber = "123.45";
        double parsedDouble = Double.parseDouble(strNumber);
        int parsedInt = Integer.parseInt("456");
        
        System.out.println("String: \"" + strNumber + "\" -> double: " + parsedDouble);
        System.out.println("String: \"456\" -> int: " + parsedInt);
        
        // ===== Number to String (Number එක String එකකට) =====
        System.out.println("\n=== Number to String ===");
        int num = 789;
        String strNum = String.valueOf(num);
        String strNum2 = Integer.toString(num);
        
        System.out.println("int: " + num + " -> String: \"" + strNum + "\"");
        System.out.println("int: " + num + " -> String: \"" + strNum2 + "\"");
        
            // ===== Auto-boxing & Unboxing (Primitive <-> Wrapper) =====

        System.out.println("\n=== Auto-boxing & Unboxing ===");
        // Auto-boxing: Primitive -> Wrapper (Auto)
        Integer wrapperInt = 50;  // int -> Integer
        Double wrapperDouble = 25.5;  // double -> Double
        
        // Unboxing: Wrapper -> Primitive (Auto)
        int primitiveInt = wrapperInt;  // Integer -> int
        double primitiveDouble = wrapperDouble;  // Double -> double
        
        System.out.println("Wrapper Integer: " + wrapperInt);
        System.out.println("Primitive int: " + primitiveInt);
        System.out.println("Wrapper Double: " + wrapperDouble);
        System.out.println("Primitive double: " + primitiveDouble);
    }
}
