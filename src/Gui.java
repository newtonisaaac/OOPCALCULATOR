import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui extends JFrame{
	private JTextField answerfield;
	private JButton reset,seven,eight,nine,four,five,six,one,two,three,zero,decimal,add,sub,div,multiply,equals,del;
	private String stemp1,stemp2,sanswer;
	private double answer=0.0;
	private JPanel contentPanel;
	private JLabel lab1, lab2, lab3, lab4, lab5, lab6, lab7, lab8;
	private boolean equalsClicked = false, opChosen = false;
	char operation = ' ';
	
	public Gui() {
		super("CALCULATOR");
		
		answerfield = new JTextField(null, 35);
		answerfield.setEditable(false);
		
		lab2 = new JLabel (" ");
		reset = new JButton ("reset");
		lab6 = new JLabel(" ");
		seven = new JButton("7");
		eight = new JButton("8");
		lab3 = new JLabel (" ");
		nine = new JButton("9");
		four = new JButton("4");
		five = new JButton("5");
		lab4 = new JLabel (" ");
		six = new JButton("6");
		one = new JButton("1");
		two = new JButton("2");
		three = new JButton("3");
		lab7 = new JLabel (" ");
		zero = new JButton("0");
		decimal = new JButton (".");
		add = new JButton("+");
		sub = new JButton("-");
		lab1 = new JLabel (" ");
		div = new JButton("/");
		multiply = new JButton("*");
		lab5 = new JLabel (" ");
		equals = new JButton("=");
		del = new JButton("DEL");
		lab8 = new JLabel (" ");
		lab1 = new JLabel(" ");
		
		
		
		Dimension dim = new Dimension(60, 35);
		
		answerfield.setPreferredSize(new Dimension(20, 35));
		lab2.setPreferredSize(new Dimension(320, 25));
		reset.setPreferredSize(new Dimension(75, 35));
		lab6.setPreferredSize(new Dimension(450,25));
		seven.setPreferredSize(dim);
		eight.setPreferredSize(dim);
		lab3.setPreferredSize(new Dimension(50,25));
		nine.setPreferredSize(dim);
		four.setPreferredSize(dim);
		five.setPreferredSize(dim);
		lab4.setPreferredSize(new Dimension(50,25));
		six.setPreferredSize(dim);
		one.setPreferredSize(dim);
		two.setPreferredSize(dim);
		three.setPreferredSize(dim);
		lab7.setPreferredSize(new Dimension(180, 25));
		zero.setPreferredSize(dim);
		decimal.setPreferredSize(dim);
		add.setPreferredSize(dim);
		sub.setPreferredSize(dim);
		lab1.setPreferredSize(new Dimension(227, 25));
		div.setPreferredSize(dim);
		multiply.setPreferredSize(dim);
		lab5.setPreferredSize(new Dimension(75,25));
		equals.setPreferredSize(dim);
		del.setPreferredSize(dim);
		lab8.setPreferredSize(new Dimension(100,25));
		
		Numbers n = new Numbers();
		Calc c = new Calc();
		
		seven.addActionListener(n);
		eight.addActionListener(n);
		nine.addActionListener(n);
		four.addActionListener(n);
		five.addActionListener(n);
		six.addActionListener(n);
		one.addActionListener(n);
		two.addActionListener(n);
		three.addActionListener(n);
		zero.addActionListener(n);
		decimal.addActionListener(n);
		del.addActionListener(n);
		
		reset.addActionListener(c);add.addActionListener(c);sub.addActionListener(c);div.addActionListener(c);multiply.addActionListener(c);
		equals.addActionListener(c);
		
		
		
		contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setLayout(new FlowLayout());
		
		contentPanel.add(answerfield, BorderLayout.NORTH);
		contentPanel.add(lab2);
		contentPanel.add(reset);
		contentPanel.add(lab6);
		contentPanel.add(seven);
		contentPanel.add(eight);
		contentPanel.add(nine);
		contentPanel.add(add);
		contentPanel.add(sub);
		contentPanel.add(lab3);
		contentPanel.add(four);
		contentPanel.add(five);
		contentPanel.add(six);
		contentPanel.add(multiply);
		contentPanel.add(div);
		contentPanel.add(lab4);
		contentPanel.add(one);
		contentPanel.add(two);
		contentPanel.add(three);
		contentPanel.add(lab7);
		contentPanel.add(zero);
		contentPanel.add(decimal);
		contentPanel.add(lab5);
		contentPanel.add(equals);
		contentPanel.add(del);
		contentPanel.add(lab8);

		this.setContentPane(contentPanel);
	}
	
	private class Numbers implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			if(src.equals(seven)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="7";
					}else {
						stemp1 = stemp1 + "7";
					}
				}else {
					if(stemp2==null) {
						stemp2="7";
					}else {
						stemp2 = stemp2 + "7";
					}
				}
			}
			
			if(src.equals(eight)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="8";
					}else {
						stemp1 = stemp1 + "8";
					}
				}else {
					if(stemp2==null) {
						stemp2="8";
					}else {
						stemp2 = stemp2 + "8";
					}
				}
			}
			if(src.equals(nine)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="9";
					}else {
						stemp1 = stemp1 + "9";
					}
				}else {
					if(stemp2==null) {
						stemp2="9";
					}else {
						stemp2 = stemp2 + "9";
					}
				}
			}
			if(src.equals(four)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="4";
					}else {
						stemp1 = stemp1 + "4";
					}
				}else {
					if(stemp2==null) {
						stemp2="4";
					}else {
						stemp2 = stemp2 + "4";
					}
				}
			}
			if(src.equals(five)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="5";
					}else {
						stemp1 = stemp1 + "5";
					}
				}else {
					if(stemp2==null) {
						stemp2="5";
					}else {
						stemp2 = stemp2 + "5";
					}
				}
			}
			if(src.equals(six)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="6";
					}else {
						stemp1 = stemp1 + "6";
					}
				}else {
					if(stemp2==null) {
						stemp2="6";
					}else {
						stemp2 = stemp2 + "6";
					}
				}
			}
			if(src.equals(one)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="1";
					}else {
						stemp1 = stemp1 + "1";
					}
				}else {
					if(stemp2==null) {
						stemp2="1";
					}else {
						stemp2 = stemp2 + "1";
					}
				}
			}
			if(src.equals(two)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="2";
					}else {
						stemp1 = stemp1 + "2";
					}
				}else {
					if(stemp2==null) {
						stemp2="2";
					}else {
						stemp2 = stemp2 + "2";
					}
				}
			}
			if(src.equals(three)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="3";
					}else {
						stemp1 = stemp1 + "3";
					}
				}else {
					if(stemp2==null) {
						stemp2="3";
					}else {
						stemp2 = stemp2 + "3";
					}
				}
			}
			if(src.equals(zero)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="0";
					}else {
						stemp1 = stemp1 + "0";
					}
				}else {
					if(stemp2==null) {
						stemp2="0";
					}else {
						stemp2 = stemp2 + "0";
					}
				}
			}
			
			if(src.equals(decimal)) {
				if(opChosen==false) {
					if(stemp1==null) {
						stemp1="0.";
					}else {
						if(stemp1 != null) {
							if(stemp1.contains(".")) {
								System.out.println("You have a decimal point!");
							}else {
								stemp1 +=".";
							}
						
					}
				}
				}else {
					if(stemp2==null) {
						stemp2="0.";
					}else {
						if(stemp2 != null) {
							if(stemp2.contains(".")) {
								System.out.println("You have a decimal point silleh!");
							}else {
								stemp2 +=".";
							}
						}
					
					}
				}
			}
			
			if(src.equals(del)) {
				if(opChosen == false) {
					if(stemp1 == null) {
						System.out.println("CANNOT DELETE!");
					}else {
						stemp1 = stemp1.substring(0, stemp1.length()-1);
					}
				}else {
					if(stemp2==null) {
						System.out.println("CANNOT DELETE!");
					}else {
						stemp2 = stemp2.substring(0, stemp1.length()-1);
					}
				}
			}
			
			if(equalsClicked==false) {
				if(opChosen==false) {
					answerfield.setText(stemp1);
				}else {
					answerfield.setText(stemp2);
				}
			}
			
	}
	}
	
	private class Calc implements ActionListener{
		public void actionPerformed(ActionEvent event){
			JButton src = (JButton) event.getSource();
			
			if(src.equals(add)) {
				if(stemp1==null) {
					System.out.println("Choose your numbers first");
				}else
					if(stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '+';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Two operations only");
							
						}
			}
			
			if(src.equals(sub)) {
				if(stemp1==null) {
					System.out.println("Choose your numbers first");
				}else
					if(stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '-';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Two operations only");
							
						}
			}
			
			
			if(src.equals(div)) {
				if(stemp1==null) {
					System.out.println("Choose your numbers first");
				}else
					if(stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '/';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Two operations only");
							
						}
			}
			
			if(src.equals(multiply)) {
				if(stemp1==null) {
					System.out.println("Choose your numbers first");
				}else
					if(stemp1 != null && stemp2 == null) {
						opChosen = true;
						operation = '*';
					}else
						if(stemp1 != null && stemp2 != null) {
							System.out.println("Two operations only");
							
						}
			}
			
			if(src.equals(equals)) {
				if(stemp1==null) {
					System.out.println("Choose your numbers first");
				}else
					if(stemp1 != null && stemp2 == null) {
						System.out.println("Choose BOTH numbers first");
					}
				if(stemp1 != null && stemp2 != null) {
					double d1 = 0.0, d2 = 0.0;
					
					d1 = Double.parseDouble(stemp1);
					d2 = Double.parseDouble(stemp2);
					
					switch(operation) {
					case '+':
						answer = d1 + d2;
						break;
					case'-':
						answer = d1 - d2;
						break;
					case'/':
						answer = d1 / d2;
						break;
					case'*':
						answer = d1 * d2;
						break;
					}
					
					sanswer = Double.toString(answer);
					answerfield.setText(sanswer);
					if(operation == '/' && d2 == 0.0) {
						answerfield.setText("ERROR");
					}
				}
			}
			
			if(src.equals(reset)) {
				stemp1 = null;
				stemp2 = null;
				equalsClicked = false;
				opChosen = false;
				operation = ' ';
				answerfield.setText(null);
				sanswer = null;
				
			}
			
		}
	
	}
}
	



