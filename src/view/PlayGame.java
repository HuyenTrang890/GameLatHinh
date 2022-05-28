package view;

import java.awt.EventQueue;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.border.LineBorder;

import model.ButtonEvent;

public class PlayGame extends JFrame {
	private ButtonEvent graphicsPanel;
	private int row = 4;
	private int col = 4;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayGame frame = new PlayGame();
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
	public PlayGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel pnPlayArea = new JPanel();
		pnPlayArea.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnPlayArea.setBounds(10, 49,358,228);
		pnPlayArea.add(createGraphicsPanel());
		contentPane.add(pnPlayArea);
		
		JButton btnPause = new JButton("Pause");
		btnPause.setBounds(398, 49, 76, 23);
		btnPause.setBackground(Color.orange);
		contentPane.add(btnPause);
		
		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(398, 83, 76, 23);
		btnQuit.setBackground(Color.orange);
		contentPane.add(btnQuit);
		
		JProgressBar time = new JProgressBar();
		time.setBounds(10, 11, 464, 14);
		contentPane.add(time);
	}
	 public JPanel createGraphicsPanel() {
		graphicsPanel = new ButtonEvent(row, col);
		JPanel panel = new JPanel(new GridBagLayout());
		panel.setBackground(Color.gray);
		panel.add(graphicsPanel);
		return panel;
	}
}
