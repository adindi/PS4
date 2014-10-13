package CalcGUI;

import java.awt.EventQueue;

import CalcEngine.CalcEngine;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class CalcGUI {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcGUI window = new CalcGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalcGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblInitialInvestment = new JLabel("Initial Investment...");
		lblInitialInvestment.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInitialInvestment.setBounds(41, 40, 127, 17);
		frame.getContentPane().add(lblInitialInvestment);
		
		JLabel lblYears = new JLabel("Years...");
		lblYears.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYears.setBounds(41, 68, 87, 17);
		frame.getContentPane().add(lblYears);
		
		JLabel lblAnnualInterestRate = new JLabel("Annual Interest Rate...");
		lblAnnualInterestRate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAnnualInterestRate.setBounds(41, 96, 142, 17);
		frame.getContentPane().add(lblAnnualInterestRate);
		
		JLabel lblFutureValue = new JLabel("Future Value...");
		lblFutureValue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFutureValue.setBounds(41, 124, 113, 17);
		frame.getContentPane().add(lblFutureValue);
		
		textField = new JTextField();
		textField.setBounds(275, 40, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(275, 68, 86, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(275, 96, 86, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setBounds(275, 124, 86, 20);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
			double initialValue = Double.parseDouble(textField.getText());
			double Years = Double.parseDouble(textField_1.getText());
			double annualInterestRate = Double.parseDouble(textField_2.getText());
			CalcEngine proto = new CalcEngine();
			double Total = proto.returnCalcEngine(initialValue, annualInterestRate, Years);
		    double TotalRnd = Math.round(Total*100.0)/100.0;
			textField_3.setText("$" + TotalRnd);
		
		}
	});
		
		btnCalculate.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCalculate.setBounds(248, 184, 113, 29);
		frame.getContentPane().add(btnCalculate);
		
		}
}
