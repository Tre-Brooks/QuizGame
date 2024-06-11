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
		
		
		
		
		
		
		
		frame.setVisible(true);
		
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
