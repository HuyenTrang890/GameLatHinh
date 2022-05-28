package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;

public class HighScore extends JFrame {

	private JPanel contentPane;
	private JTextField firstScore;
	private JTextField secondScore;
	private JTextField thirdScore;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HighScore frame = new HighScore();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HighScore() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTittleName = new JLabel("\u0110i\u1EC3m cao");
		lbTittleName.setFont(new Font("Tahoma", Font.BOLD, 14));
		lbTittleName.setBounds(10, 11, 414, 26);
		contentPane.add(lbTittleName);
		
		JPanel pnHighScore = new JPanel();
		pnHighScore.setBounds(10, 48, 424, 202);
		contentPane.add(pnHighScore);
		pnHighScore.setLayout(null);
		
		secondScore = new JTextField();
		secondScore.setBounds(78, 33, 86, 20);
		pnHighScore.add(secondScore);
		secondScore.setColumns(10);
		
		firstScore = new JTextField();
		firstScore.setBounds(78, 2, 86, 20);
		pnHighScore.add(firstScore);
		firstScore.setColumns(10);
		
		thirdScore = new JTextField();
		thirdScore.setBounds(78, 64, 86, 20);
		pnHighScore.add(thirdScore);
		thirdScore.setColumns(10);
		
		JLabel lbFirst = new JLabel("Top 1:");
		lbFirst.setBounds(10, 5, 46, 14);
		pnHighScore.add(lbFirst);
		
		JLabel lbSecond = new JLabel("Top 2:");
		lbSecond.setBounds(10, 30, 46, 14);
		pnHighScore.add(lbSecond);
		
		JLabel lbThird = new JLabel("Top 3:");
		lbThird.setBounds(10, 55, 46, 14);
		pnHighScore.add(lbThird);
	}
}
