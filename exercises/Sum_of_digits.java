void main() {
    while (true) {
        String input = IO.readln("Enter the digits (space to quit): ");

        if (input.equals(" ")) {
            break;
        }

        String text = String.valueOf(Integer.parseInt(input));
        int sum = 0;

        for (int i = 0; i < text.length(); i++) {
            int add = Character.getNumericValue(text.charAt(i));
            sum = sum + add;
        }

        IO.println("The sum of the digits: " + sum);

    }
}
