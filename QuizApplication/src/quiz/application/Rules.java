package quiz.application;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Rules extends JFrame implements ActionListener{

	String name;
	JButton start,back;
	
	Rules(String name){
		this.name=name;
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
		JLabel heading=new JLabel(" Welocome "+name+" to Java Quiz");
		heading.setBounds(50,20,700,30);
		heading.setFont(new Font("viner Hand ITC",Font.BOLD,30));
		heading.setForeground(new Color(30,144,254));
		add(heading);
		
		JLabel rules=new JLabel();
		rules.setBounds(20,90,700,350);
		rules.setFont(new Font("Tahoma",Font.PLAIN,16));
		rules.setText(
	         "<html>"+ 
			     "1. Each question in the quiz is of multiple-choice or true or false format. " + "<br><br>" +
			     "2. Read each question carefully, and click on the button next to your response that is based on the information covered on the topic in the module." + "<br><br>" +
			     "3. After responding to a question, click on the Next Question button at the bottom to go to the next questino." + "<br><br>" +
			     "4. After responding to the 10th question, click on Submit to exit the quiz." + "<br><br>" +
			     "5. If you select an incorrect response for a question, you can try again until you get the correct response." + "<br><br>" +
			     "6. If you retake the quiz, the questions and their respective responses will be randomized." + "<br><br>" +
			     "7. The total score for the quiz is based on your responses to all questions." + "<br><br>" +
			     
			  "<html>"
		);
		add(rules);
		
		back=new JButton("Back");
		back.setBounds(250,500,100,30);
		back.setBackground(new Color(30,144,254));
		back.setForeground(Color.WHITE);
		back.addActionListener(this);
		add(back);
		
		start=new JButton("Start");
		start.setBounds(400,500,120,30);
		start.setBackground(new Color(30,144,254));
		start.setForeground(Color.WHITE);
		start.addActionListener(this);
		add(start);
			
		setSize(800,650);
		setLocation(350,100);	
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==start) {
			setVisible(false);
			new Quiz(name);
		}else{
			setVisible(false);
			new Login();
		}
	}
	public static void main(String[] args) {
		new Rules("user");

	}
}
