import java.awt.*;
import java.awt.event.*;
import javax.swing.*; // Needed for ActionListener

class DogYears2 extends JFrame {
    private static final int DOG_YEARS_PER_HUMAN_YEAR = 7;
    private JTextField _humanYearsTF = new JTextField(3);
    private JTextField _dogYearsTF = new JTextField(3);

    public DogYears2() {
        JButton convertBtn = new JButton("Convert");
        convertBtn.addActionListener(new ConvertBtnListener());
        _dogYearsTF.addActionListener(new ConvertBtnListener()); // Allows pressing Enter to convert
        _humanYearsTF.setEditable(false);

        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Dog Years"));
        content.add(_dogYearsTF);
        content.add(convertBtn);
        content.add(new JLabel("Human Years"));
        content.add(_humanYearsTF);
        setContentPane(content);

        // Window attributes
        pack();
        setTitle("Dog Year Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center window
    }

    class ConvertBtnListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                String dyStr = _dogYearsTF.getText();
                int dogYears = Integer.parseInt(dyStr);
                int humanYears = dogYears * DOG_YEARS_PER_HUMAN_YEAR;
                _humanYearsTF.setText("" + humanYears);
            } catch (NumberFormatException ex) {
                _humanYearsTF.setText("Invalid!");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new DogYears2().setVisible(true);
        });
    }
}
