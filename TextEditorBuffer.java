class TextEditorBuffer {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Hello");

        // Append text
        sb.append(" World");

        // Insert text at specific position
        sb.insert(5, " Java");

        // Reverse the string
        sb.reverse();

        System.out.println("Final string: " + sb);
    }
}