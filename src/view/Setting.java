package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.SwingConstants;

public class Setting extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Setting frame = new Setting();
					frame.setVisible(true);
					frame.setResizable(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Setting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
	
		
		JRadioButton radioBtnYes = new JRadioButton("Yes");
		radioBtnYes.setSelected(true);
		radioBtnYes.setForeground(new Color(0, 0, 0));
		radioBtnYes.setFont(new Font("VNI-Ariston", Font.PLAIN, 18));
		radioBtnYes.setBounds(170, 96, 107, 29);
		contentPane.add(radioBtnYes);
		
		JRadioButton radioBtnNo = new JRadioButton("No");
		radioBtnNo.setForeground(new Color(0, 0, 0));
		radioBtnNo.setFont(new Font("VNI-Ariston", Font.PLAIN, 18));
		radioBtnNo.setBounds(302, 96, 87, 29);
		contentPane.add(radioBtnNo);
		
		JLabel lbTitle = new JLabel("   Setting");
		lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbTitle.setFont(new Font("VNI-Ariston", Font.PLAIN, 25));
		lbTitle.setBounds(10, 16, 414, 51);
		contentPane.add(lbTitle);
		
		JLabel lbBackGround = new JLabel("");
		lbBackGround.setBounds(20, 74, 87, 80);
		contentPane.add(lbBackGround);
		Image image= new ImageIcon(getClass().getResource("/icon/" + 6 + ".png")).getImage();
		Icon icon = new ImageIcon(image.getScaledInstance(80, 80, image.SCALE_SMOOTH));
		lbBackGround.setIcon(icon);
		
		
	}
}
