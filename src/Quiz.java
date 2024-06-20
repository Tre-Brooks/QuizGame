import java.awt.event.*;
import java.awt.*;
import javax.swing.*;


public class Quiz implements ActionListener {
	
	String [] questions = {
			
	"Which company created Java?" , "Which year was Java created?" , "What was Java orginally called?" , "Who is credited with creating java"
							};
	
	String [][] options = {
			{"Sun Microsystems" , "Starbucks" , "Microsoft" , "Alphabet"},
			{"1989" , "1996" , "1972" , "1492"},
			{"Apple" , "John" , "Cliff" , "Kotlin"},
			{"Jobs" , "Steve Jobs" , "Bill Gates" , "James Gosling"}
						  };
	
	char [] answers = {
				'A',
				'B', 
				'C'
	};
	
	char guess;
	char answer;
	int index;
	int correct = 0;
	int totalques = questions.length;
	int result;
	int seconds = 10;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel answerLabelA = new JLabel();
	JLabel answerLabelB = new JLabel();
	JLabel answerLabelC = new JLabel();
	JLabel answerLabelD = new JLabel();
	JLabel time = new JLabel();
	JLabel remainingSec = new JLabel();
	JTextField numRight = new JTextField();
	JTextField percentage = new JTextField();
	
	public Quiz() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color(50,50,50));
		frame.setLayout(null);
		frame.setResizable(false);
		
		textfield.setBounds(0,0,650,50);
		textfield.setBackground(Color.white);
		textfield.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Ink Free", Font.PLAIN,29));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
		
		textarea.setBounds(0,50,650,50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(Color.blue);
		textarea.setForeground(new Color(25,255,0));
		textfield.setFont(new Font("Ink Free", Font.PLAIN,29));
		textfield.setBorder(BorderFactory.createBevelBorder(1));	
		textfield.setEditable(false);
		
		buttonA.setBounds(0,100,100,100);
		buttonA.setFont(new Font("MV Boli" , Font.BOLD,35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,200,100,100);
		buttonB.setFont(new Font("MV Boli" , Font.BOLD,35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,300,100,100);
		buttonC.setFont(new Font("MV Boli" , Font.BOLD,35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,400,100,100);
		buttonD.setFont(new Font("MV Boli" , Font.BOLD,35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
		answerLabelA.setBounds(125,100,500,100);
		answerLabelA.setBackground(new Color(50,50,50));
		answerLabelA.setForeground(new Color(25,155,0));
		answerLabelA.setFont(new Font("MV Boli" , Font.PLAIN , 35));
		
		
		answerLabelB.setBounds(125,200,500,100);
		answerLabelB.setBackground(new Color(50,50,50));
		answerLabelB.setForeground(new Color(25,155,0));
		answerLabelB.setFont(new Font("MV Boli" , Font.PLAIN , 35));
		
		answerLabelC.setBounds(125,300,500,100);
		answerLabelC.setBackground(new Color(50,50,50));
		answerLabelC.setForeground(new Color(25,155,0));
		answerLabelC.setFont(new Font("MV Boli" , Font.PLAIN , 35));
		
		answerLabelD.setBounds(125,400,500,100);
		answerLabelD.setBackground(new Color(50,50,50));
		answerLabelD.setForeground(new Color(25,155,0));
		answerLabelD.setFont(new Font("MV Boli" , Font.PLAIN , 35));
		
		remainingSec.setBounds(535,510,100,100);
		remainingSec.setBackground(new Color(25,25,25));
		remainingSec.setForeground(new Color(255,0,0));
		remainingSec.setFont(new Font("Ink Free" , Font.BOLD,60));
		remainingSec.setBorder(BorderFactory.createBevelBorder(1));
		remainingSec.setOpaque(true);
		remainingSec.setHorizontalAlignment(JTextField.CENTER);
		remainingSec.setText(String.valueOf(seconds));
		
		numRight.setBounds(225, 225, 200, 100);
		numRight.setForeground(new Color(25,25,25));
		numRight.setBackground( new Color(25,255, 0));
		numRight.setFont(new Font("Ink Free" , Font.BOLD, 50));
		numRight.setBorder(BorderFactory.createBevelBorder(1));
		numRight.setHorizontalAlignment(JTextField.CENTER);
		numRight.setEditable(false);
		
		
		percentage.setBounds(225,325, 200,100);
		percentage.setBackground( new Color(25,25, 25));
		percentage.setForeground(new Color(25,255,0));
		percentage.setFont(new Font("Ink Free" , Font.BOLD, 50));
		percentage.setBorder(BorderFactory.createBevelBorder(1));
		percentage.setHorizontalAlignment(JTextField.CENTER);
		percentage.setEditable(false);
		
	
		frame.add(numRight);
		frame.add(percentage);
		frame.add(remainingSec);
		frame.add(answerLabelA);
		frame.add(answerLabelB);
		frame.add(answerLabelC);
		frame.add(answerLabelD);
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		frame.add(textarea);
		frame.add(textfield);
		frame.setVisible(true);
		
		nextQuestion();
		
	}
	
	public void nextQuestion() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void displayAnswer() {
		
	}
	
	public void results() {
		
	}

}
