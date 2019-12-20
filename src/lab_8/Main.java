package lab_8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.io.StringWriter;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 600);

        JLabel divider = new JLabel("divided by");
        JLabel resultLabel = new JLabel();

        JTextArea error = new JTextArea();
        Font font = new Font("Open Sans", Font.PLAIN, 12);
        error.setFont(font);
        error.setForeground(Color.RED);

        final JScrollPane scroll = new JScrollPane(error);
        JTextField text_field1 = new JTextField(5);
        JTextField text_field2 = new JTextField(5);
        JButton equals = new JButton("equals");
        JButton reset = new JButton("Reset Numbers");

        JPanel panel = new JPanel();
        panel.add(text_field1);
        panel.add(divider);
        panel.add(text_field2);
        panel.add(equals);
        panel.add(resultLabel);
        panel.add(reset);
        panel.setBackground(Color.BLUE);

        equals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Integer first_nr = Integer.valueOf(text_field1.getText());
                    String divisor = text_field2.getText();
                    if ("13".equals(divisor)) {
                        throw new UnluckyException();
                    }
                    Integer second_nr = Integer.valueOf(divisor);
                    String result = String.valueOf(first_nr / second_nr);
                    resultLabel.setText(result);
                } catch (NumberFormatException | ArithmeticException | UnluckyException t) {
                    Main.displayError(t, error, scroll);
                }
            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                text_field1.setText("");
                text_field2.setText("");
                error.setText("");
                resultLabel.setText("");
            }
        });

        frame.getContentPane().add(BorderLayout.NORTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, scroll);
        frame.setVisible(true);
    }

    private static void displayError(Throwable error, JTextArea jTextArea, JScrollPane scroll) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        error.printStackTrace(printWriter);
        jTextArea.setText(stringWriter.toString());

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                scroll.getVerticalScrollBar().setValue(0);
            }
        });
    }

    static class UnluckyException extends Exception {
        public UnluckyException(){
            super("UnluckyException: divisor value = 13");
        }
    }
}

