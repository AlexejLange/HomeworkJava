package collections;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwingCollections extends JFrame {

    private final String TITLE = "Collections";
    private final int CANVAS_WIDTH = 800;
    private final int CANVAS_HEIGHT = 350;

    List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        new SwingCollections();
    }

    public SwingCollections() {
        setTitle(TITLE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Canvas canvas = new Canvas();
        canvas.setBackground(Color.white);
        canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new BoxLayout(btnPanel, BoxLayout.X_AXIS));

        JTextField valueField = new JTextField();
        JTextField indexField = new JTextField();
        JButton addButton = new JButton("Add");
        JButton getButton = new JButton("Get");
        JButton setButton = new JButton("Set");
        JButton removeButton = new JButton("Remove");
        JLabel resultLabel = new JLabel(" Result ");
        btnPanel.add(new JLabel(" Value: "));
        btnPanel.add(valueField);
        btnPanel.add(addButton);
        btnPanel.add(new JLabel(" Index: "));
        btnPanel.add(indexField);
        btnPanel.add(getButton);
        btnPanel.add(setButton);
        btnPanel.add(removeButton);
        btnPanel.add(resultLabel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!valueField.getText().trim().isEmpty()) {
                    String[] values = valueField.getText().split(" ");
                    stringList.addAll(Arrays.asList(values));
                    resultLabel.setText(" Result: Success ");
                    canvas.repaint();
                }
            }
        });

        getButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx = Integer.parseInt(indexField.getText());
                String result = stringList.get(idx);
                valueField.setText(result);
                resultLabel.setText(String.format(" Result: %s ", result));
            }
        });

        setButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!valueField.getText().trim().isEmpty()) {
                    int idx = Integer.parseInt(indexField.getText());
                    stringList.set(idx, valueField.getText());
                    resultLabel.setText(" Result: Success ");
                    canvas.repaint();
                }
            }
        });

        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int idx = Integer.parseInt(indexField.getText());
                String result = stringList.remove(idx);
                resultLabel.setText(String.format(" Result: %s ", result));
                canvas.repaint();
            }
        });

        add(canvas, BorderLayout.CENTER);
        add(BorderLayout.SOUTH, btnPanel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void drawString(Graphics g, String str, int x, int y, float fontSize) {
        Font defaultFont = g.getFont();
        g.setFont(defaultFont.deriveFont(defaultFont.getSize() * fontSize));
        g.drawString(str, x, y);
        g.setFont(defaultFont);
    }

    private class Canvas extends JPanel {
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            int dx = 0;
            for (int i = 0; i < stringList.size(); i++) {
                dx += 50;
                int dy = (CANVAS_HEIGHT - 50) / 2;
                g.drawRect(dx, dy, 50, 50);
                drawString(g, String.valueOf(i), dx + 3, dy + 12, 1);
                drawString(g, stringList.get(i), dx + 15, dy + 40, 3);
            }
        }
    }
}
