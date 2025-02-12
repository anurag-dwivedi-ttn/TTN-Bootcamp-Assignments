import java.util.Optional;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("Hi ".repeat(3));
        System.out.println("\u2003Hello\u2003".strip());
        System.out.println("\u2003Hello\u2003".trim());
        System.out.println("   ".isBlank());
        System.out.println("Hello".indent(4));
        System.out.println(Optional.of("hello").map(String::toUpperCase));
        System.out.println("   Line1\n   Line2".stripIndent());
        System.out.println("Hello\\nWorld".translateEscapes());
        System.out.println("""
            This is a triple-quoted string
            """);
        System.out.println("My name is %s.".formatted("Anurag"));
    }
}

// Explanation

/*
repeat(n) → Repeats the string n times ("Hi " → "Hi Hi Hi ").
strip() → Removes spaces from both ends (better than trim() for Unicode spaces).
trim() → Removes leading and trailing spaces (older method).
isBlank() → Returns true if the string is empty or only whitespace.
indent(n) → Adds or removes indentation (adds 4 spaces in "Hello" → " Hello").
transform(Function) → Applies a function (toUpperCase()) to modify the string.
stripIndent() → Removes unnecessary indentation from multi-line strings.
translateEscapes() → Converts escape sequences ("\\n" → "\n").
Triple-quoted string (""") → Allows multi-line strings (like Python’s """ syntax).
formatted() → Works like String.format() ("%s" gets replaced with "Anurag").
*/
