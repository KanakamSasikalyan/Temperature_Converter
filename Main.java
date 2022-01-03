import java.lang.*;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import java.awt.Color;
import java.awt.Dimension;

public class Main{
	public void fToC() {
		JFrame frame = new JFrame("Temperature Converter");
		JLabel l1,l2;
		
		//image icon
		ImageIcon img = new ImageIcon("C:\\Users\\Lenovo\\Pictures\\images\\html2.png");
		
		//Labels created
		l1 = new JLabel("Farenheit");
		l1.setBounds(40,85,130,30);
		l1.setFont(new Font("consolas", Font.BOLD, 25));
		//l1.setBackground(Color.WHITE);
		l1.setForeground(Color.white);
		//l1.setOpaque(true);
		
		
		l2 = new JLabel("Celcius");
		l2.setMaximumSize(new Dimension(150, 100));
		l2.setFont(new Font("consolas", Font.BOLD, 25));
		//l2.setBackground(Color.WHITE);
		l2.setBounds(50,180,100,30);
		l2.setForeground(new Color(153,204,255));
		//l2.setOpaque(true);
		
		//text feilds
		JTextField t1;
		final JTextField t2;
		t1 = new JTextField();
		t1.setBounds(200,80,120,40);
		t1.setFont(new Font("Consolas", Font.BOLD, 16));
		t2 = new JTextField();
		t2.setBounds(200,175,120,40);
		t2.setFont(new Font("Consolas", Font.BOLD, 16));
				
		//button to convert the temp
		JButton btn1;
		btn1 = new JButton("Convert");
		btn1.setForeground(new Color(51,51,255));
		btn1.setBackground(Color.green);
		btn1.setBounds(125,270,95,40);
		
		//Action listener 
		btn1.addActionListener(new ActionListener(){  
		public void actionPerformed(ActionEvent e){  
			String str = t1.getText();
			if(str.isEmpty())
				t2.setText("NULL");
				double farenheit = Double.parseDouble(str);
				double celcius = (farenheit-32)*(0.5556);
				String res = String.valueOf(celcius);
				t2.setText(res);
			}  
		});  
		frame.add(l1);
		frame.add(l2);
				
		frame.add(t1);
		frame.add(t2);
				
		frame.add(btn1);
				
		frame.setIconImage(img.getImage());
		frame.getContentPane().setBackground(new Color(153,51,255));
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);

	}
	public void cTof(Converter obj) {
		JFrame frame = new JFrame("Temperature Converter");
		JLabel l1,l2;
		
		//image icon
		ImageIcon img = new ImageIcon("C:\\Users\\Lenovo\\Pictures\\images\\html2.png");
		
		//Labels created
		l1 = new JLabel("Celcius");
		l1.setBounds(50,85,100,30);
		l1.setFont(new Font("consolas", Font.BOLD, 25));
		//l1.setBackground(Color.WHITE);
		l1.setForeground(Color.white);
		//l1.setOpaque(true);
		
		
		l2 = new JLabel("Farenheit");
		l2.setMaximumSize(new Dimension(150, 100));
		l2.setFont(new Font("consolas", Font.BOLD, 25));
		//l2.setBackground(Color.WHITE);
		l2.setBounds(40,180,130,30);
		l2.setForeground(new Color(153,204,255));
		//l2.setOpaque(true);

		
		//text feilds
		JTextField t1;
		final JTextField t2;
		t1 = new JTextField();
		t1.setBounds(200,80,120,40);
		t1.setFont(new Font("Consolas", Font.BOLD, 16));
		t2 = new JTextField();
		t2.setBounds(200,175,120,40);
		t2.setFont(new Font("Consolas", Font.BOLD, 16));
		
		//button to convert the temp
		JButton btn1,secWindow;
		btn1 = new JButton("Convert");
		btn1.setForeground(new Color(51,51,255));
		btn1.setBackground(Color.cyan);
		btn1.setBounds(125,270,95,40);
		
		//secWindow
		secWindow = new JButton("▶");
		secWindow.setSize(10,10);
		secWindow.setBounds(329,2,55,25);
		
		//secWindow Action Listner
		secWindow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				obj.fToC();
			}
		});
		
		//Action listener 
		btn1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				String str = t1.getText();
				if(str.isEmpty())
					t2.setText("NULL");
				double celcius = Double.parseDouble(str);
				double farenheit = (1.8*celcius)+32;
				String res = String.valueOf(farenheit);
				t2.setText(res);
			}  
		});  
		frame.add(l1);
		frame.add(l2);
		
		frame.add(t1);
		frame.add(t2);
		
		frame.add(btn1);
		frame.add(secWindow);
		
		frame.setIconImage(img.getImage());
		frame.getContentPane().setBackground(new Color(153,51,255));
		frame.setSize(400,400);
		frame.setLayout(null);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.cTof(obj);
	}
}
