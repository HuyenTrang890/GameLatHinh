package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class StartScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartScreen frame = new StartScreen();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StartScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbTitile = new JLabel("     Matching Game");
		lbTitile.setForeground(new Color(255, 0, 0));
		lbTitile.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitile.setFont(new Font("Broadway", Font.PLAIN, 55));
		lbTitile.setBounds(10, 0, 964, 84);
		contentPane.add(lbTitile);
		
		JButton btnHighScore = new JButton("HighScore");
		btnHighScore.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnHighScore.setHorizontalAlignment(SwingConstants.LEFT);
		btnHighScore.setForeground(new Color(0, 0, 128));
		btnHighScore.setFont(new Font("Dialog", Font.BOLD, 34));
		btnHighScore.setBounds(61, 209, 227, 51);
		
		clearBtn(btnHighScore);
		
		contentPane.add(btnHighScore);
		
		JButton btnStart = new JButton("Start");
		btnStart.setHorizontalAlignment(SwingConstants.LEFT);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnStart.setForeground(new Color(0, 0, 128));
		btnStart.setFont(new Font("Dialog", Font.BOLD, 34));
		btnStart.setBounds(61, 144, 227, 54);
		
		clearBtn(btnStart);
		
		contentPane.add(btnStart);
		
		JButton btnSetting = new JButton("Setting");
		btnSetting.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSetting.setHorizontalAlignment(SwingConstants.LEFT);
		btnSetting.setForeground(new Color(0, 0, 128));
		btnSetting.setFont(new Font("Dialog", Font.BOLD, 34));
		btnSetting.setBounds(61, 271, 227, 58);
		
		clearBtn(btnSetting);
		
		contentPane.add(btnSetting);
		
		JButton btnHelp = new JButton("Help");
		btnHelp.setHorizontalAlignment(SwingConstants.LEFT);
		btnHelp.setForeground(new Color(0, 0, 128));
		btnHelp.setFont(new Font("Dialog", Font.BOLD, 34));
		btnHelp.setBounds(61, 343, 227, 58);
		
		clearBtn(btnHelp);
		
		contentPane.add(btnHelp);
		
		JLabel lbBackGround = new JLabel();
		Image image= new ImageIcon(getClass().getResource("/icon/" + 7 + ".png")).getImage();
		Icon icon = new ImageIcon(image.getScaledInstance(1000, 750, image.SCALE_SMOOTH));
		lbBackGround.setIcon(icon);
		
		lbBackGround.setIcon(icon);
		lbBackGround.setBounds(35, 11, 978, 744);
		contentPane.add(lbBackGround);
		
		
	
	}
	//Chỉnh button trong suốt
	public JButton clearBtn (JButton btn) {
		btn.setBorderPainted (false);
		btn.setContentAreaFilled (false);
		btn.setFocusPainted (false);
		return btn;
	}
}
