package Learnings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringLearnings {
    public static void main(String[] args) {
        char[] arr={'g','0'};
        String tryn=new String(arr);
        System.out.println(tryn);
//        String input="-1,-2,-3,-4";
//        String[] arr=input.split(",");
//        int a=Integer.valueOf(arr[0]);
//        System.out.println(a);
//        int a=5;
//        StringBuilder sb=new StringBuilder();
//        sb.append(a);
//        sb.append(3);
//        System.out.println(sb);
//        Scanner sc=new Scanner(System.in);
////        char c=0+'a';
//        System.out.println(c);


//        String word="you";
//        StringBuilder ans=new StringBuilder(word.substring(1,3)).reverse();
//        String tryd=word.repeat(2);
//        System.out.println(tryd);


//        char c='1';
//        System.out.println((char)((c-'0') + 96));


       /* *//**//*String s="hellk";
        boolean ans=s.contains('h');
//        char c='o';
        StringBuilder sb=new StringBuilder(s);

        sb.replace(0,1,"2");
        System.out.println(sb);*/
//        System.out.println(s.contains("k"));
//        s=s.replace("he","lllllllll");
//        s=s.replace('l',c);
//        System.out.println(s);
    }
}
/*

        // ===== CORE STRING OPERATIONS =====
// 1. REPLACEMENT
        str.replace("old", "new");       // Replace all substrings
        str.replace('a', 'b');           // Replace all chars
        str = str.replaceFirst("old", "new"); // Replace first occurrence only
        str= str.repeat(3) //the string will repeat thrice and stored

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
    */
/*
* // ===== STRINGBUILDER CHEAT SHEET =====

// 1. CREATION
StringBuilder sb = new StringBuilder();      // Empty (16-char capacity)
StringBuilder sb = new StringBuilder(100);   // Pre-sized
StringBuilder sb = new StringBuilder("Hi");  // From string

// 2. MODIFICATION
sb.append("!");             // Add to end → "Hi!"
sb.insert(2, " Java");      // Insert at index → "Hi Java!"
sb.delete(3, 7);            // Remove 3-6 → "Hi!"
sb.deleteCharAt(2);         // Remove char → "H!"
sb.replace(0, 1, "h");      // Replace range → "h!"
sb.reverse();               // Reverse → "!h"
sb.setCharAt(1, 'i');       // Set char → "!i"
sb.setLength(0);            // Clear (keeps capacity)

// 3. INSPECTION
char c = sb.charAt(0);      // Get char → '!'
int len = sb.length();      // Get length → 2
int idx = sb.indexOf("i");  // Find position → 1
String s = sb.toString();   // Convert to String → "!i"

// 4. CAPACITY (OPTIMIZATION)
int cap = sb.capacity();    // Current capacity (e.g., 16)
sb.ensureCapacity(100);     // Expand capacity
sb.trimToSize();            // Reduce to fit content

// ===== PRO TIPS =====
// 1. Chain operations:
sb.append("A").append("B").reverse();

// 2. Pre-size for large builds:
StringBuilder big = new StringBuilder(10_000);

// 3. NEVER do this in loops:
//    String s = ""; s += "x"; // SLOW!
//    Use StringBuilder instead.

// 4. Thread-safe alternative: StringBuffer
//    (Same API but slower due to synchronization)
* */
