void main() {
    while (true) {
        String word = IO.readln("Enter a word (or type quit to exit): ");

        if (word.equalsIgnoreCase("quit")) {
            break;
        }

        String reverse = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        if (reverse.equals(word)) {
            IO.println("This is a palindrome");
        } else {
            IO.println("This is not a palindrome");
        }
        IO.println(word + " " + reverse);
    }
}
