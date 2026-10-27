import module java.desktop;

void style(JButton b, Color bg) {
    b.setFont(new Font("SansSerif", Font.BOLD, 24));
    b.setBackground(bg);
    b.setForeground(Color.WHITE);
    b.setOpaque(true);          // needed on Mac for colours to show
    b.setBorderPainted(false);  // needed on Mac for colours to show
}

void addDigit(String digit, JTextField display, JPanel buttons) {
    JButton b = new JButton(digit);
    style(b, new Color(60, 60, 60));
    b.addActionListener(e -> display.setText(display.getText() + digit));
    buttons.add(b);
}

void main() {
    JFrame frame = new JFrame("Calculator");
    frame.setSize(300, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    // Display
    JTextField display = new JTextField();
    display.setEditable(false);
    display.setFont(new Font("SansSerif", Font.BOLD, 36));
    display.setHorizontalAlignment(JTextField.RIGHT);
    display.setBackground(Color.BLACK);
    display.setForeground(Color.WHITE);
    display.setBorder(BorderFactory.createEmptyBorder(20, 10, 20, 10));
    frame.add(display, BorderLayout.NORTH);

    // Button grid
    JPanel buttons = new JPanel(new GridLayout(4, 3, 5, 5));
    buttons.setBackground(Color.BLACK);
    buttons.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

    addDigit("1", display, buttons);
    addDigit("2", display, buttons);
    addDigit("3", display, buttons);
    addDigit("4", display, buttons);
    addDigit("5", display, buttons);
    addDigit("6", display, buttons);
    addDigit("7", display, buttons);
    addDigit("8", display, buttons);
    addDigit("9", display, buttons);

    JButton clear = new JButton("C");
    style(clear, new Color(165, 165, 165));
    clear.setForeground(Color.BLACK);
    clear.addActionListener(e -> display.setText(""));
    buttons.add(clear);

    addDigit("0", display, buttons);

    frame.add(buttons, BorderLayout.CENTER);
    frame.setVisible(true);
}
