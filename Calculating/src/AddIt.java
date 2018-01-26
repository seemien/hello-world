
/*Seemien Ahmed
 * Assignment 4
 * Create a Calculator Using Swing that would perform basic operations
 * like addition,subtraction,multiplication and addition
 * Use Expression Solver created in assignment 3 to run on the calculator
 *  
 */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * GUI for totaling a series of numbers.
 */
public class AddIt extends JFrame implements ActionListener {
	public static final int WIDTH = 400;
	public static final int HEIGHT = 500;
	private JTextField inOutField;
	private JLabel answerLabel;
	private JPanel buttonPanel;
	private double sum = 0;
	private double answer = 0;
	private String num1 = " ";

	public AddIt() {
		super();
		try {
			setTitle("SEEMIEN's CALCULATOR");
			addWindowListener(new WindowDestroyer());
			setSize(WIDTH, HEIGHT);
			Container contentPane = getContentPane();
			contentPane.setLayout(new FlowLayout());
			buttonPanel = new JPanel();
			buttonPanel.setBackground(Color.LIGHT_GRAY);
			buttonPanel.setLayout(new GridLayout(5, 3));
			JPanel textPanel = new JPanel();
			textPanel.setBackground(Color.GRAY);
			textPanel.setLayout(new FlowLayout());
			inOutField = new JTextField(25);
			inOutField.setBackground(Color.WHITE);
			textPanel.add(inOutField);
			contentPane.add(textPanel, BorderLayout.NORTH);
			JButton op0 = new JButton("0");
			op0.setPreferredSize(new Dimension(75, 75));
			op0.addActionListener(this);
			buttonPanel.add(op0);
			JButton op1 = new JButton("1");
			op1.setPreferredSize(new Dimension(75, 75));
			op1.addActionListener(this);
			buttonPanel.add(op1);
			JButton op2 = new JButton("2");
			op2.setPreferredSize(new Dimension(75, 75));
			op2.addActionListener(this);
			buttonPanel.add(op2);
			JButton op3 = new JButton("3");
			op3.setPreferredSize(new Dimension(75, 75));
			op3.addActionListener(this);
			buttonPanel.add(op3);
			JButton op4 = new JButton("4");
			op4.setPreferredSize(new Dimension(75, 75));
			op4.addActionListener(this);
			buttonPanel.add(op4);
			JButton op5 = new JButton("5");
			op5.setPreferredSize(new Dimension(75, 75));
			op5.addActionListener(this);
			buttonPanel.add(op5);
			JButton op6 = new JButton("6");
			op6.setPreferredSize(new Dimension(75, 75));
			op6.addActionListener(this);
			buttonPanel.add(op6);
			JButton op7 = new JButton("7");
			op7.setPreferredSize(new Dimension(75, 75));
			op7.addActionListener(this);
			buttonPanel.add(op7);
			JButton op8 = new JButton("8");
			op8.setPreferredSize(new Dimension(75, 75));
			op8.addActionListener(this);
			buttonPanel.add(op8);
			JButton op9 = new JButton("9");
			op9.setPreferredSize(new Dimension(75, 75));
			op9.addActionListener(this);
			buttonPanel.add(op9);
			JButton addButton = new JButton("+");
			addButton.setPreferredSize(new Dimension(75, 75));
			addButton.addActionListener(this);
			buttonPanel.add(addButton);
			JButton minusButton = new JButton("-");
			minusButton.setPreferredSize(new Dimension(75, 75));
			minusButton.addActionListener(this);
			buttonPanel.add(minusButton);
			JButton mulButton = new JButton("*");
			mulButton.setPreferredSize(new Dimension(75, 75));
			mulButton.addActionListener(this);
			buttonPanel.add(mulButton);
			JButton divButton = new JButton("/");
			divButton.setPreferredSize(new Dimension(75, 75));
			divButton.addActionListener(this);
			buttonPanel.add(divButton);
			JButton rParenButton = new JButton("(");
			rParenButton.setPreferredSize(new Dimension(75, 75));
			rParenButton.addActionListener(this);
			buttonPanel.add(rParenButton);
			JButton lParenButton = new JButton(")");
			lParenButton.setPreferredSize(new Dimension(75, 75));
			lParenButton.addActionListener(this);
			buttonPanel.add(lParenButton);
			JButton resetButton = new JButton("Reset");
			resetButton.setPreferredSize(new Dimension(75, 75));
			resetButton.addActionListener(this);
			buttonPanel.add(resetButton);

			JButton submitButton = new JButton("Enter");
			submitButton.setPreferredSize(new Dimension(75, 75));
			submitButton.addActionListener(this);
			buttonPanel.add(submitButton);

			answerLabel = new JLabel();
			answerLabel.setPreferredSize(new Dimension(25, 25));
			textPanel.add(answerLabel);

			contentPane.add(buttonPanel, BorderLayout.SOUTH);
		}

		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void actionPerformed(ActionEvent e) {
		try {
			if (e.getActionCommand().equals("1")) {
				inOutField.setText(inOutField.getText() + "1");
			} else if (e.getActionCommand().equals("2")) {
				inOutField.setText(inOutField.getText() + "2");
			} else if (e.getActionCommand().equals("3")) {
				inOutField.setText(inOutField.getText() + "3");
			} else if (e.getActionCommand().equals("4")) {
				inOutField.setText(inOutField.getText() + "4");
			} else if (e.getActionCommand().equals("5")) {
				inOutField.setText(inOutField.getText() + "5");
			} else if (e.getActionCommand().equals("6")) {
				inOutField.setText(inOutField.getText() + "6");
			} else if (e.getActionCommand().equals("7")) {
				inOutField.setText(inOutField.getText() + "7");
			} else if (e.getActionCommand().equals("8")) {
				inOutField.setText(inOutField.getText() + "8");
			} else if (e.getActionCommand().equals("9")) {
				inOutField.setText(inOutField.getText() + "9");
			} else if (e.getActionCommand().equals("0")) {
				inOutField.setText(inOutField.getText() + "0");
			} else if (e.getActionCommand().equals("+")) {
				inOutField.setText(inOutField.getText() + "+");
			} else if (e.getActionCommand().equals("-")) {
				inOutField.setText(inOutField.getText() + "-");
			} else if (e.getActionCommand().equals("/")) {
				inOutField.setText(inOutField.getText() + "/");
			} else if (e.getActionCommand().equals("*")) {
				inOutField.setText(inOutField.getText() + "*");
			} else if (e.getActionCommand().equals("(")) {
				inOutField.setText(inOutField.getText() + "(");
			} else if (e.getActionCommand().equals(")")) {
				inOutField.setText(inOutField.getText() + ")");
			} else if (e.getActionCommand().equals("Reset")) {
				sum = 0;
				inOutField.setText("");
				answerLabel.setText("");
			}

			else if (e.getActionCommand().equals("Enter")) {
				String text = inOutField.getText();
				System.out.println(text);
				if (!expression.hasParen(text)) {
					answer = expression.solve(text);
					inOutField.setText(Double.toString(answer));
				} else {
					answer = expression.evalParen(text);

					inOutField.setText(Double.toString(answer));
				}
			}

			else {
				inOutField.setText("Error in adder code.");
			}

			System.out.println(e.getActionCommand());
		} catch (Exception e1) {
			System.out.println(e1.getMessage());
		}
	}

	private static double stringToDouble(String stringObject) {
		return Double.parseDouble(stringObject.trim());
	}

	public static void main(String[] args) {
		AddIt guiAdder = new AddIt();
		guiAdder.setVisible(true);
	}
}
