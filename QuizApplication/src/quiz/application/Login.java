package quiz.application;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.*;

public class Login extends JFrame implements ActionListener{

	JButton rules,back;
	JTextField tfname;
	
	Login(){
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
//		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
//		JLabel image=new JLabel(i1);
//		image.setBounds(0,0,600,500);
//		add(image);
		
		JLabel heading=new JLabel("Java Quiz");
		heading.setBounds(400,60,300,45);
		heading.setFont(new Font("viner Hand ITC",Font.BOLD,40));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel name=new JLabel("Enter Your Name");
		name.setBounds(450,150,300,15);
		name.setFont(new Font("Mongolian Baiti",Font.BOLD,20));
		name.setForeground(new Color(30,144,254));
		add(name);
		
		tfname=new JTextField();
		tfname.setBounds(380,200,285,25);
		tfname.setFont(new Font("Times New Roman",Font.BOLD,20));
		add(tfname);
		
		rules=new JButton("Rules");
		rules.setBounds(380,270,120,25);
		rules.setBackground(new Color(30,144,254));
		rules.setForeground(Color.WHITE);
		rules.addActionListener(this);
		add(rules);
		
		back=new JButton("Back");
		back.setBounds(545,270,120,25);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);

		
		setSize(1120,500);
		setLocation(200,150);	
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==rules) {
			String name=tfname.getText();
			setVisible(false);
			new Rules(name);	
		}else if(ae.getSource()==back){
			setVisible(false);
		}
	}
	public static void main(String[] args) {
		new Login();
	}
}
