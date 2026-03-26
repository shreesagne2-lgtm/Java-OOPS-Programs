class TextProcessingBuilder {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Welcome");

        // Append additional text
        sb.append(" to Java Programming");

        // Display modified string
        System.out.println("Modified string: " + sb);
    }
}

/*
Difference between StringBuilder and StringBuffer:

1. StringBuffer is thread-safe (synchronized), so it is slower.
2. StringBuilder is not thread-safe (not synchronized), so it is faster.
3. Use StringBuffer in multi-threaded environments.
4. Use StringBuilder in single-threaded environments for better performance.
*/