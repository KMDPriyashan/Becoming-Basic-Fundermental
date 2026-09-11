public class sample {
    public static void main(String[] args) {
        String text = "  Hello, Welcome to Java Programming!  ";
        
        System.out.println("Original Text: \"" + text + "\"");
        System.out.println("Length: " + text.length());
        
        // ===== Trim (හිස් තැන් ඉවත් කිරීම) =====
        String trimmed = text.trim();
        System.out.println("Trimmed: \"" + trimmed + "\"");
        
        // ===== Case conversion (ලොකු/පොඩි අකුරු) =====
        System.out.println("Uppercase: " + trimmed.toUpperCase());
        System.out.println("Lowercase: " + trimmed.toLowerCase());
        
        // ===== Substring (කොටසක් ගැනීම) =====
        System.out.println("Substring (0-7): " + trimmed.substring(0, 7));
        System.out.println("Substring (from 7): " + trimmed.substring(7));
        
        // ===== Replace (ප්‍රතිස්ථාපනය) =====
        String replaced = trimmed.replace("Java", "Python");
        System.out.println("Replaced: " + replaced);
        
        // ===== Split (බෙදීම) =====
        String[] words = trimmed.split(" ");
        System.out.println("\n=== Split into words ===");
        for (String word : words) {
            System.out.println(word);
        }
        
        // ===== Join (එකතු කිරීම) =====
        String joined = String.join("-", words);
        System.out.println("Joined with '-': " + joined);
        
        // ===== Check contains (අඩංගුද?) =====
        System.out.println("Contains 'Java'? " + trimmed.contains("Java"));
        System.out.println("Starts with 'Hello'? " + trimmed.startsWith("Hello"));
        System.out.println("Ends with '!'? " + trimmed.endsWith("!"));
        
        // ===== CharAt (නිශ්චිත ස්ථානයේ අකුර) =====
        System.out.println("Character at index 0: " + trimmed.charAt(0));
        System.out.println("Character at index 7: " + trimmed.charAt(7));
        
        // ===== StringBuilder (Efficient string manipulation) =====
        System.out.println("\n=== StringBuilder ===");
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, ",");
        sb.replace(6, 11, "Java");
        sb.delete(11, 12);
        System.out.println("StringBuilder result: " + sb.toString());
        System.out.println("Reverse: " + sb.reverse().toString());
    }
}