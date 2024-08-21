package Com.Form.Project;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MyWindow extends JFrame {

	private JLabel heading;

	Font font = new Font("", Font.BOLD, 30);

	private JPanel mainPanel;
	private JLabel nameLabel, passwordLable;
	private JTextField nameTextFeild;
	private JPasswordField passwordFeild;
	private JButton button1, button2;
	

	public MyWindow() {
		super.setTitle("My first form");
		super.setSize(600, 600);
		super.setLocation(100, 100);
		super.setVisible(true);
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.createGUI();
		System.out.println("Creating form");
	}

	public void createGUI() {

		//  This Method create our GUI
		this.setLayout(new BorderLayout());

		heading = new JLabel("My first form");
		heading.setFont(font);
		heading.setHorizontalAlignment(JLabel.CENTER);
		this.add(heading, BorderLayout.NORTH);
		
		//Working with jPanel
		mainPanel= new JPanel();
		//Setting layout of main panel
		mainPanel.setLayout(new GridLayout(3,2));
		
		nameLabel = new JLabel("Enter name:");
		nameLabel.setFont(font);
		
		passwordLable = new JLabel("Enter Password");
		passwordLable.setFont(font);
		
		nameTextFeild = new JTextField();
		nameTextFeild.setFont(font);
		
		passwordFeild = new JPasswordField();
		passwordFeild.setFont(font);
		
		button1 = new JButton("Submit");
		button1.setFont(font);
		
		button2 = new JButton("Reset");
		button2.setFont(font);
		
		mainPanel.add(nameLabel);
		mainPanel.add(nameTextFeild);
		
		mainPanel.add(passwordLable);
		mainPanel.add(passwordFeild);
		
		mainPanel.add(button1);
		mainPanel.add(button2);
		
		this.add(mainPanel,BorderLayout.CENTER);		
		
		
		
		
		
		
		
		
		
		
	}
}
