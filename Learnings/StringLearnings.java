package Learnings;

public class StringLearnings {
    public static void main(String[] args) {/*

        // ===== CORE STRING OPERATIONS =====
// 1. REPLACEMENT
        str.replace("old", "new");       // Replace all substrings
        str.replace('a', 'b');           // Replace all chars
        str = str.replaceFirst("old", "new"); // Replace first occurrence only

// 2. CHECKING CONTENT
        str.contains("sub");            // Contains substring (case-sensitive)
        str.equalsIgnoreCase("OTHER");  // Case-insensitive equality
        str.startsWith("prefix");       // Check beginning
        str.endsWith("suffix");         // Check ending
        str.matches("regex");           // Regex pattern match (anchored)

// 3. CASE HANDLING
        str.toLowerCase();              // Convert to lowercase
        str.toUpperCase();              // Convert to uppercase
        str = Character.toUpperCase(str.charAt(0)) + str.substring(1); // Capitalize first letter

// 4. WHITESPACE CONTROL
        str.trim();                     // Trim spaces (Java 1+)
        str.strip();                    // Trim all whitespace (Java 11+)
        str.stripLeading();             // Trim left side (Java 11+)
        str.stripTrailing();            // Trim right side (Java 11+)
        str.isBlank();                  // Check if empty/whitespace (Java 11+)

// 5. SUBSTRING OPERATIONS
        str.substring(2,5);            // Extract between indexes
        str.charAt(0);                 // Get first character
        str.indexOf("sub");            // Find first position
        str.lastIndexOf("sub");        // Find last position

// 6. SPLITTING/CONCATENATION
        str.split(",");                // Split into array
        String.join("-", "A", "B");    // Join with delimiter
        str.concat(" suffix");         // Concatenate strings
        str.repeat(3);                 // Repeat string (Java 11+)

// 7. TYPE CONVERSION
        Integer.parseInt(str);         // String to int
        Double.parseDouble(str);       // String to double
        String.valueOf(123);           // Any type to String

// ===== 10 ESSENTIAL REGEX PATTERNS =====
// Use with .matches() or .replaceAll()
        "\\d"                         // Digit (0-9)
        "\\D"                         // Non-digit
        "\\w"                         // Word char (a-z,A-Z,0-9,_)
        "\\W"                         // Non-word char
        "\\s"                         // Whitespace
        "\\S"                         // Non-whitespace
        "[abc]"                       // Any of a/b/c
        "[^abc]"                      // Not a/b/c
        "^Start"                      // Beginning of string
        "End$"                        // End of string
        "a+"                          // One or more 'a's
        "a{2,4}"                      // 2 to 4 'a's

// ===== PRO TIPS =====
// 1. For null-safe operations:
        if (str != null && !str.isEmpty()) {...}

// 2. For multi-replace chains:
        str.replace("foo","bar").replace("old","new");

// 3. For efficient building:
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(" ").append("World");
        String result = sb.toString();

// 4. Regex cheat modes:
        Pattern.compile("regex", Pattern.CASE_INSENSITIVE); // Case-insensitive regex
    */}
}
