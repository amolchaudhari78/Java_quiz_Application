package quiz.application;

import java.awt.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class Score extends JFrame implements ActionListener{

	Score(String name,int score){

		setBounds(400,150,800,550);
		getContentPane().setBackground(Color.WHITE);
		setLayout(null);
		
//		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
//		JLabel image=new JLabel(i1);
//		image.setBounds(0,200,300,392);
//		add(image);

		JLabel heading=new JLabel("Thankyou "+ name +" for playing Java Quiz");
		heading.setBounds(80,30,700,30);
		heading.setFont(new Font("viner Hand ITC",Font.PLAIN,25));
		heading.setForeground(Color.RED);
		add(heading);
		
		
		JLabel lblscore=new JLabel("Your score is "+score);
		lblscore.setBounds(330,200,300,30);
		lblscore.setFont(new Font("Tahoma",Font.PLAIN,20));
		add(lblscore);
		
		JButton submit=new JButton("Play Again");
        submit.setBounds(340,270,120,30);
        submit.setBackground(new Color(30,144,255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		setVisible(false);
		new Login();
	}
	
	public static void main(String[] args) {
		new Score("user",0);

	}
}
