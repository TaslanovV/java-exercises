void main() {
    while (true) {
        String firstInput = IO.readln("Enter a number or 'quit' to exit: ").trim();
        if (firstInput.equalsIgnoreCase("quit")) {
            break;
        }

        double firstNumber;
        try {
            firstNumber = Double.parseDouble(firstInput);
        } catch (NumberFormatException exception) {
            IO.println("Invalid number, try again.");
            continue;
        }

        String operator = IO.readln("Enter an operator (+, -, *, /, %): ").trim();
        if (!operator.equals("+") && !operator.equals("-")
                && !operator.equals("*") && !operator.equals("/")
                && !operator.equals("%")) {
            IO.println("Invalid operator, try again.");
            continue;
        }

        String secondInput = IO.readln("Enter another number: ").trim();
        double secondNumber;
        try {
            secondNumber = Double.parseDouble(secondInput);
        } catch (NumberFormatException exception) {
            IO.println("Invalid number, try again.");
            continue;
        }

        if ((operator.equals("/") || operator.equals("%")) && secondNumber == 0) {
            IO.println("Cannot divide by zero, try again.");
            continue;
        }

        double result;
        if (operator.equals("+")) {
            result = firstNumber + secondNumber;
        } else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        } else if (operator.equals("*")) {
            result = firstNumber * secondNumber;
        } else if (operator.equals("/")) {
            result = firstNumber / secondNumber;
        } else {
            result = firstNumber % secondNumber;
        }

        IO.println("Result: " + result);
    }

    IO.println("Calculator closed.");
}
