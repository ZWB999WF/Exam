package exam;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Color;

import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class FinishExam extends JFrame {

	private JPanel contentPane;
    public String login_id="140401046";
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
					FinishExam frame = new FinishExam();
					frame.setVisible(true);
				    
	}
	/**
	 * Create the frame.
	 */
	public FinishExam() {
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 100, 651, 578);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		new Thread(){
			 public void run(){
				try {
					sleep(3000);
					Grade_view gde=new Grade_view(login_id);
					gde.setVisible(true);
					System.out.println(login_id+"finishesam");
					System.out.println(gde.login_id+"1111111");
				    dispose();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}.start();
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.LIGHT_GRAY);
		textArea.setEditable(false);
		textArea.setBorder(null);
		textArea.setFont(new Font("¿¬Ìå", Font.PLAIN, 99));
		textArea.setText("  \r\n  \u8003\u8BD5\u7ED3\u675F\r\n\u5373\u5C06\u6253\u5370\u6210\u7EE9");
		textArea.setForeground(Color.RED);
		textArea.setLineWrap(true);
		contentPane.add(textArea, BorderLayout.CENTER);
		
	}

}
